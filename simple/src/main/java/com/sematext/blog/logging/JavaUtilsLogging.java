package com.sematext.blog.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaUtilsLogging {
  private static Logger LOGGER = Logger.getLogger(JavaUtilsLogging.class.getName());

  public static void main(String[] args) {
    LOGGER.log(Level.INFO, "Hello world!");
  }
}
