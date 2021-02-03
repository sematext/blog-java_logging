package com.sematext.blog;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.NDC;

public class ExampleLog4jMDC {
  private static final Logger LOGGER = Logger.getLogger(ExampleLog4jMDC.class);

  public static void main(String[] args) {
    MDC.put("user", "rafal.kuc@sematext.com");
    MDC.put("step", "initial");
    LOGGER.info("Initializing ExampleLog4jNDC application");
    MDC.put("step", "launch");
    LOGGER.info("Starting ExampleLog4jNDC application");
  }
}
