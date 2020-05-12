package models;

import abstracts.Color;
import abstracts.TreeVis;

public class ProductOfRedNodesVisitor extends TreeVis {

  private int result = 1;
  private final int M = (int)Math.pow(10, 9) + 7;
  @Override
  public int getResult() {
    // TODO Auto-generated method stub
    return (int)result;
  }

  @Override
  public void visitNode(TreeNode node) {
    // TODO Auto-generated method stub
    if (node.getColor().equals(Color.RED)) {
      result = (result * node.getValue()) % M;
    }
  }

  @Override
  public void visitLeaf(TreeLeaf leaf) {
    // TODO Auto-generated method stub
    if (leaf.getColor().equals(Color.RED)) {
      result = (result * leaf.getValue()) % M;
    }
  }

}
