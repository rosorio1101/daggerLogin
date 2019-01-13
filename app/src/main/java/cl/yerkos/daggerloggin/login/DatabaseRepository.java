package cl.yerkos.daggerloggin.login;

import javax.inject.Inject;

public class DatabaseRepository implements LoginRepository {

    private User user;

    @Inject
    public DatabaseRepository(){

    }

    @Override
    public void saveUSer(User user) {
        if (user == null){
            user = getUser();
        }
        this.user = user;
    }

    @Override
    public User getUser() {
        if (user == null){
            user = new User("Antonio", "Banderas");
            user.setId(0);
            return user;
        } else {
            return user;
        }
    }
}
