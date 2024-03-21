package own.threads

/**
 * @author : Lex Yu
 */

fun main() {
    val start = System.currentTimeMillis()

    val threads = List(10_000) {
//        Thread.ofPlatform().unstarted {
//            Thread.sleep(5000)
//            print(".")
//        }

        Thread.ofVirtual().unstarted {
            Thread.sleep(5000)
            print(".")
        }
    }

    threads.forEach { it.start() }
    threads.forEach { it.join() }

    val end = System.currentTimeMillis()
    val total = end - start

    println()
    println("Total = $total ms")
}