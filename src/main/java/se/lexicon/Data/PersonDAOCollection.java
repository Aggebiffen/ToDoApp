package se.lexicon.Data;

import se.lexicon.Data.impl.PersonDAO;
import se.lexicon.model.Person;
import se.lexicon.util.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonDAOCollection implements PersonDAO {
    List<Person> persons = new ArrayList<>();

    @Override
    public Person create(Person person) {
        String insertQuery = "INSERT INTO person (first_name, last_name) VALUES (?,?)";

        try (
                Connection connection = Connector.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery, PreparedStatement.RETURN_GENERATED_KEYS)
        ) {
            preparedStatement.setString(1, person.getFirst_Name());
            preparedStatement.setString(2, person.getLast_Name());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Person created successfully!");
            }

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int generatedPersonId = generatedKeys.getInt(1);
                    person.setPerson_id(generatedPersonId); // Set the generated ID to the Person object
                    System.out.println("Generated Person ID = " + generatedPersonId);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person person : persons) {
            if (person.getPerson_id() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findByName(String name) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getFirst_Name().equalsIgnoreCase(name) || person.getLast_Name().equalsIgnoreCase(name)) {
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(persons);
    }

    @Override
    public void remove(int id) {
        persons.removeIf(person -> person.getPerson_id() == id);
    }

    @Override
    public Person update(Person updatedPerson) {
        for (Person person : persons) {
            if (person.getPerson_id() == updatedPerson.getPerson_id()) {
                person.setFirst_Name(updatedPerson.getFirst_Name());
                person.setLast_Name(updatedPerson.getLast_Name());
                // Add more fields to update as needed
                return person;
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return persons.removeIf(person -> person.getPerson_id() == id);
    }
}
