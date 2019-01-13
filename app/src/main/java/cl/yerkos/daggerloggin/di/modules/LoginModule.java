package cl.yerkos.daggerloggin.di.modules;

import cl.yerkos.daggerloggin.login.DatabaseRepository;
import cl.yerkos.daggerloggin.login.LoginActivityMVP;
import cl.yerkos.daggerloggin.login.LoginActivityModel;
import cl.yerkos.daggerloggin.login.LoginActivityPresenter;
import cl.yerkos.daggerloggin.login.LoginRepository;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class LoginModule {

    @Binds
    public abstract LoginActivityMVP.Presenter providerLoginActivityPresenter(LoginActivityPresenter presenter);

    @Binds
    public abstract LoginActivityMVP.Model providerLoginActivityModel(LoginActivityModel model);

    @Binds abstract LoginRepository providerLoginRepository(DatabaseRepository repository);

}

