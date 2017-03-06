package com.goaltime.dao;

import java.util.List;

import com.goaltime.domain.Task;

public interface TaskDao {

    Task getTaskById(int id);

    List<Task> getTasks(String userName);

    //List<Task> getTasks(String userName);

    void addTask();
    void updateTask(Task task);
}
