package coroutine

/**
 * @author : Lex Yu
 */
import kotlinx.coroutines.*

// A function that can be suspended and resumed later
suspend fun main() {
    val start = System.currentTimeMillis()
    // Create a scope for starting coroutines
    coroutineScope {
        for (i in 1..100_000) {
            // Start concurrent tasks
            launch {
                // Pause their execution
                delay(3000L - i * 30)
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