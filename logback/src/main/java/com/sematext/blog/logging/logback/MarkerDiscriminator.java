package com.sematext.blog.logging.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.sift.AbstractDiscriminator;
import org.slf4j.Marker;

public class MarkerDiscriminator extends AbstractDiscriminator<ILoggingEvent> {
  private String key;
  private String defaultValue;

  @Override
  public String getDiscriminatingValue(ILoggingEvent iLoggingEvent) {
    Marker marker = iLoggingEvent.getMarker();
    if (marker != null && marker.contains("IMPORTANT")) {
      return marker.getName();
    }
    return defaultValue;
  }

  public String getKey() { return key; }

  public void setKey(String key) { this.key = key; }

  public String getDefaultValue() { return defaultValue; }

  public void setDefaultValue(String defaultValue) { this.defaultValue = defaultValue; }
}
