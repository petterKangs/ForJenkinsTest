package com.kfit.base.scheduling;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * ��ʱ����
 * @author Administrator
 *
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
   /*
    @Scheduled(cron = "0/20 * * * * ?") // ÿ20��ִ��һ��
    public void scheduler() {
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }*/
}

