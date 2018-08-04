package behavior.quack

import behavior.quack.IQuackBehavior

class QuackBehavior : IQuackBehavior {
    override fun quack() {
        println("Quack quack!!!")
    }
}