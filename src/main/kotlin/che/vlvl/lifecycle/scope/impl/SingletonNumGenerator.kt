package che.vlvl.lifecycle.scope.impl

import che.vlvl.lifecycle.scope.BaseNumGenerator
import org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Service

@Service
@Scope(SCOPE_SINGLETON)
class SingletonNumGenerator: BaseNumGenerator() {
}