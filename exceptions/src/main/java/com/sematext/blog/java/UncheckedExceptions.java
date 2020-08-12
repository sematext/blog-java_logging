package com.sematext.blog.java;

public class UncheckedExceptions {
  public static void main(String[] args) {
    UncheckedExceptions ue = new UncheckedExceptions();
    ue.run();
  }

  public void run() {
    throwRuntimeException();
  }

  public void throwRuntimeException() {
    throw new NullPointerException("Null pointer");
  }
}
