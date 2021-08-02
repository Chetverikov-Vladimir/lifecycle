package che.vlvl.lifecycle.bean.impl

import che.vlvl.lifecycle.bean.BaseNumGenerator
import org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Service

@Service
@Scope(SCOPE_SINGLETON)
class SingletonNumGenerator: BaseNumGenerator() {
}