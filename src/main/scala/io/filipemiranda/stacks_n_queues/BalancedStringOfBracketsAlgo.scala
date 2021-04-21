package io.filipemiranda.stacks_n_queues

import scala.collection.mutable

object BalancedStringOfBracketsAlgo {

  def isBalanced(input: String): Boolean = {
    val stackOfBrackets = mutable.Stack[Char]()
    for(c <- input.toCharArray) {
      if (c == '{') {
        stackOfBrackets.push(c)
      } else if (c == '}') {
        if (stackOfBrackets.nonEmpty) {
          stackOfBrackets.pop()
        } else {
          return false
        }
      }
    }
    stackOfBrackets.isEmpty
  }

}
