package com.sematext.blog.java;

public class ReturnInFinally {
  public static void main(String[] args) {
    ReturnInFinally app = new ReturnInFinally();
    app.example();
    System.out.println("Ended without error");
  }

  public void example() {
    try {
      throw new NullPointerException();
    } finally {
      return;
    }
  }
}
