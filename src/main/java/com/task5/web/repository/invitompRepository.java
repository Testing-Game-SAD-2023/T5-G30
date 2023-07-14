package com.task5.web.repository;
import com.task5.web.model.invitompmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface invitompRepository extends JpaRepository<invitompmodel, String> {
}