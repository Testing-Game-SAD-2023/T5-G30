package com.task5.web.controller;
import com.task5.web.service.classService;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.task5.web.model.classmodel;

@RestController
@RequestMapping(path = "/classes")

public class classController {
    
    @Autowired
    private classService ClassService;
    
    @GetMapping("/getAll")
    public List<classmodel> getAllClasses() {
        return ClassService.getAllClasses();
    }

    @GetMapping("/chooseclass/{id_Class}")
    public Optional <classmodel> getClassById(@PathVariable int id_Class) {
        return ClassService.getClassById(id_Class);
       
    }

  
  @PostMapping("/saveclass")
  public void saveClass(@RequestBody Map<String, String> payload) {
    String className = payload.get("className");
    // Esegui l'azione di salvataggio qui, ad esempio salvando il nome della classe nel database
    System.out.println("Classe salvata: " + className);
  }



}
