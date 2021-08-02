package che.vlvl.lifecycle.initialization

import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.stereotype.Component

@Component
class CustomBeanPostProcessor : BeanPostProcessor {

    // Можно что-то сделать до установки свойств после выполнения конструктора (например, пообрабатывать аннотации)
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {
        if (bean.javaClass == CustomBean::class.java) println("6. Вызов CustomBeanPostProcessor::postProcessBeforeInitialization")

        return super.postProcessBeforeInitialization(bean, beanName)
    }

    // Можно что-то сделать с уже проинициализированным бином (например, накрутить прокси)
    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        if (bean.javaClass == CustomBean::class.java) println("9. Вызов CustomBeanPostProcessor::postProcessAfterInitialization")
        return super.postProcessAfterInitialization(bean, beanName)
    }
}