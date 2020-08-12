package com.sematext.blog.java;

import java.io.FileNotFoundException;

public class CheckedExceptions {
  public CheckedExceptions() throws FileNotFoundException {
    throw new FileNotFoundException("File not found");
  }

  public void throwsExample() throws FileNotFoundException {
    throw new FileNotFoundException("File not found");
  }

  public void wrongThrowsExample() {
    //throw new FileNotFoundException("File not found");
  }
}
