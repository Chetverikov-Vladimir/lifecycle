package che.vlvl.lifecycle.scope

import java.util.*

abstract class BaseNumGenerator:NumGenerator {
    private val num = Random().nextInt()
    override fun getNumber(): Int = num
}