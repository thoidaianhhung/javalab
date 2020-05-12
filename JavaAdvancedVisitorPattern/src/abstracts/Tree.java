package abstracts;

public abstract class Tree {
  private int value;
  private Color color;
  private int depth;
  
  public Tree(int value, Color color, int depth) {
    this.setValue(value);
    this.setColor(color);
    this.setDepth(depth);
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getDepth() {
    return depth;
  }

  public void setDepth(int depth) {
    this.depth = depth;
  }
  
  public abstract void accept(TreeVis v);
}
