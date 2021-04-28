package io.filipemiranda.arrays

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class TripletsThatSumToZeroAlgoSpec extends AnyFlatSpec {

  "Given an integer array nums, the function " should
    """ return all the triplets [nums[i], nums[j], nums[k]]|
     such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0""" in {
    //Input: nums = [-1,0,1,2,-1,-4]
    //Output: [[-1,-1,2],[-1,0,1]]
    val inputArray = Array(-1, 0, 1, 2, -1, -4)
    val expectedOutputArray = Array(Array(-1, -1, 2), Array(-1, 0, 1))
    TripletsThatSumToZeroAlgo.tripletsFromArrayThatSumZero(inputArray) shouldBe (expectedOutputArray)
  }

}
