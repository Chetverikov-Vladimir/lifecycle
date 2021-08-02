package che.vlvl.lifecycle.initialization

import org.springframework.beans.factory.config.BeanFactoryPostProcessor
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.stereotype.Component

@Component
class CustomBeanFactoryPostProcessor : BeanFactoryPostProcessor {

    //Сюда приходят описания бинов
    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {
        println("1. Вызов метода CustomBeanFactoryPostProcessor::postProcessBeanFactory")
    }
}