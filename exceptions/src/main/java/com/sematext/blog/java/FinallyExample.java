package com.sematext.blog.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyExample {
  public void exampleOne() {
    FileReader reader = null;
    try {
      reader = new FileReader("/tmp/somefile");
    } catch (FileNotFoundException ex) {
      // do something
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException ex) {
          // do something
        }
      }
    }
  }
}
