package com.lionbank.controller;

import com.lionbank.model.Topic;



import java.util.List;
import java.util.Set;

import org.apache.commons.lang.BooleanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * RESTful web controller for Analyses entities.
 */
@Controller
@RequestMapping("/api/topic")
public class TopicController {


    /**
     * Get the Topics for the Analyses.
     * @return list of Topics
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getTopics")
    @ResponseBody

    public final Set<Topic> getTopics() {

    }



    /**
     * Get the variants for the Analyses.
     * @param Topic
     */
    @RequestMapping(method = RequestMethod.POST, value = "/addTopic")
    @ResponseBody
    public final void addTopic(@RequestBody Topic topic) {
    }


}
