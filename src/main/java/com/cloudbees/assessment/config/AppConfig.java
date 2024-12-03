package com.cloudbees.assessment.config;

import com.cloudbees.assessment.entity.Location;
import com.cloudbees.assessment.entity.Train;
import com.cloudbees.assessment.entity.TrainSection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class AppConfig {

    @Bean
    public Location londonLocation(){
        return new Location("London");
    }

    @Bean
    public Location franceLocation(){
        return new Location("Paris");
    }

    @Bean
    public TrainSection trainSectionA(){
        return new TrainSection(40);
    }

    @Bean
    public TrainSection trainSectionB(){
        return new TrainSection(50);
    }

    @Bean
    public Train train() {
        HashMap<Character, TrainSection> sections = new HashMap<>();
        sections.put('A', trainSectionA());
        sections.put('B', trainSectionB());
        return new Train(londonLocation(), franceLocation(), 20, sections );
    }

}
