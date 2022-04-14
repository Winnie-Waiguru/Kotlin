fun main(){
    var currentAccount = CurrentAccount("567890-09876", "Wanjala Wanyama", 10500)
     currentAccount.deposit(20000.00)
    currentAccount.withdraw(500.00)
    currentAccount.details()

    var savingsAccount= SavingsAccount("3456789", "Mayana Lameck", 50000,0)
    savingsAccount.withdraw(800.00)

    var product= Product("Tissue", "30g", 30, "Toileteries")
    product.productCategory("fruit")

    words("judge")
}

open class CurrentAccount(var accountNumber:String, var accountName:String, var balance:Int){

     fun deposit(amount:Double){
        var newbalance= amount + balance
        println(newbalance)
    }

     open fun withdraw(amount:Double){
         var newbalance= balance- amount
         println(newbalance)
     }

    fun details(){
        println("Account number $accountNumber  with balance $balance is operated by $accountName")

    }
}

class SavingsAccount(accountNumber: String, accountName: String, balance: Int,var withdrawals:Int): CurrentAccount(accountNumber,accountName, balance){
    override fun withdraw(amount: Double) {

        if (withdrawals<4){
            withdrawals ++
            println("Withdraw money")
        }
        else{
            println("withdrawal request denied.")
        }
    }

}


data class Product(var name:String, var weight:String, var price:Int, var category:String){
    fun productCategory(name: String){
        when (name){
            "fruit", "vegetable"-> println("groceries")
            "Toileteries", "sanitary" -> println("hygeine")
            else-> println("others")
        }
    }

}

fun words(names: String):String {
    if (names.length % 2 == 0) {

    }
    return names
    for (n in names) {
        println(n)
    }

}