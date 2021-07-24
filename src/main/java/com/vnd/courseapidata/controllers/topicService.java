package com.vnd.courseapidata.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class topicService {

    @Autowired
    private topicRepository topicRepository;

    public List<topics> getAllTopics(){
        List<topics> topic = new ArrayList<>();
        topicRepository.findAll()
        .forEach(topic::add);
        return topic;
    }

    public topics getTopic(String id){
        return topicRepository.findById(id).orElseGet(topics::new);
    }

    public void addTopic(topics topic) {
       topicRepository.save(topic);
    }

    public void updateTopic(String id, topics topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(String id){
        topicRepository.deleteById(id);
    }
    
}
