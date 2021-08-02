package che.vlvl.lifecycle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LifecycleApplication

fun main(args: Array<String>) {
	runApplication<LifecycleApplication>(*args)
}
