package com.sematext.blog.exception;

public abstract class TestPerformance {
  public void run(long iterations) {
    long startTime = System.currentTimeMillis();
    for (long i = 0l; i < iterations; i++) {
      divide(10, 0);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(String.format("Run %d iterations, total execution time: %d milliseconds", iterations, endTime - startTime));
  }

  public abstract int divide(int dividend, int divisor);
}
