package che.vlvl.lifecycle.scope.inject

import che.vlvl.lifecycle.scope.impl.PrototypeNumGenerator
import org.springframework.stereotype.Service

@Service
class PrototypeToSingletonInject(private val prototype:PrototypeNumGenerator) {
    fun getNumFromPrototype() = prototype.getNumber()
}