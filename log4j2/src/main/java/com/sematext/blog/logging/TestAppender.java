package com.sematext.blog.logging;

import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Core;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;

@Plugin(name = "TestAppender",  category = Core.CATEGORY_NAME, elementType = Appender.ELEMENT_TYPE)
public class TestAppender extends AbstractAppender {
  protected TestAppender(String name, Filter filter) {
    super(name, filter, null, false, null);
  }

  @PluginFactory
  public static TestAppender createAppender(
      @PluginAttribute("name") String name,
      @PluginElement("Filter") Filter filter) {
    return new TestAppender(name, filter);
  }

  @Override
  public void append(LogEvent event) {
    // do some custom append code
  }
}
