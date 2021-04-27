package io.filipemiranda.arrays

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import scala.util.control.Breaks

class TripletsThatSumToZeroAlgoSpec extends AnyFlatSpec {


  "Given an integer array nums, the function " should """ return all the triplets [nums[i], nums[j], nums[k]]|
     such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0""" in {

    //Input: nums = [-1,0,1,2,-1,-4]
    //Output: [[-1,-1,2],[-1,0,1]]
    val inputArray = Array(-1, 0, 1, 2, -1, -4)

    val expectedOutputArray = Array(Array(-1, -1, 2), Array(-1, 0, 1))

    tripletsFromArrayThatZero(inputArray) shouldBe(expectedOutputArray)


  }

  def tripletsFromArrayThatZero(input: Array[Int]): Array[Array[Int]] = {
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
