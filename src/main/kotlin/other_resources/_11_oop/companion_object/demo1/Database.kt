package other_resources._11_oop.companion_object.demo1

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