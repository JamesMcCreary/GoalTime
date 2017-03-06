package com.goaltime.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "TASK_LIST")
public class Task {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "GOAL")
    private String goal;

    @Column(name = "PRIORITY")
    private int priority;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "START_TIME")
    private DateTime startTime;

    @Column(name = "END_TIME")
    private DateTime endTime;

    @Column(name = "ARCHIVED")
    private Boolean archived;

    @Column(name = "USERNAME")
    private String userName;

    public Task() {
        super();
    }

    public Task(Long id, String name, String description, String goal, int priority, String status, DateTime startTime,
            DateTime endTime, Boolean archived, String userName) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.goal = goal;
        this.priority = priority;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
        this.archived = archived;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
