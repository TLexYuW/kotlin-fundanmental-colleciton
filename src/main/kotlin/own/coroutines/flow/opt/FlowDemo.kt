package own.coroutines.flow.opt

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

/**
 * @author : Lex Yu
 */
fun simpleFlow(): Flow<Int> = flow {
    for (i in 10..20) {
        delay(300)
        emit(i)
    }
}

//fun main() = runBlocking<Unit> {
//    simpleFlow().collect { value -> println(value) }
//}

suspend fun main() {
    simpleFlow().collect { value -> println(value) }
}