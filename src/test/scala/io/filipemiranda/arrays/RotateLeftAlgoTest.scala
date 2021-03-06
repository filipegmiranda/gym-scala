package io.filipemiranda.arrays

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class RotateLeftAlgoTest extends AnyFlatSpec {

  "Brute force rotLeft function" should "left rotate the array items to the left the given numberOfTimes -> 1 time " in {
    val simpleArray = Array(1,2,3,4,5)
    val expectedSimpleArrayRotated = Array(2,3,4,5,1)
    val result = RotateLeftAlgo.rotLeftBruteForce(simpleArray, 1)
    result shouldEqual(expectedSimpleArrayRotated)
  }

  "2 - Brute force rotLeft function" should "left rotate the array items to the left the given numberOfTimes -> 3 time " in {
    val simpleArray = Array(1,2,3,4,5)
    val expectedSimpleArrayRotated = Array(4,5,1,2,3)
    val result = RotateLeftAlgo.rotLeftBruteForce(simpleArray, 3)
    result shouldEqual(expectedSimpleArrayRotated)
  }

  "A good implementation rotate left, " should " rotate left the array in linear time -> 3 times" in {
    val simpleArray = Array(1,2,3,4,5)
    val expectedSimpleArrayRotated = Array(4,5,1,2,3)
    val result = RotateLeftAlgo.rotateLeft(simpleArray, 3)
    result shouldEqual(expectedSimpleArrayRotated)
  }

  "A good implementation rotate left, " should " rotate left the array in linear time -> 1 time" in {
    val simpleArray = Array(1,2,3,4,5)
    val expectedSimpleArrayRotated = Array(2,3,4,5,1)
    val result = RotateLeftAlgo.rotateLeft(simpleArray, 1)
    result shouldEqual(expectedSimpleArrayRotated)
  }





}
