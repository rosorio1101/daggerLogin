package cl.yerkos.daggerloggin.di.modules;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import cl.yerkos.daggerloggin.root.App;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public interface ApplicationModule {

    @Binds Context bindApplicatian(App app);
}
