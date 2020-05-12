package models;

import abstracts.TreeVis;

public class SumInLeavesVisitor extends TreeVis {

  private int result = 0;
  
  @Override
  public int getResult() {
    // TODO Auto-generated method stub
    return result;
  }

  @Override
  public void visitNode(TreeNode node) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void visitLeaf(TreeLeaf leaf) {
    // TODO Auto-generated method stub
    result += leaf.getValue();
  }

}
