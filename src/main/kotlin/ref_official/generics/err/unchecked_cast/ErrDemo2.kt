package ref_official.generics.err.unchecked_cast

import java.io.File

/**
 * @author : Lex Yu
 */

fun readDictionary(file: File): Map<String, *> = file.inputStream().use {
    val dictionary = mutableMapOf<String, String>()

    file.bufferedReader().useLines { lines ->
        lines.forEach { line ->
            if (line.isNotEmpty()) {
                val key = line.substring(0, 1) // First character as key
                val value = line.substring(1).trim() // Rest of the line as value
                dictionary[key] = value
            }
        }
    }

    return dictionary
}

fun main() {
    // We saved a map with `Int`s into this file
    val readFile = File(".gitignore")

    // Warning: Unchecked cast: `Map<String, *>` to `Map<String, Int>`
    val intsDictionary: Map<String, Int> = readDictionary(readFile) as Map<String, Int>

    println(intsDictionary)
}
