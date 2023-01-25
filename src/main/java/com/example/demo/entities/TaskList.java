package com.example.demo.entities;

import com.example.demo.entities.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private String name;
    private List<Task> taskList;

    public TaskList(String name){
        this.setName(name);
        this.taskList = new ArrayList<Task>();
    }

    public void addTask(Task task){
        this.getTaskList().add(task);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTaskList() {
        return taskList;
    }


}
