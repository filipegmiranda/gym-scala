package io.filipemiranda.stacks_n_queues

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class StacksQueueAlgosWithSolutionSpec extends AnyFlatSpec {

  "The function isBalaced " should " determine if the string with brackets is correctly balanced -> eg: [{}] " in {
    val balancedString = "{{}}"
    val unbalancedString = "{{"
    val anotherUnbalanced = "}}{{"
    val yetAnotherUnbalanced = "{}{}}"
    val lastOneNotBalanced = "{}{}{"

    BalancedStringOfBracketsAlgo.isBalanced(balancedString) shouldEqual (true)
    BalancedStringOfBracketsAlgo.isBalanced(unbalancedString) shouldEqual (false)
    BalancedStringOfBracketsAlgo.isBalanced(anotherUnbalanced) shouldEqual (false)
    BalancedStringOfBracketsAlgo.isBalanced(yetAnotherUnbalanced) shouldEqual (false)
    BalancedStringOfBracketsAlgo.isBalanced(lastOneNotBalanced) shouldEqual (false)
  }


}
