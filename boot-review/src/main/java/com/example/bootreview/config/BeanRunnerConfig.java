package com.example.bootreview.config;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

/**
 * ApplicationRunner执行优先级高于CommandLineRunner
 * 以Bean的形式运行的Runner优先级要低于Component注解加implements Runner接口的方式
 * Order注解只能保证同类的CommandLineRunner或ApplicationRunner的执行顺序，不能跨类保证顺序
 *
 * @author Castle
 * @Date 2021/5/11 17:30
 */
@Configuration
public class BeanRunnerConfig {

    @Bean
    @Order(1)
    public CommandLineRunner runner1() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println("CommandLineRunner1" + Arrays.toString(args));
            }
        };
    }

    @Bean
    @Order(2)
    public CommandLineRunner runner2() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println("CommandLineRunner2" + Arrays.toString(args));
            }
        };
    }

    @Bean
    @Order(3)
    public ApplicationRunner runner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                System.out.println("ApplicationRunner " + Arrays.toString(args.getSourceArgs()));
            }
        };
    }
}
