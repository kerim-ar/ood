package behavior.fly

class FlyWithSuperWings : IFlyBehavior {
    private var _flightCounter = 0

    override fun fly() {
        println("I'm fly with super wings! Flight number ${++_flightCounter}")
    }
}