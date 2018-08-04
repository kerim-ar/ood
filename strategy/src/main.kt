import duck.*

fun drawDuck(duck: Duck) {
    duck.display()
}

fun playWithDuck(duck: Duck) {
    drawDuck(duck)

    duck.quack()
    duck.fly()
    duck.swim()
    duck.dance()
    println()
}

fun main(args: Array<String>) {
    val mallardDuck = MallardDuck()
    playWithDuck(mallardDuck)

    val redheadDuck = RedheadDuck()
    playWithDuck(redheadDuck)

    val decoyDuck = DecoyDuck()
    playWithDuck(decoyDuck)

    val rubberDuck = RubberDuck()
    playWithDuck(rubberDuck)

    val modelDuck = ModelDuck()
    playWithDuck(modelDuck)
}