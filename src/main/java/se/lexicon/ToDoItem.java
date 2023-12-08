package se.lexicon;

import java.time.LocalDate;

public class ToDoItem {
    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public ToDoItem(String title, String taskDescription,LocalDate deadLine,Person creator, int id) {
       setTaskDescription(taskDescription);
       setCreator(creator);
       setTitle(title);
       setId(id);
       setDeadLine(deadLine);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("title was null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
    public String getTaskInfo(){
        return "{ " + title + "Task description: " + taskDescription + "Person: "+ creator + "id:" + id;
    }
}