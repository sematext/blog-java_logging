package com.sematext.blog.java;

public class ThrowInFinally {
  public static void main(String[] args) {
    ThrowInFinally app = new ThrowInFinally();
    app.example();
  }

  public void example() {
    try {
      throw new RuntimeException("Exception in try");
    } finally {
      throw new RuntimeException("Exception in finally");
    }
  }
}
