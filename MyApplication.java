
import com.watanabear.sample.domain.DomainModule;
import com.watanabear.sample.infra.InfraModule;

public class MyApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
          Timber.plant(new DebugTree());
        } else {
          Timber.plant(new CrashReportingTree());
        }

        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .infraModule(new InfraModule())
                .domainModule(new DomainModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    /**
    * 独自のTree
    */
    private static class CrashReportingTree extends Timber.HollowTree {

        @Override public void i(String msg, Object... args) {
          i(msg, args);
          Crashlytics.log(String.format(msg, args));
        }

        @Override public void i(Throwable t, String msg, Object... args) {
          i(msg, args);
        }

        @Override public void i(String msg, Object... args) {
          i("error : " + msg, args);
        }

        @Override public void i(Throwable t, String msg, Object... args) {
          i(msg, args);
          Crashlytics.logException(t);
        }
    }
  }
}
