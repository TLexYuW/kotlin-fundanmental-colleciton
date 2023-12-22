package other_resources.coroutine

import kotlinx.coroutines.*

/**
 * @author : Lex Yu
 */
fun main() {
    GlobalScope.launch {
        task2()
    }

    task1()
    Thread.sleep(2000)

// 	task2()
}

fun task1() {
    print("Hello \n")
    println(Thread.currentThread().name)
}

suspend fun task2() {
    withContext(Dispatchers.IO) {
        delay(1000)
        print("World!\n")
        println(Thread.currentThread().name)
    }
}