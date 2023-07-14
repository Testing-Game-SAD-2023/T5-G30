package com.task5.web.repository;
import com.task5.web.model.robotmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface robotRepository extends JpaRepository<robotmodel, String> {
}