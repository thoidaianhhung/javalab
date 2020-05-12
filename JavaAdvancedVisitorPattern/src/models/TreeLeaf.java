package models;

import abstracts.Color;
import abstracts.Tree;
import abstracts.TreeVis;

public class TreeLeaf extends Tree {

  public TreeLeaf(int value, Color color, int depth) {
    super(value, color, depth);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void accept(TreeVis v) {
    // TODO Auto-generated method stub
    v.visitLeaf(this);
  }

}
