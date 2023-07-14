package com.task5.web.model;

import javax.persistence.Entity;

@Entity
public class robotmodel {
    public String robotname;

    public robotmodel(String robotname) {
        this.robotname = robotname;
    }

    public robotmodel() {
    }

    public String getRobotname() {
        return robotname;
    }

    public void setRobotname(String robotname) {
        this.robotname = robotname;
    }
}
