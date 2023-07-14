package com.task5.web.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
import jakarta.persistence.Column;
import jakarta.persistence.Table;

 
@Entity
@Table(name="MATCH")
public class matchmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idMatch;
 
    @Column(name = "idUser")
    private int idUser;
    @Column(name = "robot")
    public String robot;
    @Column(name = "classe")
    public int classe;
    @Column(name = "mode")
    public String mode;
   
    
    public matchmodel(String idMatch, int idUser, String robot, int classe, String mode) {
        this.idMatch = idMatch;
        this.idUser = idUser;
        this.robot = robot;
        this.classe = classe;
        this.mode = mode;
    }


    public matchmodel() {
    }


    public String getIdMatch() {
        return idMatch;
    }


    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }


    public int getIdUser() {
        return idUser;
    }


    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }


    public String getRobot() {
        return robot;
    }


    public void setRobot(String robot) {
        this.robot = robot;
    }


    public int getClasse() {
        return classe;
    }


    public void setClasse(int classe) {
        this.classe = classe;
    }


    public String getMode() {
        return mode;
    }


    public void setMode(String mode) {
        this.mode = mode;
    }
}