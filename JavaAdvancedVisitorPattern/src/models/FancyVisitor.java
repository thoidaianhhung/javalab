package models;

import abstracts.Color;
import abstracts.TreeVis;

public class FancyVisitor extends TreeVis {

  private int depthSum = 0;
  private int greenSum = 0;
  @Override
  public int getResult() {
    // TODO Auto-generated method stub
    return Math.abs(depthSum - greenSum);
  }

  @Override
  public void visitNode(TreeNode node) {
    // TODO Auto-generated method stub
    if (node.getDepth() % 2 == 0) {
      depthSum += node.getValue();
    }
  }

  @Override
  public void visitLeaf(TreeLeaf leaf) {
    // TODO Auto-generated method stub
    if (leaf.getColor().equals(Color.GREEN)) {
      greenSum += leaf.getValue();
    }
  }
  
}
