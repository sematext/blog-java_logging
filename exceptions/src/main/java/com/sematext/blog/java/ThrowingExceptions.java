package com.sematext.blog.java;

import java.io.File;
import java.io.IOException;

public class ThrowingExceptions {
  public static void main(String[] args) {
  }

  public File openFile(String path) throws IOException {
    File file = new File(path);
    if (!file.exists()) {
      throw new IOException(String.format("File %s doesn't exist", path));
    }
    // continue execution of the business logic
    return file;
  }
}
