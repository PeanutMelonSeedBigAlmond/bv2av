import kotlin.collections.HashMap
import kotlin.math.pow

var table = "fZodR9XQDSUm21yCkr6zBqiveYah8bt4xsWpHnJE7jL5VG3guMTKNPAwcF"
var map = HashMap<Char, Int>()
var xor = 177451812L
var add = 100618342136696320L
var magicArray = intArrayOf(11, 10, 3, 8, 4, 6, 2, 9, 5, 7)
fun main() {
    for (i in 0 until 58) {
        map[table[i]] = i
    }
    println(av2bv(78977736))
    println("av${bv2av("BV1KJ411C7Q6")}")
}

fun bv2av(x: String): Long {
    var num = 0L
    for (i in 0 until 10) {
        num += map[x[magicArray[i]]]!! * 58.0.pow(i.toDouble()).toLong()
    }
    return num - add xor xor.toLong()
}

fun av2bv(x: Long): String {
    val x = (x xor xor) + add
    val array = "BV          ".toCharArray()
    for (i in 0 until 10) {
        array[magicArray[i]] = table[(x / 58.0.pow(i.toDouble()).toLong() % 58).toInt()]
    }
    return array.contentToString().replace(Regex("[\\[\\]\\s,]"), "")
}
