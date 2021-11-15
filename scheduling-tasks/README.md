Enabling Scheduling requires you add @EnableScheduling annotation on the class containing the main method

Any class containing method that needs to be scheduled needs to have @Component annotation so
Spring can find it at runtime

Scheduled methods will need to have @Scheduled() annoataion with different paramaetrs like:

@Scheduled(fixedRate = 1000) = Runs every second
@Scheduled(fixedDelay=...)
@Scheduled(cron="...")
