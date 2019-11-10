// Small Enough? - Beginner

// You will be given an array and a limit value.
//You must check that all values in the array are below or equal to the limit value.
//If they are, return true. Else, return false.

fun smallEnough(a : IntArray, limit : Int) : Boolean {
    a.forEach{if(it > limit) return false}
    return true
}