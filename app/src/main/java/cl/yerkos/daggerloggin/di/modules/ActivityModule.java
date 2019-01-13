package cl.yerkos.daggerloggin.di.modules;

import cl.yerkos.daggerloggin.login.LoginActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ActivityModule {
    @ContributesAndroidInjector(modules = LoginModule.class)
    LoginActivity contributeLoginActivity();
}
