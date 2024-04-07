package own.solid.open_closed.violation_example

/**
 * @author : Lex Yu
 */
data class Header(val name: String, val value: String)

class HeadersLogger {
    companion object {
        private val forbiddenHeaders = setOf("header-one", "header-two")
    }


    /**
     *  Everything works perfect, but what if at some point client asks us to exclude additional headers?
     */
    fun log(header: Header) {
        if (!forbiddenHeaders.contains(header.name))
            println(header.value)
    }
}