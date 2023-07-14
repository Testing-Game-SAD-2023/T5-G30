package com.task5.web.controller;
import com.task5.web.service.matchService;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.task5.web.model.matchmodel;

@RestController
@RequestMapping(path = "/match")

public class matchController {

    @Autowired
    private matchService MatchService;

    @GetMapping("/getAll")
    public List<matchmodel> getAllMatches() {
        return MatchService.getAllMatches();
    }

    @GetMapping("/{idMatch}")
    public matchmodel getMatchById(@PathVariable String idMatch) {
        return MatchService.getMatchById(idMatch);
    } 

    @PostMapping("/new")
    public matchmodel createMatch(@RequestBody matchmodel matchModel) {
        matchModel.setIdMatch(UUID.randomUUID().toString());
        matchModel.setIdUser(matchModel.getIdUser());
        matchModel.setRobot(matchModel.getRobot());
        matchModel.setClasse(matchModel.getClasse());
        matchModel.setMode(matchModel.getMode());

        return MatchService.createMatch(matchModel);
    }

     @DeleteMapping("/{idMatch}")
    public void deleteMatch(@PathVariable String idMatch) {
        MatchService.deleteMatch(idMatch);
    }

    
    @PutMapping("/{idMatch}")
    public matchmodel salvaMatch(@PathVariable String idMatch, @RequestBody matchmodel matchModel) {
        return MatchService.salvaMatch(matchModel);
    }
    
    
}
