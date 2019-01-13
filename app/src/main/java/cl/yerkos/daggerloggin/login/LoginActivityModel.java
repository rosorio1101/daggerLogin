package cl.yerkos.daggerloggin.login;

import javax.inject.Inject;

public class LoginActivityModel implements LoginActivityMVP.Model {

    private LoginRepository loginRepository;
    LoginActivityMVP.Presenter presenter;

    @Inject
    public LoginActivityModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void createUser(String name, String lastname) {
        //lógica de negocio
        loginRepository.saveUSer(new User(name, lastname));

    }

    @Override
    public User getUser() {
        //lógica de negocio
        return loginRepository.getUser();
    }
}
