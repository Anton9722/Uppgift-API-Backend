package com.UppgiftApiBackend.UppgiftApiBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class meals {
    @Id
    private int id;
    private String comment;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    

}
