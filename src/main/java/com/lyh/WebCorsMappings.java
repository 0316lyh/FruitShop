package com.lyh;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author :liangyuhang1
 * @className :WebCorsMappings
 * @date :2023/4/27/21:54
 */
/*@SpringBootConfiguration*/
public class WebCorsMappings implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("POST","GET","PUT","DELETE")
                .allowedHeaders("*")
                .maxAge(1800);
    }
}
