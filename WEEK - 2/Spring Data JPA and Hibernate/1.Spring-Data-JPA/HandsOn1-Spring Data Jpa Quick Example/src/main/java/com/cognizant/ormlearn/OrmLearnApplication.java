package com.cognizant.ormlearn;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;
@SpringBootApplication
public class OrmLearnApplication {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        LOGGER.info("Inside main");
        countryService = context.getBean(CountryService.class);
        testGetAllCountries();
        testFindCountryByCode();
        testAddCountry();
        testUpdateCountry();
        testDeleteCountry();
    }
    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }
    private static void testFindCountryByCode() {
        LOGGER.info("Start");
        try {
            Country country = countryService.findCountryByCode("PT");
            LOGGER.debug("Country={}", country);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        LOGGER.info("End");
    }
    private static void testAddCountry() {

        LOGGER.info("Start");

        Country country = new Country();
        country.setCode("ZZ");
        country.setName("Shubham's Land");

        countryService.addCountry(country);

        try {
            Country addedCountry = countryService.findCountryByCode("ZZ");
            LOGGER.debug("Added Country={}", addedCountry);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }

        LOGGER.info("End");
    }

    private static void testUpdateCountry() {

        LOGGER.info("Start");

        try {

            countryService.updateCountry("ZZ", "Shubham & Co's Country");

            Country country = countryService.findCountryByCode("ZZ");

            LOGGER.debug("Updated Country={}", country);

        } catch (Exception e) {

            LOGGER.error(e.getMessage());

        }

        LOGGER.info("End");
    }

    private static void testDeleteCountry() {

        LOGGER.info("Start");

        countryService.deleteCountry("ZZ");

        LOGGER.info("Country Deleted");

        LOGGER.info("End");
    }
}