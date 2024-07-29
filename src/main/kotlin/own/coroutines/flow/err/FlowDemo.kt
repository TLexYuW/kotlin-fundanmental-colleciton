package own.coroutines.flow.err

import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking


fun main() = runBlocking<Unit> {
    val numbersFlow = flow<Int> {
        emit(1)
        emit(7)
        throw RuntimeException("ERRRRRRRRRRRRRRRRRRRRRR~~~")
    }

    numbersFlow
        .catch { e -> println(e.message) }
        .collect { v -> println("Collected $v") }
}