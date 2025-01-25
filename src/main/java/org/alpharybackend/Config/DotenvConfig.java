package org.alpharybackend.Config;

import io.github.cdimascio.dotenv.Dotenv;

public class DotenvConfig {
    public static void init() {
        Dotenv dotenv = Dotenv.configure()
                .filename(".env")
                .ignoreIfMissing()
                .load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
    }
}
