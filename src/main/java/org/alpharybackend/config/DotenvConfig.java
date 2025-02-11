package org.alpharybackend.config;

import io.github.cdimascio.dotenv.Dotenv;

/**
 * Configuration class for loading environment variables from a .env file. Utilizes the dotenv
 * library for secure handling of sensitive data.
 */
public abstract class DotenvConfig {
  /**
   * Initializes environment variables from a .env file. Loaded values are added to the system
   * properties.
   *
   * <p><b>Note:</b> If the .env file is missing, the method continues execution without errors.
   */
  public static void init() {
    Dotenv dotenv = Dotenv.configure().filename(".env").ignoreIfMissing().load();
    dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
  }
}
