package duck

import behavior.dance.DanceMinuet
import behavior.fly.FlyWithWings
import behavior.quack.QuackBehavior

class RedheadDuck : Duck(FlyWithWings(), QuackBehavior(), DanceMinuet()) {
    override fun display() {
        println("I'm redhead duck")
    }
}