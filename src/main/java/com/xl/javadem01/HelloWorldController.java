
package com.xl.javadem01;

import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@RestController
public class HelloWorldController extends WebMvcConfigurerAdapter {
  @RequestMapping("/hello")
  public String index() {
    
    return "{\"name\":1}";
  }

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**").allowedMethods("*").allowedOrigins("*").allowedHeaders("*");
    super.addCorsMappings(registry);
  }

}