package com.sematext.blog.loggging;

import java.util.Date;
import java.util.logging.*;

public class UtilLoggingConfigurationProgramatically {
  private static Logger LOGGER = Logger.getLogger(UtilLoggingConfigurationProgramatically.class.getName());

  static {
    ConsoleHandler handler = new ConsoleHandler();
    handler.setFormatter(new SimpleFormatter() {
      private static final String format = "[%1$tF %1$tT] [%2$-7s] %3$s %n";

      @Override
      public String formatMessage(LogRecord record) {
        return String.format(format,
            new Date(record.getMillis()),
            record.getLevel().getLocalizedName(),
            record.getMessage()
        );
      }
    });

    LOGGER.setUseParentHandlers(false);
    LOGGER.addHandler(handler);
  }

  public static void main(String[] args) throws Exception {
    LOGGER.log(Level.INFO, "An INFO level log!");
  }
}
