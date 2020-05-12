package interfaces;

public interface Hung {
  int M = 4;
  default int mgetHeight() {
    return M;}
  
  default void print() {
    System.out.println("test");
  }
}
