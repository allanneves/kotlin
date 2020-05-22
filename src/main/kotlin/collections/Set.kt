package collections

fun main() {

    // Stores unique elements in an undefined order
    val numbers = setOf(6, 37, 6, 42)
    println("Should have only one element number six: $numbers")

    val empty: Set<String> = setOf()

    val nullTest = setOf(6, 5, 2, null, 10, 8, null)
    println("Should have only one null element: $nullTest")

    val customers = hashSetOf("Greg", "Bobby", "John")
    println("These are our current customers: $customers")
    val customerJoining = "Carlos"
    customers.add(customerJoining)
    println("$customerJoining has joined. These are our current customers: $customers")
    val customerLeaving = "Bobby"
    customers.remove(customerLeaving)
    println("$customerLeaving decided to leave. These are our current customers: $customers")

    val acceptedGarment = hashSetOf("hat", "tie", "suit", "trousers")
    val wardrobe = hashSetOf("tie", "trousers")
    println("These are the items of our company's dress code: $acceptedGarment")
    println("According to the dress code, this is what you have available: ${acceptedGarment.intersect(wardrobe)}")
    println("According to the dress code, this is what you have available: ${acceptedGarment intersect wardrobe}")
    acceptedGarment.retainAll(wardrobe)
    println("According to the dress code, this is what you have available: $acceptedGarment")
}