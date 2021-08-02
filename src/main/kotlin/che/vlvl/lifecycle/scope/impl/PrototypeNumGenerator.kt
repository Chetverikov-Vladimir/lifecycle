package che.vlvl.lifecycle.scope.impl

import che.vlvl.lifecycle.scope.BaseNumGenerator
import org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE
import org.springframework.context.annotation.Scope
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.stereotype.Service

@Service
@Scope(SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
class PrototypeNumGenerator: BaseNumGenerator() {
}