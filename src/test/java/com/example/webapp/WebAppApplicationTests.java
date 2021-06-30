package com.example.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
//@ContextConfiguration(
//        classes =  {WebAppApplication.class, WebConfig.class},
//        loader = AnnotationConfigContextLoader.class)
@AutoConfigureMockMvc
class WebAppApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() throws  Exception {
        this.mockMvc.perform(get("/foo").param("page", "0")
                .param("size", "2"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }
}
