package org.jaro.config.parser;

import org.jaro.config.Configuration;

import java.io.InputStream;

public interface ConfigurationParser
{
    Configuration parse(InputStream in);
}
