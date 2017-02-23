
import com.watanabear.sample.domain.DomainModule;
import com.watanabear.sample.infra.InfraModule;

public class MyApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
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
}
