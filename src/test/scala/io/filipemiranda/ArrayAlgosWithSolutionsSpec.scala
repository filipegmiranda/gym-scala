package io.filipemiranda

import io.filipemiranda.arrays.ArrayAlgosWithSolutions
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class ArrayAlgosWithSolutionsSpec extends AnyFlatSpec {

  "My Brute Force Solution" should " find the subarray with the max sum of elements " in {
    val inputArray = Array[Int](2, -4, 2, -1, 3, -3, 10, -1, -11, -100, 8, -1)
    val resultSubArray = ArrayAlgosWithSolutions.findSubArrayMaxSumBruteForce(inputArray)
    val expectedArray = Array(2, -1, 3, -3, 10)
    resultSubArray should be(expectedArray)
  }

}
