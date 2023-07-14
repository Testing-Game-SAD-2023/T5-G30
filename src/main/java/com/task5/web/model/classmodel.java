package com.task5.web.model;

public class classmodel {
   public int id_Class;
   public String descClass;

public classmodel() {
}

public classmodel(int id_Class,  String descClass) {
    this.id_Class = id_Class;
    this.descClass = descClass;
}

public int getId_Class() {
    return id_Class;
}

public void setId_Class(int id_Class) {
    this.id_Class = id_Class;
}


public String getDescClass() {
    return descClass;
}
public void setDescClass(String descClass) {
    this.descClass = descClass;
}

}
