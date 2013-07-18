package org.jaro.config.parser;

import org.jaro.config.Configuration;

import java.io.*;

public class XMLConfigurationParser implements ConfigurationParser
{
    @Override
    public Configuration parse(InputStream in)
    {
        return null;
    }

    public Configuration parseFile(String path) throws IOException
    {
        return parse(new File(path));
    }
    public Configuration parseResource(String name)
    {
        return parse(this.getClass().getResourceAsStream(name));
    }
    public Configuration parse(File path) throws IOException
    {
        try(InputStream in = new FileInputStream(path))
        {
            return parse(in);
        }
    }
}
