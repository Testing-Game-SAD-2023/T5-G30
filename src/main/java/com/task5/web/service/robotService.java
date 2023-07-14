package com.task5.web.service;
import com.task5.web.model.robotmodel;
import com.task5.web.repository.robotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class robotService {

    @Autowired
    private robotRepository RobotRepository;

    
    public List<robotmodel> getAllRobot() {
        return RobotRepository.findAll();
    }
    
    public Optional<robotmodel> getRobotById(String robotname) {
        return RobotRepository.findById(robotname);
          // Il metodo findById(id) è un metodo nell'interfaccia JpaRepository. 
          // Prende un id come parametro e restituisce un oggetto Optional. 
          // L'oggetto Optional può contenere un valore o essere vuoto. 
           //Se l'id viene trovato nel database, il metodo restituirà un oggetto ClassModel. 
           //Se l'id non viene trovato nel database, il metodo restituirà un oggetto opzionale vuoto.
    }
}

