package com.vnd.courseapidata.controllers;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {

    @Autowired
    private topicService topicService;

    @RequestMapping("/topics")
    public List<topics> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public topics getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
    

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody topics topics){
        topicService.addTopic(topics);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody topics topics, @PathVariable String id){
        topicService.updateTopic(id, topics);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

}
