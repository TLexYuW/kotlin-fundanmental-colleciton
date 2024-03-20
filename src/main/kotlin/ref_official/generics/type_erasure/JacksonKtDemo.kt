package ref_official.generics.type_erasure

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

/**
 * @author : Lex Yu
 */

fun main() {
    val objectMapper = jacksonObjectMapper()

    val data = """{"answer": 42}""".toByteArray()
    val json: Map<String, String> = objectMapper.readValue(data)
    println(json)
}