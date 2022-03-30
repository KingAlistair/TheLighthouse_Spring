package com.thelighthouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.net.URI;

@SpringBootApplication
public class TheLighthouseApplication {

    public static void main(String[] args) {
     //   openBrowser();
        SpringApplication.run(TheLighthouseApplication.class, args);
    }


    public static void openBrowser() {
        try {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("http://localhost:8096/"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
