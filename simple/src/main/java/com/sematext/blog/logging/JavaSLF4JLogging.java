package com.sematext.blog.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaSLF4JLogging {
  private static Logger LOGGER = LoggerFactory.getLogger(JavaSLF4JLogging.class);

  public static void main(String[] args) {
    LOGGER.info("Hello world!");
  }
}
