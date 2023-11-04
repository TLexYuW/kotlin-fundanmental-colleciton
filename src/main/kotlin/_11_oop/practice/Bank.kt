package _11_oop.practice

fun main() {
    var userAccount = Account("User-1")
//    userAccount.balance = 10_000
    userAccount.deposit(1000)
    userAccount.withdraw(500)
    userAccount.deposit(-100)
    userAccount.withdraw(-100000)


    val balance = userAccount.calculateBalance()
    println("Current Balance = $balance")

//    userAccount.balance = 10_000

}

class Account(val accountName: String) {
    private var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount >0){
            transactions.add(amount)
            balance += amount
            println("$amount deposited, Balance is now ${this.balance}")
        }else{
            println("Can't deposit negative sums")
        }
    }

    fun withdraw(amount: Int) {
        if (-amount < 0) {
            transactions.add(-amount)
            this.balance += -amount
            println("$amount withdrawn. Balance is now ${this.balance}")
        } else {
            println("Can't withdraw negative sums")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for (trans in transactions){
            this.balance += trans
        }
        return this.balance
    }
}