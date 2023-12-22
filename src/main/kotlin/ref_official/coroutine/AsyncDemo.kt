package coroutine

/**
 * @author : Lex Yu
 */
import kotlinx.coroutines.*

suspend fun main() {                                // A function that can be suspended and resumed later
    val start = System.currentTimeMillis()
    coroutineScope {                                // Create a scope for starting coroutines
        for (i in 1..100_000) {
            launch {                                // Start concurrent tasks
                delay(3000L - i * 30)              // Pause their execution
                log(start, "Countdown: $i")
            }
        }
    }
    // Execution continues when all coroutines in the scope have finished
    log(start, "Liftoff!")
}

fun log(start: Long, msg: String) {
    println(
        "$msg " +
                "(on ${Thread.currentThread().name}) " +
                "after ${(System.currentTimeMillis() - start) / 1000F}s"
    )
}