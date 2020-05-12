package main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import abstracts.Color;
import abstracts.Tree;
import models.FancyVisitor;
import models.ProductOfRedNodesVisitor;
import models.SumInLeavesVisitor;
import models.TreeLeaf;
import models.TreeNode;

public class SolutionVisitor {
  private static int nodeValue[];
  private static Color nodeColor[];
  private static Map<Integer, Set<Integer>> nodeMap = new HashMap<>();

  public static Tree solve() {
    try (Scanner in = new Scanner(System.in)) {
      int number = in.nextInt();
      nodeValue = new int[number];
      for (int i = 0; i < number; i++) {
        nodeValue[i] = in.nextInt();
      }
      nodeColor = new Color[number];
      for (int i = 0; i < number; i++) {
        nodeColor[i] = (in.nextInt() == 0) ? Color.RED : Color.GREEN;
      }
      Tree rootNode;
      if (number == 1) {
        rootNode = new TreeLeaf(nodeValue[0], nodeColor[0], 0);
      } else {
        for (int i = 0; i < number - 1; i++) {
          int u = in.nextInt();
          int v = in.nextInt();
          Set<Integer> uEdge = nodeMap.get(u);
          if (uEdge == null) {
            uEdge = new HashSet<>();
          }
          uEdge.add(v);
          nodeMap.put(u, uEdge);
          Set<Integer> vEdge = nodeMap.get(v);
          if (vEdge == null) {
            vEdge = new HashSet<>();
          }
          vEdge.add(u);
          nodeMap.put(v, vEdge);
        }
        rootNode = new TreeNode(nodeValue[0], nodeColor[0], 0);
        Set<Integer> rootEdge = nodeMap.get(1);
        Iterator<Integer> root = rootEdge.iterator();
        while (root.hasNext()) {
          Integer integer = (Integer) root.next();
          nodeMap.get(integer).remove(1);
          createEdge(rootNode, integer);
        }
      }
      return rootNode;
    }
  }
  public static void createEdge(Tree parentNode, Integer integer) {
    Set<Integer> nodeEdge = nodeMap.get(integer);
    boolean child = false;
    if (nodeEdge != null && !nodeEdge.isEmpty()) {
      child = true;
    }
    if (child) {
      TreeNode node = new TreeNode(nodeValue[integer - 1], nodeColor[integer - 1], parentNode.getDepth() + 1);
      ((TreeNode) parentNode).addChild(node);
      Iterator<Integer> nodeIterator = nodeEdge.iterator();
      while (nodeIterator.hasNext()) {
        Integer integer2 = (Integer) nodeIterator.next();
        nodeMap.get(integer2).remove(integer);
        createEdge(node, integer2);
      }
    } else {
      TreeLeaf leaf = new TreeLeaf(nodeValue[integer - 1], nodeColor[integer - 1], parentNode.getDepth() + 1);
      ((TreeNode) parentNode).addChild(leaf);
    }
  }
  public static void main(String[] args) {
    Tree root = solve();
    SumInLeavesVisitor sv1 = new SumInLeavesVisitor();
    ProductOfRedNodesVisitor sv2 = new ProductOfRedNodesVisitor();
    FancyVisitor sv3 = new FancyVisitor();
    
    root.accept(sv1);
    root.accept(sv2);
    root.accept(sv3);
    
    int res1 = sv1.getResult();
    int res2 = sv2.getResult();
    int res3 = sv3.getResult();
    
    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
  }
}
