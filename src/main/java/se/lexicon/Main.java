package se.lexicon;
import se.lexicon.Data.PersonDAOCollection;
import se.lexicon.Data.ToDoItemDAOCollection;
import se.lexicon.model.Person;
import se.lexicon.model.ToDoItem;
import se.lexicon.util.Connector;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Connector.set_url("jdbc:mysql://localhost:3306/todoit");
        Connector.set_username("root");
        Connector.set_password("1234");
        Connector.getConnection();

        PersonDAOCollection personDAO = new PersonDAOCollection();
        personDAO.create(new Person("August", "Brusbäck"));
        ToDoItemDAOCollection toDoItem = new ToDoItemDAOCollection();
        toDoItem.create(new ToDoItem("Chores", "Doing the dishes", LocalDate.now(),true,1 ));

    }
}

