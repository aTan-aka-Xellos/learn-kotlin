package types


fun main() {

    compareStrings()
    compareNumbers()
    convert()
    bitOperations()
}


fun compareStrings() {
    println("compare strings:")
    val s1: String = "abc"
    val s2: String = "abc"
    val s3: String = s1

    println(s1 == s2)  // true
    println(s1 === s2) // true

    println(s1 == s3)  // true
    println(s1 === s3) // true

}

fun compareNumbers() {
    println("compare numbers:")
    var origin: Int = 127
    var num1: Int? = origin
    var num2: Int? = origin

    println(num1 === num2) // true
    println(num1 == num2)  // true

    origin = 128
    num1 = origin
    num2 = origin

    println(num1 == num2)  // true
    println(num1 === num2) // false!!!
    // if use Int for nums (without nullable) '===' will return true

}

fun convert() {
    println("convert:")
    val b: Byte = 1
    val i: Int = b.toInt()
    println(i)

    val l = 1L + 3 // Long + Int => Long
    println(l)
}


fun bitOperations() {
    println("bit operations:")
    println(1 shl 2)
    println((1 shl 2) and 0x000FF000)
}



fun arrays() {
    println("arrays:")


}







