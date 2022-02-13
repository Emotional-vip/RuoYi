package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author emotional
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RuoYiApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("echo \"  /$$$$$$                      /$$                            /$$$$$$  /$$$$$$$  /$$      /$$\";\n" +
                "echo \" /$$__  $$                    |__/                           /$$__  $$| $$__  $$| $$$    /$$$\";\n" +
                "echo \"| $$  \\__/  /$$$$$$   /$$$$$$  /$$ /$$$$$$$   /$$$$$$       | $$  \\__/| $$  \\ $$| $$$$  /$$$$\";\n" +
                "echo \"|  $$$$$$  /$$__  $$ /$$__  $$| $$| $$__  $$ /$$__  $$      | $$      | $$$$$$$/| $$ $$/$$ $$\";\n" +
                "echo \" \\____  $$| $$  \\ $$| $$  \\__/| $$| $$  \\ $$| $$  \\ $$      | $$      | $$__  $$| $$  $$$| $$\";\n" +
                "echo \" /$$  \\ $$| $$  | $$| $$      | $$| $$  | $$| $$  | $$      | $$    $$| $$  \\ $$| $$\\  $ | $$\";\n" +
                "echo \"|  $$$$$$/| $$$$$$$/| $$      | $$| $$  | $$|  $$$$$$$      |  $$$$$$/| $$  | $$| $$ \\/  | $$\";\n" +
                "echo \" \\______/ | $$____/ |__/      |__/|__/  |__/ \\____  $$       \\______/ |__/  |__/|__/     |__/\";\n" +
                "echo \"          | $$                               /$$  \\ $$                                       \";\n" +
                "echo \"          | $$                              |  $$$$$$/                                       \";\n" +
                "echo \"          |__/                               \\______/                                        \";");
    }
}