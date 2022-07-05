package collections

import java.util.*

fun main(){

    val saragam = listOf("SA","RE","GA","MA","PA","DHA","NI");
    val reverseSargam = listOf("NI","DHA","PA","MA","GA","RE","SA")

    val beats = listOf(saragam,reverseSargam);
    val allBeats = beats.map { it };
    println(allBeats)

    //todo flatMap builds a single list of the transformation
    val flatMapBeats = beats.flatMap { it }
    println(flatMapBeats)

}