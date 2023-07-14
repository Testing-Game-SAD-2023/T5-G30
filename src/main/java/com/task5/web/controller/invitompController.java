package com.task5.web.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inviti")
@CrossOrigin
public class invitompController {
    @Autowired
    private invitompService invitompservice;

    @PostMapping("/aggiungi")
    public ResponseEntity<String> aggiungiInvito(@RequestBody Invito invito) {
        invitompservice.salvaInvito(invito);
        return ResponseEntity.status(HttpStatus.CREATED).body("Nuovo invito aggiunto");
    }

    @GetMapping("/lista")
    public List<Invito> elencoInviti() {
        return invitompservice.getInviti();
    }

    @GetMapping("/in_attesa/{destinatarioId}")
    public ResponseEntity<List<Map<String, Object>>> invitiInAttesa(@PathVariable Long destinatarioId) {
        List<Invito> inviti = invitompservice.getInvitiInAttesa(destinatarioId);

        List<Map<String, Object>> risultato = new ArrayList<>();
        for (Invito invito : inviti) {
            Map<String, Object> dettagliInvito = new HashMap<>();
            dettagliInvito.put("id", invito.getId());
            dettagliInvito.put("mittente", invito.getMittente());
            dettagliInvito.put("destinatario", invito.getDestinatario());
            dettagliInvito.put("stato", invito.getStato());
            risultato.add(dettagliInvito);
        }

        return ResponseEntity.ok().body(risultato);
    }


    @PutMapping("/accetta/{invitoId}")
public ResponseEntity<Map<String, Object>> accettaInvito(@PathVariable Long invitoId) {
    invitompservice.accettaInvito(invitoId);

    Map<String, Object> response = new HashMap<>();
    response.put("message", "Invito accettato");

    return ResponseEntity.ok(response);
}

    @DeleteMapping("/rifiuta/{invitoId}")
    public ResponseEntity<Map<String, Object>> rifiutaInvito(@PathVariable Long invitoId) {
        invitompservice.rifiutaInvito(invitoId);
    
        Map<String, Object> response = new HashMap<>();

        return ResponseEntity.ok(response); return ResponseEntity.status(HttpStatus.CREATED).body("Invito rifiutato");
    }
    