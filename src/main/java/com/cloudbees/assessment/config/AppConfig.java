package com.cloudbees.assessment.config;

import com.cloudbees.assessment.entity.Location;
import com.cloudbees.assessment.entity.Train;
import com.cloudbees.assessment.entity.TrainUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public Train train() {
        HashMap<Character, List<TrainUser>> sections = new HashMap<>();
        sections.put('A', new ArrayList<>());
        sections.put('B', new ArrayList<>());
        return new Train(londonLocation(), franceLocation(), 20, sections );
    }

}
