package com.jos.dem.vetlog.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Slf4j
class DateFormatterTest {

    private DateFormatter dateFormatter = new DateFormatter();

    @Test
    @DisplayName("formatting a date")
    void shouldFormatADate(TestInfo testInfo) {
        log.info("Running: {}", testInfo.getDisplayName());
        assertEquals("01/17/2021", dateFormatter.format("1/17/21, 12:00 AM"));
    }

    @Test
    @DisplayName("formatting a date with one digit day")
    void shouldFormatADateWithOneDigitDay(TestInfo testInfo) {
        log.info("Running: {}", testInfo.getDisplayName());
        assertEquals("08/06/2010", dateFormatter.format("8/6/10, 0:00 AM"));
    }

    @Test
    @DisplayName("formatting a date without semicolon")
    void shouldFormatADateWithoutSemicolon(TestInfo testInfo) {
        log.info("Running: {}", testInfo.getDisplayName());
        assertEquals("01/01/2020", dateFormatter.format("1/1/20 0:00"));
    }

    @Test
    @DisplayName("formatting a date in Spanish format")
    void shouldFormatADateInSpanishFormat(TestInfo testInfo) {
        log.info("Running: {}", testInfo.getDisplayName());
        assertEquals("04/17/2022", dateFormatter.format("17/4/22 0:00"));
    }

    @Test
    @DisplayName("formatting time in 24 hours format")
    void shouldAcceptTwentyFourFormat(TestInfo testInfo) {
        log.info("Running: {}", testInfo.getDisplayName());
        assertEquals("04/17/2022", dateFormatter.format("17/4/22 22:13"));
    }
}
