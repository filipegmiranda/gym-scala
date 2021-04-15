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
    val resultSubArray = findMaxSumSubArray(inputArray)
    val expectedArray = Array(2, -1, 3, -3, 10)
    resultSubArray should be(expectedArray)
  }

  def findMaxSumSubArray(inputArray: Array[Int]): Array[Int] = {
    assume(inputArray != null && inputArray.length > 0)
    var maxSum, currentSum, maxLeftIndex, maxRightIndex = 0
    var currentLeftIndex = maxLeftIndex
    var currentMaxSum = 0
    for (i <- inputArray.indices) {
      currentSum += inputArray(i)
      if (currentSum > maxSum) {
        maxSum = currentSum
        maxRightIndex = i
        maxLeftIndex = currentLeftIndex
      } else if (currentSum < currentMaxSum) {
        currentLeftIndex = i
        currentSum = inputArray(i)
        currentMaxSum = currentMaxSum
      }
    }
    inputArray.slice(maxLeftIndex, maxRightIndex + 1)
  }


}
