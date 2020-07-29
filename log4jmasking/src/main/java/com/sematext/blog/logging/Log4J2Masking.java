package com.sematext.blog.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class Log4J2Masking {
  private static Logger LOGGER = LoggerFactory.getLogger(Log4J2Masking.class);
  private static final Marker SENSITIVE_DATA_MARKER = MarkerFactory.getMarker("SENSITIVE_DATA_MARKER");

  public static void main(String[] args) {
    LOGGER.info("This is a log message without sensitive data");
    LOGGER.info(SENSITIVE_DATA_MARKER, "This is a a log message with credit card number 1234-4444-3333-1111 in it");
  }
}
