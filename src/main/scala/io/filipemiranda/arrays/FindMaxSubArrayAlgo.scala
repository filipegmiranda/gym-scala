package io.filipemiranda.arrays

object FindMaxSubArrayAlgo {

  def findSubArrayMaxSumBruteForce(inputArray: Array[Int]): Array[Int] = {
    assume(inputArray != null && inputArray.length > 0)

    var maxSum = 0
    var leftIndex = 0
    var rightIndex = 0
    for (i <- inputArray.indices) {
      var currentMaxSum = inputArray(i)
      for (j <- i + 1 until inputArray.length ) {
        currentMaxSum += inputArray(j)
        if (currentMaxSum > maxSum) {
          maxSum = currentMaxSum
          leftIndex = i
          rightIndex = j
        }
      }
    }
    inputArray.slice(leftIndex, rightIndex + 1)//inclusive
  }

  def findMaxSumSubArray(inputArray: Array[Int]): Array[Int] = {
    assume(inputArray != null && inputArray.length > 0)
    var currentSum = 0
    var bestSum = 0
    var currentLeftIndex = 0
    var maxLeftIndex, maxRightIndex = 0
    for (i <- inputArray.indices) {
      currentSum += inputArray(i)
      if (currentSum > 0) {
        if (currentSum >= bestSum) {
          bestSum = currentSum
          maxRightIndex = i
          maxLeftIndex = currentLeftIndex
        }
      } else {
        currentLeftIndex = i + 1
        currentSum = 0
      }
    }
    inputArray.slice(maxLeftIndex, maxRightIndex + 1)
  }




}
