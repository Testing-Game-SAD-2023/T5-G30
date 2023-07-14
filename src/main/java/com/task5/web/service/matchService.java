package com.task5.web.service;
import com.task5.web.model.matchmodel;
import com.task5.web.repository.matchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class matchService {

    @Autowired
    private matchRepository MatchRepository;

    public List<matchmodel> getAllMatches() {
        return MatchRepository.findAll();
    }

    public matchmodel getMatchById(@PathVariable String idMatch) {
        return MatchRepository.findById(idMatch).orElse(null);
    }

    public matchmodel createMatch(matchmodel matchModel) {
        return MatchRepository.save(matchModel);
    }

    public matchmodel salvaMatch(matchmodel matchModel) {
        return MatchRepository.save(matchModel);
    }

    public void deleteMatch(@PathVariable String idMatch) {
        MatchRepository.deleteById(idMatch);
    }

    
}