package collections

import java.util.*

fun main(){
    val items = listOf("kiwi","apple","banana","ora","orange","orang","avocado")

    when{
        "kiwi" in items -> println("yes")
        else -> println("no")
    }

    items
        .filter { it.startsWith('a') }
        //.sortedBy { it }
        .map { it.uppercase(Locale.getDefault()) }
        .forEach {
        println(it)
    }
    println("set not acceptin duplicates ==============")
    println("before added")
    val checkSetList:MutableSet<String> = mutableSetOf("name","age","size")
    checkSetList.forEach {
        i -> print("$i ,")
    }
    checkSetList.add("area")
    println()
    println("area added")
    checkSetList.forEach {
            i -> print(" $i ,")
    }
    checkSetList.add("name")
    println()
    println("name again added")
    checkSetList.forEach {
            i -> print("$i ,")
    }

//    for (item in items){
//        print("$item ,")
//    }

    println()
    println("========= any all none =======")
    //any returns boolean
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
    val anyNegative = numbers.any { it < 0 }             // 2
    val anyGT6 = numbers.any { it > 6 }
    println(anyNegative)
    println(anyGT6)
    //Function all returns true if all elements in collection match the given predicate.
    println("== for all function checks == ")
    val allEven = numbers.all { it % 2 == 0 }            // 2
    val allLess6 = numbers.all { it < 6 }
    println(allEven)
    println(allLess6)
    println("== for none function checks == ")
    val allEvenNone = numbers.none { it % 2 == 1 }            // 2
    val allLess6None = numbers.none { it > 6 }
    println(allEvenNone)
    println(allLess6None)

    println("== fina and findLast")
//    val first = items.find { it.startsWith("a") }                                // 2
//    val last = items.findLast { it.startsWith("or") }                             // 3
//    val nothing = items.find { it.contains("nothing") }
//
//    println("The first word starting with \"a\" is \"$first\"")
//    println("The last word starting with \"or\" is \"$last\"")
//    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")

    println("== first and last == ")
    val first = numbers.first()                          // 2
    val last = numbers.last()                            // 3

    val firstEven = numbers.first { it % 2 == 0 }        // 4
    val lastOdd = numbers.last { it % 2 != 0 }           // 5

    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")

    println("== count == ")
    val totalCount = numbers.count()                     // 2
    val evenCount = numbers.count { it % 2 == 0 }        // 3

    println("Total number of elements: $totalCount")
    println("Number of even elements: $evenCount")

    println("partition====")
    val evenOdd = numbers.partition { it % 2 == 0 }           // 2
    val (positives, negatives) = numbers.partition { it > 0 } // 3

    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")
    println("Odd numbers: ${evenOdd.second}")
    println("Positive numbers: $positives")
    println("Negative numbers: $negatives")

}