
import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class DomainModule {
      @Provides
      LoginUseCase provideLoginUseCase(UserRepository r) {
          return new LoginUseCaseImpl(r);
      }
}
