package com.sematext.blog.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class CatchExample {
  public static void main(String[] args) {
  }

  public Reader openFileReader(String filePath) {
    try {
      return new FileReader(filePath);
    } catch (FileNotFoundException ffe) {
      // tell the user that the file was not found
    }
    return null;
  }

  public Reader openFileReaderWithThrows(String filePath) throws FileNotFoundException {
    return new FileReader(filePath);
  }
}
