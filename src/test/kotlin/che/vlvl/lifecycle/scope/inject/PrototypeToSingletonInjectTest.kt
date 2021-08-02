package che.vlvl.lifecycle.scope.inject

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PrototypeToSingletonInjectTest {

    @Autowired
    lateinit var prototypeToSingletonInject: PrototypeToSingletonInject

    @Test
    //Проверяем, что каждый раз при вызове метода у прокси, будет создаваться новый инстанс prototype
    fun getNumFromPrototype() {
        val result1 = prototypeToSingletonInject.getNumFromPrototype()
        val result2 = prototypeToSingletonInject.getNumFromPrototype()

        assert(result1 != result2)

    }
}