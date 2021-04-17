package io.filipemiranda

import io.filipemiranda.arrays.ArrayAlgosWithSolutions
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class ArrayAlgosWithSolutionsSpec extends AnyFlatSpec {

  "My Brute Force Solution" should " find the sub-array with the max sum of elements " in {
    val inputArray = Array[Int](2, -4, 2, -1, 3, -3, 10, -1, -11, -100, 8, -1)
    val resultSubArray = ArrayAlgosWithSolutions.findSubArrayMaxSumBruteForce(inputArray)
    val expectedArray = Array(2, -1, 3, -3, 10)
    resultSubArray should be(expectedArray)
  }

  "A dynamic programming approach " should " find the sub-array with the max sum of elements " in {
    val inputArray = Array[Int](2, -4, 2, -1, 3, -3, 10, -1, -11, -100, 8, -1)
    val resultSubArray = ArrayAlgosWithSolutions.findMaxSumSubArray(inputArray)
    val expectedArray = Array(2, -1, 3, -3, 10)
    resultSubArray should be(expectedArray)
  }

  "A dynamic programming approach for the input Array (-2, 1, -3, 4, -1, 2, 1, -5, 4)" should
    " return the max sub-array   Array(4, -1, 2, 1) that sums to 6" in {
    val inputArray = Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val resultSubArray = ArrayAlgosWithSolutions.findMaxSumSubArray(inputArray)
    val expectedArray =  Array(4, -1, 2, 1)
    resultSubArray should be(expectedArray)
  }

  ignore should "Algo from Alexey work for input Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)" in {
    val inputArray = Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val resultSubArray = maxSum(inputArray)
    val expectedArray =  Array(4, -1, 2, 1)
    resultSubArray should be(expectedArray)
  }

  private def maxSum(a: Array[Int]): Array[Int] = {
    var currentSum = 0
    var maxSum = 0
    var left, right, maxLeft, maxRight = 0
    var maxI = 0 //used when all negatives in the array

    for (i <- a.indices) {
      currentSum += a(i)

      if (currentSum > 0) {
        // in case current sum is getting greater,
        // then we found next right index with the max sum so far
        if (currentSum > maxSum) {
          maxSum = currentSum
          right = i
          maxRight = right
          maxLeft = left
        }
      } else {
        // in case new sum is lower than or equal 0,
        // then we need to move left and right index further
        // and continue the search
        left = i + 1
        right = left
        currentSum = 0
        if (a(i) > a(maxI)) maxI = i
      }
    }
    // at this point we found left and right
    // indices to capture sub-array with max sum
    if (maxLeft == a.length) Array(a(maxI))
    else a.slice(maxLeft, maxRight + 1)
  }

}
