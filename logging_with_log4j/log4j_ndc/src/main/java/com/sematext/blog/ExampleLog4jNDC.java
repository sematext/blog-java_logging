package com.sematext.blog;

import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

public class ExampleLog4jNDC {
  private static final Logger LOGGER = Logger.getLogger(ExampleLog4jNDC.class);

  public static void main(String[] args) {
    NDC.push(String.format("Session ID: %s", "1234-5678-1234-0987"));
    LOGGER.info("Initializing ExampleLog4jNDC application");
  }
}
