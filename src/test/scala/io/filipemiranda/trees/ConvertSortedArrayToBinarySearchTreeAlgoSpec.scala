package io.filipemiranda.trees

import org.scalatest.flatspec.AnyFlatSpec

class ConvertSortedArrayToBinarySearchTreeAlgoSpec extends AnyFlatSpec {


  "A sorted array when converted to a BST" should " work " in {
    val inputSortedArrat = Array(0,2,5,6,7,8,9,13,15,16,17,20)

    val tree = sortedArrayToBST(inputSortedArrat)

      //left side
      //itemsAdded = 0
      // 0, 1, 2, 3, 4
      // n = 2 ; 5 /2 = 2 => 2 // itemsAdded++
      // n / 2 = 1; n = 1 => 1 // itemsAdded++
      // if (n == 1) add array(0) // itesmAdded++

       // n * 2 + 1  = 3


  }

  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right

    def addItem(value: Int): TreeNode = {
      if (value < this.value) {
        if (this.left == null) {
          this.left = new TreeNode(value, null, null)
          return this.left
        }
        return left.addItem(value)
      }
      if (value > this.value) {
        if (this.right == null) {
          this.right = new TreeNode(value, null, null)
          return this.right
        }
        return this.right.addItem(value)
      }
      this //returning this, it means the value is the same as in the node
    }
  }

  class BST() {
    var root: TreeNode = _
    def addItem(value: Int): TreeNode = {
      if (root == null) {
        root = new TreeNode(value, null, null)
        return root
      }
      root.addItem(value)
    }
  }

  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    val bst = new BST()
    nums.foreach { item =>
      bst.addItem(item)
    }
    bst.root
  }

}
