package behavior.quack

import behavior.quack.IQuackBehavior

class SqueakBehavior : IQuackBehavior {
    override fun quack() {
        println("Squeak!!!")
    }
}