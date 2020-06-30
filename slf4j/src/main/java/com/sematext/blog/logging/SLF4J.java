package com.sematext.blog.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4J {
  private static Logger LOGGER = LoggerFactory.getLogger(SLF4J.class);

  public static void main(String[] args) {
    LOGGER.info("This is an info level log message!");
  }
}
