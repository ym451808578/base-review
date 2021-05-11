package com.example.bootreview.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Castle
 * @Date 2021/5/11 17:27
 */
@Component
@Slf4j
public class AppStartupRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("ApplicationRunner传入的参数名称：{}", args.getOptionNames());
        log.info("ApplicationRunner传入的参数值：{}", args.getOptionValues("age"));
        log.info("ApplicationRunner传入的参数：{}", Arrays.toString(args.getSourceArgs()));
    }
}
