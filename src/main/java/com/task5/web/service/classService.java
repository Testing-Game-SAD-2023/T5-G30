package com.task5.web.service;
import com.task5.web.model.classmodel;
import com.task5.web.repository.classRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class classService {

    @Autowired
    private classRepository ClassRepository;

    
    public List<classmodel> getAllClasses() {
        return ClassRepository.findAll();
    }
    
    public Optional<classmodel> getClassById(int id) {
        return ClassRepository.findById(id);
          // Il metodo findById(id) è un metodo nell'interfaccia JpaRepository. 
          // Prende un id come parametro e restituisce un oggetto Optional. 
          // L'oggetto Optional può contenere un valore o essere vuoto. 
           //Se l'id viene trovato nel database, il metodo restituirà un oggetto ClassModel. 
           //Se l'id non viene trovato nel database, il metodo restituirà un oggetto opzionale vuoto.
    }
}

