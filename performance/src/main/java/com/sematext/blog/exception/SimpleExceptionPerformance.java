package com.sematext.blog.exception;

public class SimpleExceptionPerformance extends TestPerformance {
  public static void main(String[] args) {
    SimpleExceptionPerformance perf = new SimpleExceptionPerformance();
    perf.run(Commons.NUM_ITERATIONS);
  }

  @Override
  public int divide(int dividend, int divisor) {
    try {
      return dividend / divisor;
    } catch (Exception ex) {
      // do nothing
    }
    return -1;
  }
}
