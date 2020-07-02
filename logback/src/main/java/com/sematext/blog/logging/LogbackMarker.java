package com.sematext.blog.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class LogbackMarker {
  private static Logger LOGGER = LoggerFactory.getLogger(LogbackMarker.class);
  private static final Marker IMPORTANT = MarkerFactory.getMarker("IMPORTANT");

  public static void main(String[] args) {
    LOGGER.info("This is a log message that is not important!");
    LOGGER.info(IMPORTANT, "This is a very important log message!");
  }
}
