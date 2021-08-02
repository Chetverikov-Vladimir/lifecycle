package che.vlvl.lifecycle.bean

import java.util.*

abstract class BaseNumGenerator:NumGenerator {
    private val num = Random().nextInt()
    override fun getNumber(): Int = num
}