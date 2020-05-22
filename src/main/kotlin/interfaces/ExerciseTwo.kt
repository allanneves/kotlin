package interfaces

fun main() {
    var carRental = CarRentalCompany().rentAffordableCar()
    carRental.drive()
    carRental = CarRentalCompany().rentLuxuryCar()
    carRental.drive()
}

interface RentalCar {
    val rentalCost: Int
    fun drive()
}

class LuxuryCar : RentalCar {
    override val rentalCost = 500
    override fun drive() {
        println("Driving a Luxury Car. The rental cost is $rentalCost.")
    }
}

class AffordableCar : RentalCar {
    override val rentalCost = 10
    override fun drive() {
        println("Driving an Affordable Car. The rental cost is $rentalCost.")
    }
}

class CarRentalCompany {
    fun rentAffordableCar() : RentalCar {
        return AffordableCar()
    }

    fun rentLuxuryCar(): RentalCar {
        return LuxuryCar()
    }
}