fun main(args: Array<String>) {
   //assigning parameter to ananymous function

    val greetingFunction : (String )-> String ={playerName->
        val currentYear = 2018
        "Welcome to SimVillage,Mayor! (copyright $currentYear"
    }
    println(greetingFunction("Rawan"))

}