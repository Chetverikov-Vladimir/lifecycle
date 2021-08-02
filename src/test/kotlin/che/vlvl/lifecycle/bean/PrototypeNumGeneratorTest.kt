package che.vlvl.lifecycle.bean

import che.vlvl.lifecycle.bean.impl.PrototypeNumGenerator
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext


@SpringBootTest
class PrototypeNumGeneratorTest{

    @Autowired
    lateinit var context: ApplicationContext

    @Test
    //Убеждаемся, что при каждом запросе из контекста возвращается разный экземпляр
    fun checkPrototypeInstance() {
        val bean1 = context.getBean(PrototypeNumGenerator::class.java)
        val bean2 = context.getBean(PrototypeNumGenerator::class.java)

        assert(bean1 !== bean2)
        assert(bean1.getNumber() != bean2.getNumber())
    }
}