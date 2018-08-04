package duck

import behavior.dance.IDanceBehavior
import behavior.fly.IFlyBehavior
import behavior.quack.IQuackBehavior

open class Duck(
        private var _flyBehavior: IFlyBehavior,
        private val _quackBehavior: IQuackBehavior,
        private val _danceBehavior: IDanceBehavior) {
    fun quack() {
        _quackBehavior.quack()
    }

    fun swim() {
        println("I'm swimming")
    }

    fun fly() {
        _flyBehavior.fly()
    }

    fun dance() {
        _danceBehavior.dance()
    }

    fun setFlyBehavior(flyBehavior: IFlyBehavior) {
        _flyBehavior = flyBehavior
    }

    open fun display() {}
}