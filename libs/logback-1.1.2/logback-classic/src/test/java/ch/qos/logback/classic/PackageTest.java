/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2013, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.classic;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({LoggerContextTest.class, LoggerPerfTest.class,
        ScenarioBasedLoggerContextTest.class, PatternLayoutTest.class,
        LoggerTest.class, LoggerSerializationTest.class,
        LoggerMessageFormattingTest.class, MDCTest.class,
        TurboFilteringInLoggerTest.class,
        AsyncAppenderTest.class})
public class PackageTest {
}