package other_resources._11_oop.sealed

fun main() {
    val success = Result.Success("SUCCESS!")
    val error = Result.Success("FAILED!")

    getData(error)
}

fun getData(result: Result) {
    when (result) {
        is Result.Success -> result.showMessage()
        is Result.Error -> result.showMessage()
    }
}

sealed class Result(private val message: String) {

    fun showMessage() {
        println("Result: $message")
    }

    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)

}

