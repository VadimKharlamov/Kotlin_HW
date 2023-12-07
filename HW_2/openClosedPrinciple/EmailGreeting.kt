package openClosedPrinciple

interface Greeting {
    val message: String
}

class DefaultGreeting : Greeting {
    override val message: String = "Hello!"
}

class FormalGreeting : Greeting {
    override val message: String = "Good evening, sir."
}

class CasualGreeting : Greeting {
    override val message: String = "Sup bro?"
}

class IntimateGreeting : Greeting {
    override val message: String = "Hello Darling!"
}

class EmailGreeting(private var greetingType: Greeting) {

    val greeting: String = greetingType.message

    fun setGreeting(type: Greeting) {
        this.greetingType = type
    }
}
