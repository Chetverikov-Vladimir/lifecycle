package che.vlvl.lifecycle.testconfig

import che.vlvl.lifecycle.scope.impl.SingletonNumGenerator
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootTest
class AddToContextTest {

    @TestConfiguration
    class Config {
        @Bean
        fun addingComponent() = AddingClass()
    }

    @Autowired
    lateinit var context: ApplicationContext

    @Test
    @DisplayName("Check bean type SingletonNumGenerator in context")
    // Проверка наличия бина в контексте, помеченного аннотацией @Service
    fun checkSingletonBean() {
        context.getBean(SingletonNumGenerator::class.java)
    }

    @Test
    @DisplayName("Check bean type SingletonNumGenerator in context")
    // Проверка наличия бина в контексте, который был добавлен в классе Config с @TestConfiguration
    fun checkAddingBean() {
        context.getBean(AddingClass::class.java)
    }
}