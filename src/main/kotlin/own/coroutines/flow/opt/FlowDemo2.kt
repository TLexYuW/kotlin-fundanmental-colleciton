package own.coroutines.flow.opt

import kotlinx.coroutines.flow.*

/**
 * @author : Lex Yu
 */
suspend fun main() {
    val numsFlow = (91..100).asFlow()

    numsFlow
        .map { it * 2 }
        .filter { it % 3 == 0 }
        .collect { println(it / 2) }
}