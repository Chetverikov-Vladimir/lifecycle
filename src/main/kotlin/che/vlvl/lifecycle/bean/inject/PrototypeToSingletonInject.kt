package che.vlvl.lifecycle.bean.inject

import che.vlvl.lifecycle.bean.impl.PrototypeNumGenerator
import org.springframework.stereotype.Service

@Service
class PrototypeToSingletonInject(private val prototype:PrototypeNumGenerator) {
    fun getNumFromPrototype() = prototype.getNumber()
}