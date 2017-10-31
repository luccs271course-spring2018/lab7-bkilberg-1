package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  /**
   * public static void main(String[] args) {
   *
   * <p>// Done read successive input lines until EOF, then print out in reverse order
   *
   * <p>LinkedStack<String> stack = new LinkedStack<String>();
   *
   * <p>final Scanner input = new Scanner(System.in); String line = null; while
   * (input.hasNextLine()) { line = input.nextLine(); stack.push(line); }
   *
   * <p>String word = ""; while (!stack.isEmpty()) { word += "\n" + stack.pop(); }
   *
   * <p>System.out.println(word); }
   */
  public static void main(final String[] args) {
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }
  /**
   * private static void printReverse(final Scanner input) { 
   * // TODO recursively read and print
   * successive input lines until EOF, then print them out in // reverse order 
   * String str = input.nextLine(); 
   * if (str == null || str.equals("")) { 
   * return; } else {
   * System.out.println(str); 
   * printReverse(input); 
   * System.out.println(str); } 
   * }
   */
   
  private static void printReverse(final Scanner input) {
    // DONE recursively read and print successive input lines until EOF, then print them out in
    // reverse order
    if (input.hasNextLine()) {
      final String str = input.nextLine();
      System.out.println(str);
      printReverse(input);
      System.out.println(str);
    } else {
      return;
    }
  }
}
