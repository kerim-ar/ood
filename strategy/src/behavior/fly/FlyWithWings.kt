package behavior.fly

import behavior.fly.IFlyBehavior

class FlyWithWings : IFlyBehavior {
    override fun fly() {
        println("I'm fly with wings!")
    }
}