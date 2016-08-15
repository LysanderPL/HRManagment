package sunflux.pl.greetings.tasks;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * Created by Lysander on 2016-08-07.
 */
public class MyTask {
    @Scheduled(cron="*/5 * * * * ?")
    public void demoServiceMethod()
    {
        System.out.println("Method executed at every 5 seconds. Current time is :: "+ new Date());
    }
}
