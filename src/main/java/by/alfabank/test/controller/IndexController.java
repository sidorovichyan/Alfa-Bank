package by.alfabank.test.controller;

import by.alfabank.test.entity.Gif;
import by.alfabank.test.entity.Rate;
import by.alfabank.test.logic.CalendarLogic;
import by.alfabank.test.logic.CompareLogic;
import by.alfabank.test.service.ServiceGif;
import by.alfabank.test.service.ServiceRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@RestController
public class IndexController {

    private ServiceRate serviceRate;

    private ServiceGif serviceGif;

    @Autowired
    public void setServiceRate(ServiceRate serviceRate) {
        this.serviceRate = serviceRate;
    }

    @Autowired
    public void setServiceGif(ServiceGif serviceGif) {
        this.serviceGif = serviceGif;
    }

    @GetMapping("/alfa/{code}")
    public ModelAndView doGet(@PathVariable String code) {
        ModelAndView modelAndView = new ModelAndView();
        String url = null;
        Gif gif;
        String firstValue = "error", secondValue = "error";
        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties");
        String random = ((int) (1 + Math.random() * 10)) + "";
        try {
            properties.load(inputStream);

            Rate frate = serviceRate.getRate(CalendarLogic.getTodayDateString(), properties.getProperty("rate.appid"), properties.getProperty("rate.currency"), code);
            Rate srate = serviceRate.getRate(CalendarLogic.getYesterdayDateString(), properties.getProperty("rate.appid"), properties.getProperty("rate.currency"), code);

            firstValue = frate.getRates().get(code).asText();
            secondValue = srate.getRates().get(code).asText();

            if (CompareLogic.firstGreaterSecond(firstValue, secondValue)) {
                gif = serviceGif.getGif(properties.getProperty("gif.apikey"), properties.getProperty("gif.rich"), random);
            } else {
                gif = serviceGif.getGif(properties.getProperty("gif.apikey"), properties.getProperty("gif.broke"), random);
            }
            url = gif.getData().get(0).get("images").get("original").get("url").asText();
        } catch (IllegalArgumentException | NullPointerException | IOException e) {
            url = properties.getProperty("gif.error.url");
        }
        modelAndView.setViewName("page");
        modelAndView.setStatus(HttpStatus.OK);
        modelAndView.addObject("url", url);
        modelAndView.addObject("now", firstValue);
        modelAndView.addObject("yesterday", secondValue);
        return modelAndView;
    }
}

