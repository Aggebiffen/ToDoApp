package se.lexicon.Data;
import java.time.LocalDate;
import se.lexicon.Data.impl.ToDoItemDAOImpl;
import se.lexicon.model.ToDoItem;
import java.util.Collection;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class ToDoItemDAOCollection implements ToDoItemDAOImpl {

    ArrayList<ToDoItem> list = new ArrayList<>();
    @Override
    public ToDoItem persist(ToDoItem todoItem) {
        if(todoItem == null) return null;
        list.add(todoItem);
        return todoItem;
    }
    @Override
    public ToDoItem findById(int id) {
        for (ToDoItem item: list) {
            if(item.getId() == id) return item;
        }
        return  null;
    }
    @Override
    public Collection<ToDoItem> findAll() {
        return list;
    }
    public Collection<ToDoItem> findAllByDoneStatus(boolean status) {
        return list.stream()
                .filter(item -> item.isDone() == status)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByTitleContains(String title) {
        return list.stream()
                .filter(item -> item.getTitle().contains(title))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByPersonId(int id) {
        return list.stream()
                .filter(item -> item.getCreator() != null && item.getCreator().getId() == id)
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByDeadlineAfter(LocalDate after) {
        return list.stream()
                .filter(item -> item.getDeadLine() != null && item.getDeadLine().isAfter(after))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ToDoItem> findByDeadlineBefore(LocalDate before) {
        return list.stream()
                .filter(item -> item.getDeadLine() != null && item.getDeadLine().isBefore(before))
                .collect(Collectors.toList());
    }

    @Override
    public void remove(int id) {
        list.removeIf(item -> item.getId() == id);
    }
}
