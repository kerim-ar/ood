package behavior.fly

import behavior.fly.IFlyBehavior

class FlyWithWings : IFlyBehavior {
    private var _flightCounter = 0

    override fun fly() {
        println("I'm fly with wings! Flight number ${++_flightCounter}")
    }
}