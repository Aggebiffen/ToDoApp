package se.lexicon;

import java.time.LocalDate;

public class ToDoItem {
    private int id;
    String title;
    String taskDescription;
    public LocalDate deadLine = LocalDate.parse("2023-12-11");
    boolean done;
    boolean overDue;
    Person creator;
    public ToDoItem (int id, String title, String taskDescription, LocalDate deadLine, boolean done,Person creator, boolean overDue){
        setId(id);
        setTitle(title);
        setTaskDescription(taskDescription);
        setDeadLine(deadLine);
        setDone(done);
        setCreator(creator);

    }
        public int getId () {
            return id;
        }

        public void setId (int id){
        this.id = id;
        }

        public String getTitle () {
            return title;
        }

        public void setTitle (String title){
            this.title = title;
        }

        public String getTaskDescription () {
            return taskDescription;
        }

        public void setTaskDescription (String taskDescription){
            this.taskDescription = taskDescription;
        }

    public LocalDate getDeadline() {
        // Declare and initialize the variables
        LocalDate done = LocalDate.parse("2023-12-11");
        LocalDate isOverdue = LocalDate.parse("2023-12-13");
        // Use parentheses, equals() method, and return statements
        if (deadLine.equals(LocalDate.parse("2023-12-11"))) {
            return done;
        } else if (deadLine.equals(LocalDate.parse("2023-12-12"))) {
            return isOverdue;
        } else {
            // Use an else statement for the default case
            return deadLine;
        }

        public void setDeadLine (LocalDate deadLine){
            if (deadLine == null) throw new IllegalArgumentException("deadline was null");
            this.deadLine = deadLine;
        }


        public boolean isDone () {
            return done;
        }

        public void setDone ( boolean done){
            this.done = done;
        }

        public Person getCreator () {
            return creator;
        }

        public void setCreator (Person creator){
            this.creator = creator;
        }
        public String isOverdue(){
        return
        }

    }
