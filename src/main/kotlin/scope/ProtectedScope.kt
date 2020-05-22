package scope

/**
 * Protected limits the scope to the class and inheriting classes.
 * Below, the field type and the method drill will be visible to the class
 * Drill only. The class CustomDrill has a Machine but does not inherit it, thus
 * it cannot access the field and method.
 */

open class Machine {
    protected var type = "Corded Drill"
    protected fun drill() {
        println("Drilling...")
    }
}

class Drill : Machine() {
    fun start() {
        println(type)
        drill()
    }
}

class CustomDrill {
    fun doTask() {
        val customDrill = Machine()
//        println(customDrill.type)
//        customDrill.drill()
    }
}