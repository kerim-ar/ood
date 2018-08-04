package duck

import behavior.dance.DanceNoWay
import behavior.fly.FlyNoWay
import behavior.quack.SqueakBehavior

class RubberDuck : Duck(FlyNoWay(), SqueakBehavior(), DanceNoWay()) {
    override fun display() {
        println("I'm rubber duck")
    }
}