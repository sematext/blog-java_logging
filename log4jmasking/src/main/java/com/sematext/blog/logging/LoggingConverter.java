package com.sematext.blog.logging;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Plugin(name = "sample_logging_mask", category = "Converter")
@ConverterKeys("sc")
public class LoggingConverter extends LogEventPatternConverter {
    private static Pattern PATTERN = Pattern.compile("\\b([0-9]{4})-([0-9]{4})-([0-9]{4})-([0-9]{4})\\b");

    public LoggingConverter(String[] options) {
        super("sc", "sc");
    }

    public static LoggingConverter newInstance(final String[] options) {
        return new LoggingConverter(options);
    }

    @Override
    public void format(LogEvent event, StringBuilder toAppendTo) {
        String message = event.getMessage().getFormattedMessage();
        String maskedMessage = message;

        if (event.getMarker() != null && "SENSITIVE_DATA_MARKER".compareToIgnoreCase(event.getMarker().getName()) == 0) {
            Matcher matcher = PATTERN.matcher(message);
            if (matcher.find()) {
                maskedMessage = matcher.replaceAll("****-****-****-****");
            }
        }

        toAppendTo.append(maskedMessage);
    }
}
