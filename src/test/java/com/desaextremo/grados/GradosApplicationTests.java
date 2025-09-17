package com.desaextremo.grados;

import com.desaextremo.grados.controller.GradosController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class GradosApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private GradosController controller;

    @Test
    void contextLoads() {
        assert controller != null;
    }

    @Test
    void centigradosAFahrenheit_ok() throws Exception {
        mockMvc.perform(get("/grados/centtofahr/0"))
                .andExpect(status().isOk())
                .andExpect(content().string("32.0"));
    }

    @Test
    void fahrenheitACentigrados_ok() throws Exception {
        mockMvc.perform(get("/grados/fahrtocent/32"))
                .andExpect(status().isOk())
                .andExpect(content().string("0.0"));
    }

    @Test
    void centigradosAKelvin_ok() throws Exception {
        mockMvc.perform(get("/grados/centtokelv/0"))
                .andExpect(status().isOk())
                .andExpect(content().string("273.15"));
    }

    @Test
    void kelvinACentigrados_ok() throws Exception {
        mockMvc.perform(get("/grados/kelvintocent/273.15"))
                .andExpect(status().isOk())
                .andExpect(content().string("0.0"));
    }
}
