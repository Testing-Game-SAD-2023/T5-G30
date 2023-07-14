package com.task5.web.service;
import com.task5.web.model.invitompmodel;
import com.task5.web.repository.invitompRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class invitompService {

    @Autowired
    private invitompRepository InvitompRepository;

    public List<invitompmodel> getAllInvitomps() {
        return InvitompRepository.findAll();
    }

    public invitompmodel addInvitomp(invitompmodel invitompModel) {
        return InvitompRepository.save(invitompModel);
   }

    public invitompmodel updateInvitomp(invitompmodel invitompModel) {
        return InvitompRepository.save(invitompModel);
    }

    public void deleteInvitomp(@PathVariable String idinvito) {
        InvitompRepository.deleteById(idinvito);
    }
}