package com.objectmapper.objectmapper.startup;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.objectmapper.objectmapper.entity.Student;
import com.objectmapper.objectmapper.repo.StudentRepo;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@Log
public class StartUpUtility implements CommandLineRunner {
    @Value("${demo.json.string}") private String json;
    @Autowired
    private StudentRepo repo;
    @Override
    public void run(String... args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);//Deserialization
        Student value = mapper.readValue(json, Student.class);
        mapper.writeValue(new File("target/stu.json"),
                Student.class);//serialization
        Student save = repo.save(value);
        //Log.info(save.toString());




    }
}
