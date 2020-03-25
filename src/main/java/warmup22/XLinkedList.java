package warmup22;

import com.sun.tools.internal.xjc.model.CElement;

import java.util.StringJoiner;

public class XLinkedList {

  static class Node {
    final int value;
    Node next;

    Node(int value) {
      this.value = value;
    }

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

  }

  Node head = null;

  // it modifies the structure and returns new head
  void prepend(int element) {
    Node node= new Node(element);
    node.next=head;
    head=node;
  }

  void append(int element) {
    Node node= new Node(element);
    if (head==null){
      head=node;
    }
    Node current= head;
    while(current.next!= null){
      current=current.next;
    }
    current.next=node;
  }

  int size() {
    Node current= head;
    int counter=0;
    while(current.next!= null){
      counter++;
    }
    return counter;
  }


  boolean contains(int element){

    throw new IllegalArgumentException("represent:hasn't implemented yet");


  }

  Node reverse(int element) {
    Node node= new Node(element);
      Node prev = null;
      Node current = node;
      Node next;
      while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }
      node = prev;
      return node;
  }

  void insertBefore(int index, int value) {
    throw new IllegalArgumentException("insertBefore:hasn't implemented yet");
  }

  void insertAfter(int index, int value) {
    throw new IllegalArgumentException("insertAfter:hasn't implemented yet");
  }

  void deleteHead() {
    throw new IllegalArgumentException("deleteHead:hasn't implemented yet");
  }

  void deleteLast() {
    throw new IllegalArgumentException("deleteLast:hasn't implemented yet");
  }

  void deleteAt(int index) {
    throw new IllegalArgumentException("deleteAt:hasn't implemented yet");
  }

  String represent() {
    StringJoiner sj = new StringJoiner(",", "(", ")");
    Node curr = head;
    while (curr != null) {
      sj.add(String.valueOf(curr.value));
      curr = curr.next;
    }
    return sj.toString();
  }
  String represent2() {
    StringJoiner sj = new StringJoiner(",", "(", ")");
    for (Node curr = head; curr != null; curr = curr.next) {
      sj.add(String.valueOf(curr.value));
    }
    return sj.toString();
  }




}
