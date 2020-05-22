package generics

fun main() {
    val squareGeometry = Geometry<Square>()
    squareGeometry.getAreaMessage(Square(), 5.0)

    val circleGeometry = Geometry<Circle>()
    circleGeometry.getAreaMessage(Circle(), 8.0)

    val genericGeometry = Geometry<Shape>()
    genericGeometry.getAreaMessage(Square(), 10.0)
    genericGeometry.getAreaMessage(Circle(), 2.0)
}

class Geometry<T: Shape> {
    fun getAreaMessage(shape : T, size : Double) {
        println("The area of this shape is ${shape.getArea(size)}")
    }
}

abstract class Shape {
    abstract fun getArea(size : Double) : Double
}

class Square : Shape() {
    override fun getArea(size: Double) : Double {
        return size * size
    }
}

class Circle : Shape() {
    override fun getArea(size: Double) : Double {
        return size * size * 3.1415
    }
}