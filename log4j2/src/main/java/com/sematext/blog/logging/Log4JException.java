package com.sematext.blog.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Log4JException {
  private static final Logger LOGGER = LogManager.getLogger(Log4JException.class);

  public static void main(String[] args) {
    try {
      throw new IOException("This is an I/O error");
    } catch (IOException ioe) {
      LOGGER.error("Error while executing main thread", ioe);
    }
  }
}
