package com.task5.web.repository;
import com.task5.web.model.matchmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface matchRepository extends JpaRepository<matchmodel, String> {
}