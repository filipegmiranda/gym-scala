package io.filipemiranda.arrays

import scala.util.control.Breaks

object TripletsThatSumToZeroAlgo {

  def tripletsFromArrayThatSumZero(input: Array[Int]): Array[Array[Int]] = {
    val target = 0 // the target is the number after the sum
    val sortedArray = input.sorted
    var resultsArrayOfTriplets = Array[Array[Int]]()

    for (i <- sortedArray.indices) {
      var j = i + 1
      var k = sortedArray.length - 1
      val twoSum = target - sortedArray(i)

      Breaks.breakable {
        while (j < sortedArray.length) {
          val sum = sortedArray(j) + sortedArray(k)
          if (k == j) Breaks.break()
          if (sum > twoSum) {
            k -= 1
          } else if (sum < twoSum) {
            j += 1
          } else if (sum == twoSum) {
            val triplet = Array(sortedArray(i), sortedArray(j), sortedArray(k) )
            resultsArrayOfTriplets = resultsArrayOfTriplets :+ triplet
            Breaks.break()
          }
        }
      }
    }
    resultsArrayOfTriplets
  }

}
