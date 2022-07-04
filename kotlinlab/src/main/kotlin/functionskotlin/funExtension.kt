package functionskotlin

import kotlinspecial.forSingleTone


//Namely, there are two types of extensions: extension functions and extension properties.
// They look a lot like normal functions and properties but with one important difference:
// you need to specify the type that you extend.
data class Item(val name: String, val price: Float)                                         // 1

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    // 2
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

fun main() {
    val myString = "Hello Earth"
    val getSingleTpne = forSingleTone.name
    println(myString.makeCamel())
    println(myString.removeFirstLastChar())

    println(getSingleTpne)

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))
    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
}

fun String.makeCamel(): String = uppercase()
fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)