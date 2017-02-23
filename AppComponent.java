import javax.inject.Singleton;

import dagger.Component;

import com.watanabear.sample.domain.DomainModule;
import com.watanabear.sample.infra.InfraModule;
import com.watanabear.sample.presentation.PresentationComponent;

@Singleton
@Component(
        modules = {
                InfraModule.class,
                DomainModule.class,
                AppModule.class
        }
)
public interface AppComponent extends PresentationComponent {
}
