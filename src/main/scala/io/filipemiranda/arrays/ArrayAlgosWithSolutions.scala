package io.filipemiranda.arrays

object ArrayAlgosWithSolutions {

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

}
