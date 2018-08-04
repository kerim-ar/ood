package duck

import behavior.dance.DanceNoWay
import behavior.fly.FlyNoWay
import behavior.quack.QuackBehavior

class ModelDuck : Duck(FlyNoWay(), QuackBehavior(), DanceNoWay()) {
    override fun display() {
        println("I'm model duck")
    }
}