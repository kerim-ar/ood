package fp

import behavior.fly.IFlyBehavior

class DuckFP(
        private var _flyBehaviorFn: () -> Unit,
        private val _quackBehaviorFn: () -> Unit,
        private val _danceBehaviorFn: () -> Unit,
        private val _displayFn: () -> Unit) {

    fun quack() {
        _quackBehaviorFn()
    }

    fun swim() {
        println("I'm swimming")
    }

    fun fly() {
        _flyBehaviorFn()
    }

    fun dance() {
        _danceBehaviorFn()
    }

    fun setFlyBehavior(flyBehaviorFn: () -> Unit) {
        _flyBehaviorFn = flyBehaviorFn
    }

    fun display() {
        _displayFn()
    }

}