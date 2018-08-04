package duck

import behavior.dance.DanceNoWay
import behavior.fly.FlyNoWay
import behavior.quack.MuteQuackBehavior

class DecoyDuck : Duck(FlyNoWay(), MuteQuackBehavior(), DanceNoWay()) {
    override fun display() {
        println("I'm decoy duck")
    }
}