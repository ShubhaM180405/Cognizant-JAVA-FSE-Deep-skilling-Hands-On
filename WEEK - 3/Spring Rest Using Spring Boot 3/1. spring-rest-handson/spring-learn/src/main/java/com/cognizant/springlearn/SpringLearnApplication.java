package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Application Started");
        SpringApplication.run(SpringLearnApplication.class, args);

        displayDate();
        displayCountry();
        displayCountries();

        LOGGER.info("Application Ended");
    }

    // Hands-on 2 & 3: Display Date
    public static void displayDate() {
        LOGGER.info("START displayDate");
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
            SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
            Date date = format.parse("12/07/2026");
            LOGGER.debug("Parsed Date : {}", date);
        } catch (Exception e) {
            LOGGER.error("Error parsing date", e);
        }
        LOGGER.info("END displayDate");
    }

    // Hands-on 4 & 5: Display Country
    public static void displayCountry() {
        LOGGER.info("START displayCountry");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        // First bean retrieval
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("First Country Instance : {}", country.toString());

        // Second bean retrieval (to demonstrate scope)
        Country anotherCountry = context.getBean("country", Country.class);
        LOGGER.debug("Second Country Instance : {}", anotherCountry.toString());

        LOGGER.info("END displayCountry");
    }

    // Hands-on 6: Display All Countries
    public static void displayCountries() {
        LOGGER.info("START displayCountries");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        @SuppressWarnings("unchecked")
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        LOGGER.debug("List of Countries:");
        for (Country c : countryList) {
            LOGGER.debug("{}", c.toString());
        }

        LOGGER.info("END displayCountries");
    }
}