import behavior.fly.FlyWithSuperWings
import duck.*
import fp.*
import kotlin.reflect.jvm.reflect

fun playWithDuck(duck: Duck) {
    duck.display()
    duck.quack()
    duck.fly()
    duck.swim()
    duck.dance()
    println()
}

fun playWithDuckFP(duck: DuckFP) {
    duck.display()
    duck.quack()
    duck.fly()
    duck.swim()
    duck.dance()
    println()
}

fun main(args: Array<String>) {
    val mallardDuck = MallardDuck()
    playWithDuck(mallardDuck)

    mallardDuck.fly()

    mallardDuck.setFlyBehavior(FlyWithSuperWings())
    mallardDuck.fly()
    mallardDuck.fly()

    val redheadDuck = RedheadDuck()
    playWithDuck(redheadDuck)

    val decoyDuck = DecoyDuck()
    playWithDuck(decoyDuck)

    val rubberDuck = RubberDuck()
    playWithDuck(rubberDuck)

    val modelDuck = ModelDuck()
    playWithDuck(modelDuck)

    ///////////////////////////////////////

    val mallardDuckFP = DuckFP(::makeFlyWithWingsBehavior.call(), ::quack, ::danceWaltz, { println("I'm mallard duck") })
    playWithDuckFP(mallardDuckFP)
    mallardDuckFP.fly()

    mallardDuckFP.setFlyBehavior(::makeFlyWithSuperWingsBehavior.call())
    mallardDuckFP.fly()
    mallardDuckFP.fly()

    val redheadDuckFP = DuckFP(::makeFlyWithWingsBehavior.call(), ::quack, ::danceMinuet, { println("I'm redhead duck") })
    playWithDuckFP(redheadDuckFP)

    val decoyDuckFP = DuckFP({}, {}, {}, { println("I'm decoy duck") })
    playWithDuckFP(decoyDuckFP)

    val rubberDuckFP = DuckFP({}, ::squeak, {}, { println("I'm rubber duck") })
    playWithDuckFP(rubberDuckFP)

    val modelDuckFP = DuckFP({}, ::quack, {}, { println("I'm model duck") })
    playWithDuckFP(modelDuckFP)

}