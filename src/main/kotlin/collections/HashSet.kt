package collections

fun main() {

    // Stores unique elements in an undefined order
    val numbers = hashSetOf(3, 4, null, 90, 86)
    val noNumbers = hashSetOf<Int>()
    println("Original Set $numbers")
    println("Empty Set: $noNumbers")

    numbers.add(44)
    println("Adding 44: $numbers")

    val newNumbers = setOf(15, 16)
    numbers.addAll(newNumbers)
    println("Adding 15 and 16: $numbers")

    numbers.remove(3)
    println("Removing number three: $numbers")

    val toRemove = setOf(90, 4)
    numbers.removeAll(toRemove)
    println("Removing numbers 90 and 4: $numbers")

    numbers.clear()
    println("Cleaning up the set: $numbers")

    val colors : HashSet<String> = hashSetOf()
    colors.add("red")
    colors.add("green")
    colors.add("blue")
    colors.remove("red")
    println("Final Set: $colors")

    val vehicleItems = hashSetOf("leather upholstery", "dashcam", "reversing camera", "radio", "booster seat")
    val optionalExtras = setOf("dashcam", "booster seat", "leather upholstery")
    vehicleItems.removeAll(optionalExtras)
    println("Items of a basic vehicle: $vehicleItems")
}