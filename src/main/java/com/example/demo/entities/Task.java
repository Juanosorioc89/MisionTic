package com.example.demo.entities;

import javax.persistence.*;
import javax.websocket.ClientEndpoint;
import java.time.LocalDate;
@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column(name="description")
    private String description;
    @Column(name="done")
    private boolean done;
    @Column(name="dueDate")
    private LocalDate dueDate;

    public Task(){
    }

    public Task(String description, boolean done, LocalDate dueDate){
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
