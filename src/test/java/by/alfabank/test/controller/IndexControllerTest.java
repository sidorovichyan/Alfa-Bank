package by.alfabank.test.controller;

import by.alfabank.test.entity.Gif;
import by.alfabank.test.service.ServiceGif;
import by.alfabank.test.service.ServiceRate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndView;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;


@RunWith(SpringRunner.class)
@WebMvcTest(IndexController.class)
public class IndexControllerTest {

    @Autowired
    private IndexController indexController;

    @MockBean
    private ServiceGif serviceGif;

    @MockBean
    private ServiceRate serviceRate;

    @Test
    public void whenReturnRichGif() {
       ModelAndView modelAndView =  indexController.doGet("RUB");
       assertEquals(HttpStatus.OK,modelAndView.getStatus());
       assertEquals("page",modelAndView.getViewName());
    }
}
