package che.vlvl.lifecycle.initialization

import org.springframework.beans.factory.*
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
class CustomBean() : InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    init {
        println("2. Вызов конструктора CustomBean")
    }

    @PostConstruct
    fun init() = println("7. Вызов метода CustomBean::init, помеченного аннотацией @PostConstruct")

    override fun afterPropertiesSet() =
        println("8. Вызов метода CustomBean::afterPropertiesSet из интерфейса InitializingBean ")

    @PreDestroy
    fun customDestroy() = println("10. Вызов метода CustomBean::customDestroy, помеченного аннотацией @PreDestroy")

    override fun destroy() =
        println("11. Вызов метода CustomBean::destroy из интерфейса InitializingBean ")

    // Можно изменить имя бина
    override fun setBeanName(name: String) =
        println("3. Вызов метода CustomBean::setBeanName из интерфейса BeanNameAware ")

    // Можно изменить фабрику создания бина
    override fun setBeanFactory(beanFactory: BeanFactory) =
        println("4. Вызов метода CustomBean::setBeanFactory из интерфейса BeanFactoryAware ")

    // Можно изменить контекст
    override fun setApplicationContext(applicationContext: ApplicationContext) =
        println("5. Вызов метода CustomBean::setApplicationContext из интерфейса ApplicationContextAware ")
}