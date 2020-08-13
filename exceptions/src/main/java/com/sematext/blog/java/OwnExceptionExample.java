package com.sematext.blog.java;

public class OwnExceptionExample {
  public void doSomething() throws MyOwnException {
    // code with very important logic
    throw new MyOwnException("My Own Exception!");
  }

  class MyOwnException extends Exception {
    public MyOwnException(String message) {
      super(message);
    }
  }
}
