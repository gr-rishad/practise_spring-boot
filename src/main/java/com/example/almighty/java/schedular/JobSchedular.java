package com.example.almighty.java.schedular;

import com.example.almighty.java.service.AddressService;
import com.example.almighty.java.service.UserService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobSchedular {

    private static final Logger LOGGER=LogManager.getLogger(JobSchedular.class);

    private UserService userService;
    private AddressService addressService;

    @Autowired
    public JobSchedular(UserService userService,AddressService addressService){
        this.userService=userService;
        this.addressService=addressService;
    }

    // Logger logger
    @Scheduled(cron = "*/5 * * * * *")
    public void scheduleUsingCron() {
        LOGGER.info(userService.findAll());
    }

    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
    public void scheduleUsingFixedDelayWithInitialDelay() {
        LOGGER.info(userService.findById(1L));
    }

    @Scheduled(fixedDelay = 5000)
    public void fixedDelay() {
        LOGGER.info(addressService.findAll());
    }

    @Scheduled(fixedRate = 5000)
    public void scheduleUsingRate() {
        LOGGER.info(addressService.findById(1L));
    }
}
