import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class InfraModule {

      @Singleton
      @Provides
      UserRepository provideUserRepository() {
        return new UserRepositoryImpl();
      }

}
