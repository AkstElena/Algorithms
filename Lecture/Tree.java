package Lecture;

import java.util.ArrayList;
import java.util.List;

public class Tree {
  Node root;

  public class Node {
    int value;
    List<Node> children;
  }

  // // переводим нижний метод в булевый публичный
  // public boolean exist(int value) {
  // if (root != null) {
  // Node node = find(root, value);
  // if (node != null) {
  // return true;
  // }
  // }
  // return false;
  // }

  // // метод обхода в глубину дерева, с помощью рекурсии
  // private Node find(Node node, int value) {
  // if (node.value == value) {
  // return node;
  // } else {
  // for (Node child : node.children) {
  // Node result = find(child, value);
  // if (result != null) {
  // return result;
  // }
  // }
  // }
  // return null;
  // }

  // переводим нижний метод в булевый публичный
  public boolean exist(int value) {
    if (root != null) {
      Node node = find(value);
      if (node != null) {
        return true;
      }
    }
    return false;
  }

  // метод обхода в ширину дерева
  private Node find(int value) {
    List<Node> line = new ArrayList<>();
    line.add(root);
    while (line.size() > 0) {
      List<Node> nextLine = new ArrayList<>();
      for (Node node : line) {
        if (node.value == value) {
          return node;
        }
        nextLine.addAll(node.children);
      }
      line = nextLine;
    }
    return null;
  }

}
