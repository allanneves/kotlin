package casting

import extensions.printHorizontalLine
import kotlin.random.Random

fun main() {
    val shape : Shape = randomShapeSelector()

    if (shape is Circle) {
        println("It IS a Circle")
        shape.radius = 10.0F
        println("Area: ${shape.calculateArea()}")
        String.printHorizontalLine()
    }

    if (shape !is Square) {
        println("It is NOT a Square")
        println("Can only calculate the Area as we don't know which type it is")
        String.printHorizontalLine()
    }

    if (shape is Rectangle) {
        println("It IS a Rectangle")
        shape.length = 10.0F
        shape.breadth = 5.0F
        println("Area: ${shape.calculateArea()}")
        String.printHorizontalLine()
    }

    if (shape is Square) {
        println("It IS a Square")
        shape.sideLength = 5.0F
        println("Area: ${shape.calculateArea()}")
        String.printHorizontalLine()
    }

    when (shape) {
        is Circle -> println("Circle Check!")
        is Square -> println("Square Check!")
        is Rectangle -> println("Rectangle Check!")
    }
}

interface Shape {
    fun calculateArea(): Float
}

class Circle: Shape {
    var radius: Float = 10.0F
    override fun calculateArea(): Float {
        return (22 * radius * radius) / 7
    }
}

class Square: Shape {
    var sideLength: Float = 10.0F
    override fun calculateArea(): Float {
        return sideLength * sideLength
    }
}

class Rectangle : Shape {
    var length: Float = 10.0F
    var breadth: Float = 5.0F
    override fun calculateArea(): Float {
        return length * breadth
    }
}

fun randomShapeSelector() : Shape {
    return when(Random.nextInt(3)) {
        0 -> Square()
        1 -> Circle()
        else -> Rectangle()
    }
}