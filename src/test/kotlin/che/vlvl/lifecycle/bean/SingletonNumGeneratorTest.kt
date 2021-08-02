package che.vlvl.lifecycle.bean

import che.vlvl.lifecycle.bean.impl.SingletonNumGenerator
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class SingletonNumGeneratorTest {

    @Autowired
    lateinit var context: ApplicationContext

    @Test
    //Убеждаемся, что при каждом запросе из контекста возвращается один и тот же экземпляр
    fun checkSingleInstance() {
        val bean1 = context.getBean(SingletonNumGenerator::class.java)
        val bean2 = context.getBean(SingletonNumGenerator::class.java)

        assert(bean1 === bean2)
        assert(bean1.getNumber() == bean2.getNumber())
    }
}