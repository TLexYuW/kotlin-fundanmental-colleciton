package _11_oop

fun main() {
    val ins = Database.getInstance()
    val ins2 = Database.getInstance()
    println(ins)
    println(ins2)

}
class Database private constructor() {
    companion object {
        private var instance: Database? = null

        fun getInstance(): Database? {
            if (instance == null) {
                instance = Database()
            }
            return instance
        }
    }
}