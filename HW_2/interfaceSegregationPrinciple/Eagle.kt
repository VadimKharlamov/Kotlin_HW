package interfaceSegregationPrinciple


class Eagle(var numberOfFeathers: Int): FlyBird {
    var currentLocation: String? = null

    override fun fly() {
        currentLocation = "in the air"
    }

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }
}
