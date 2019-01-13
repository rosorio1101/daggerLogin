package cl.yerkos.daggerloggin.di.components;

import javax.inject.Singleton;

import cl.yerkos.daggerloggin.di.modules.ActivityModule;
import cl.yerkos.daggerloggin.root.App;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ActivityModule.class})
interface ApplicationComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends  AndroidInjector.Builder<App> {

    }
}
