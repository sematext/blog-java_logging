package com.sematext.blog.java;

import java.io.FileReader;

public class ThrowInFinallySecond {
  public static void main(String[] args) throws Exception {
    ThrowInFinallySecond app = new ThrowInFinallySecond();
    app.example();
  }

  public void example() throws Exception {
    FileReader reader = null;
    try {
      reader = new FileReader("/tmp/somefile");
    } finally {
      reader.close();
    }
  }
}
