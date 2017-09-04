package com.pavlo.testPortal.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class AbstractProperties {

    public Map<String, String> abstractPropertiesMethod() throws IOException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("D:" + File.separator + "БІБЛІОТЕКА"
                + File.separator + "IT" + File.separator + "Okten"
                + File.separator + "TestPortal"
                + File.separator + "properties.txt"));

        Map<String, String> propertiesMap;
        propertiesMap = (Map) properties;

        return propertiesMap;

    }

}
