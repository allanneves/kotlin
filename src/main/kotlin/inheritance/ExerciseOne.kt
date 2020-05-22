package inheritance

fun main() {
    val engineer = Engineer()
    engineer.name = "Engineer"
    engineer.salary = 50.000

    val doctor = Doctor()
    doctor.name = "Doctor"
    doctor.salary = 100.000

    engineer.study()
    engineer.work()
    engineer.study()
    engineer.work()

    doctor.study()
    doctor.work()
    doctor.study()
    doctor.work()
}

class Engineer : Job()
class Doctor : Job()

open class Job {
    private var revenue = 0.0
    var name = ""
    var salary = 0.0

    fun study() {
        salary *= 1.25
        printRevenueAndSalary("studying")
    }

    fun work() {
        revenue += salary
        printRevenueAndSalary("working")
    }

    private fun printRevenueAndSalary(action : String) {
        println("$name is $action and has a revenue of $revenue and a salary of $salary")
    }
}