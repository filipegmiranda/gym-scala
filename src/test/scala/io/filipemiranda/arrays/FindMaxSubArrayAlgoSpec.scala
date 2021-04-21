package io.filipemiranda.arrays

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class FindMaxSubArrayAlgoSpec extends AnyFlatSpec {

  "My Brute Force Solution" should " find the sub-array with the max sum of elements " in {
    val inputArray = Array[Int](2, -4, 2, -1, 3, -3, 10, -1, -11, -100, 8, -1)
    val resultSubArray = FindMaxSubArrayAlgo.findSubArrayMaxSumBruteForce(inputArray)
    val expectedArray = Array(2, -1, 3, -3, 10)
    resultSubArray should be(expectedArray)
  }

  "A dynamic programming approach " should " find the sub-array with the max sum of elements " in {
    val inputArray = Array[Int](2, -4, 2, -1, 3, -3, 10, -1, -11, -100, 8, -1)
    val resultSubArray = FindMaxSubArrayAlgo.findMaxSumSubArray(inputArray)
    val expectedArray = Array(2, -1, 3, -3, 10)
    resultSubArray should be(expectedArray)
  }

  "A dynamic programming approach for the input Array (-2, 1, -3, 4, -1, 2, 1, -5, 4)" should
    " return the max sub-array   Array(4, -1, 2, 1) that sums to 6" in {
    val inputArray = Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val resultSubArray = FindMaxSubArrayAlgo.findMaxSumSubArray(inputArray)
    val expectedArray =  Array(4, -1, 2, 1)
    resultSubArray should be(expectedArray)
  }

}
