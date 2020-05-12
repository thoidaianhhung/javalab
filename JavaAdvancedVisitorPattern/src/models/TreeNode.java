package models;

import java.util.ArrayList;

import abstracts.Color;
import abstracts.Tree;
import abstracts.TreeVis;

public class TreeNode extends Tree {
  
  private ArrayList<Tree> children = new ArrayList<Tree>();
  
  public TreeNode(int value, Color color, int depth) {
    super(value, color, depth);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void accept(TreeVis v) {
    // TODO Auto-generated method stub
    v.visitNode(this);
    for (Tree tree : children) {
      tree.accept(v);
    }
  }

  public void addChild(Tree tree) {
    children.add(tree);
  }
}
