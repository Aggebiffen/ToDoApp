package se.lexicon.Data;
import java.util.Collection;
import se.lexicon.model.AppUser;
import se.lexicon.Data.impl.AppUserDAOImpl;
import java.util.ArrayList;
import se.lexicon.util.StringHelper;
import java.util.Objects;
public class AppUserDAOCollection implements AppUserDAOImpl{
    private ArrayList<AppUser> users = new ArrayList<>();
    @Override
    public AppUser persist(AppUser user) {
        if(user == null) return null;
        users.add(user);
        return user;
    }

    @Override
    public AppUser findByUserName(String username) {
        if(StringHelper.isNullOrEmpty(username)) return null;
        for (AppUser user: users) {
            if(Objects.equals(user.getUserName(), username)) return user;
        }
        return null;
    }

    @Override
    public Collection<AppUser> FindAll() {
        return users;
    }

    @Override
    public void remove(String username) {
        if(StringHelper.isNullOrEmpty(username)) return;
        AppUser toRemove = null;
        for (AppUser user: users) {
            if(Objects.equals(user.getUserName(), username)) toRemove = user;
        }
        if(toRemove != null) users.remove(toRemove);
    }
}




