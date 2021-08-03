package che.vlvl.lifecycle.testconfig

import che.vlvl.lifecycle.scope.impl.SingletonNumGenerator
import che.vlvl.lifecycle.scope.inject.PrototypeToSingletonInject
import com.ninjasquad.springmockk.MockkBean
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.springframework.beans.factory.NoSuchBeanDefinitionException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootTest
class ThinContextTest {

    @Configuration
    //В контексте не будет других бинов, кроме определенных в этой конфигурации
    class Config {
        @Bean
        fun singletonBean(): SingletonNumGenerator = SingletonNumGenerator()
    }

    @Autowired
    //Инжектит зависимость
    lateinit var context: ApplicationContext

    @MockkBean
    lateinit var mockkBean: AddingClass

    @Test
    @DisplayName("Check bean type SingletonNumGenerator in context")
    // Проверка наличия бина в контексте, который мы определили в конфигурации Config вложенного класса
    fun checkSingletonBean() {
        context.getBean(SingletonNumGenerator::class.java)
    }

    @Test
    @DisplayName("Check no bean type PrototypeToSingletonInject in context")
    // Проверка того, что в контексте нету бина, который мы туда не положили
    fun checkNoSuchBean() {
        assertThrows<NoSuchBeanDefinitionException> { context.getBean(PrototypeToSingletonInject::class.java) }
    }

    @Test
    @DisplayName("Check mock bean type")
    // Мок автогенерируется и кладется в контекст
    fun checkMockBean() {
        context.getBean(AddingClass::class.java)
    }
}