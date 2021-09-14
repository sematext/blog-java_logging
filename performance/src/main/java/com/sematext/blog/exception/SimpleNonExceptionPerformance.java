package com.sematext.blog.exception;

public class SimpleNonExceptionPerformance extends TestPerformance {
  public static void main(String[] args) {
    SimpleNonExceptionPerformance perf = new SimpleNonExceptionPerformance();
    perf.run(Commons.NUM_ITERATIONS);
  }

  @Override
  public int divide(int dividend, int divisor) {
    if (divisor != 0) {
      return dividend / divisor;
    }
    return -1;
  }
}
