package interfaceSegregationPrinciple


class Penguin(var numberOfFeathers: Int) : NotFlyBird {
    var currentLocation: String? = null

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }

    fun swim() {
        currentLocation = "in the water"
    }
}
