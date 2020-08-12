package com.sematext.blog.java;

import java.io.IOException;

public class RethrowException {
  public static void main(String[] args) throws IOException {
    RethrowException exec = new RethrowException();
    exec.run();
  }

  public void run() throws IOException {
    try {
     methodThrowingIOE();
    } catch (IOException ioe) {
      // do something about the exception
      throw ioe;
    }
  }

  public void methodThrowingIOE() throws IOException {
    throw new IOException();
  }
}
