package own.solid.open_closed.solution_example

import own.solid.open_closed.violation_example.Header

/**
 * @author : Lex Yu
 */

data class Header(val name: String, val value: String)


/**
 * reusability and flexibility.
 * We can use already existing codebase to implement new features or apply changes
 * without the need of reinventing the wheel
 */
class HeadersLogger (val additionaForbiddenHeaders: Set<String> = setOf()){
    companion object {
        private val forbiddenHeaders = setOf("header-one", "header-two")
    }

    fun log(header: Header) {
        val headerName = header.name
        if (!forbiddenHeaders.contains(headerName) && !additionaForbiddenHeaders.contains(headerName))
            println(header.value)
    }
}