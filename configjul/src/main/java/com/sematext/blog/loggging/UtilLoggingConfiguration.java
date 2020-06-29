package com.sematext.blog.loggging;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class UtilLoggingConfiguration {
  private static Logger LOGGER = Logger.getLogger(UtilLoggingConfiguration.class.getName());

  static {
    try {
      InputStream stream = UtilLoggingConfiguration.class.getClassLoader()
          .getResourceAsStream("logging.properties");
      LogManager.getLogManager().readConfiguration(stream);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) throws Exception {
    LOGGER.log(Level.INFO, "An INFO level log!");
  }
}
