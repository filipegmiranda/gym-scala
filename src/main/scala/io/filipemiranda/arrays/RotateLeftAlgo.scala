package io.filipemiranda.arrays

object RotateLeftAlgo {
  /*
    A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become . Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.
    Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
     */
  def rotLeftBruteForce(array: Array[Int], nrOfMoves: Int): Array[Int] = {
    for (_ <- 1 to nrOfMoves) {
      for (i <- array.indices) {
        val e = array(i)
        if (i < array.length - 1) {
          array(i) = array(i+1)
          array(i+1) = e
        }
      }
    }
    array
  }

}
