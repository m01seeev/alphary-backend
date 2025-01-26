package org.alpharybackend;

import org.alpharybackend.Config.DotenvConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Alphary Backend application.
 */
@SpringBootApplication
public class AlpharyBackendApplication {
    public static void main(String[] args) {
        DotenvConfig.init();
        SpringApplication.run(AlpharyBackendApplication.class, args);
    }
}
