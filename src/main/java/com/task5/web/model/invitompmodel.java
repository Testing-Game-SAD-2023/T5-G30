package com.task5.web.model;

public class invitompmodel {
    private String idinvito;
    private matchmodel match;
    private boolean accepted;
    
    public invitompmodel() {
    }

    public String getIdinvito() {
        return idinvito;
    }
    public void setIdinvito(String idinvito) {
        this.idinvito = idinvito;
    }
    public matchmodel getMatch() {
        return match;
    }
    public void setMatch(matchmodel match) {
        this.match = match;
    }
    public boolean isAccepted() {
        return accepted;
    }
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    



    
}
