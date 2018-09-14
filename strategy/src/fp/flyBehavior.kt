package fp

private fun flyWithWings() {
    println("I'm fly with wings!")
}

private fun flyWithSuperWings() {
    println("I'm fly with super wings!")
}

fun makeFlyWithWingsBehavior(): () -> Unit {
    var counter = 0
    return {
        println("Flight number ${++counter}")
        flyWithWings()
    }
}

fun makeFlyWithSuperWingsBehavior(): () -> Unit {
    var counter = 0
    return {
        println("Flight number ${++counter}")
        flyWithSuperWings()
    }
}