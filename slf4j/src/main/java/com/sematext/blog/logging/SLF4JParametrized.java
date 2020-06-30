package com.sematext.blog.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JParametrized {
  private static Logger LOGGER = LoggerFactory.getLogger(SLF4JParametrized.class);

  public static void main(String[] args) {
    int currentValue = 36;

    LOGGER.info("The parameter value in the log message is {}", currentValue);
  }
}
