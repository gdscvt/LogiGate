package com.logigate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // This class will get loaded automatically by Spring
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ProblemRepository repository) {

        return args -> {
            String problem1Content = String.join("",
                    "Problem Description: Look at this series: 3, 6, 9, 12, 15, What number should come next?\n\n",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore",
                    " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut",
                    " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse",
                    " cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in",
                    " culpa qui officia deserunt mollit anim id est laborum.");
            log.info("Preloading " + repository.save(new Problem("Next Number", 1, problem1Content)));
            log.info("Preloading " + repository.save(new Problem("Counting Problem 1", 2)));
        };
    }
}