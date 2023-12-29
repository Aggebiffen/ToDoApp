package se.lexicon.Data.impl;

import se.lexicon.model.ToDoItemTask;

import java.util.Collection;

public interface ToDoItemTaskDAOImpl {

    public ToDoItemTask persist (ToDoItemTask toDoItemTask);
    public ToDoItemTask findById(int id);
    public Collection<ToDoItemTask> findAll();
    public Collection<ToDoItemTask> findByAssignedStatus(boolean status);
    public Collection<ToDoItemTask> findByPersonId(int id);
    public void remove(int id);
}
