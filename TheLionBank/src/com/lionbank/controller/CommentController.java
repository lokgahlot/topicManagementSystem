package com.lionbank.controller;

import com.lionbank.model.Comment;



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
@RequestMapping("/api/comment")
public class CommentController {


    /**
     * Get the Topics for the Analyses.
     * @return list of Topics
     */
    @RequestMapping(method = RequestMethod.GET, value = "/getComments")
    @ResponseBody

    public final Set<Comment> getComments() {

    }



    /**
     * Get the variants for the Analyses.
     * @param comment
     */
    @RequestMapping(method = RequestMethod.POST, value = "/addComment")
    @ResponseBody
    public final void addComment(@RequestBody Comment comment) {
    }

    /**
     * Get the variants for the Analyses.
     * @param comment
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteComment")
    @ResponseBody
    public final void deleteComment(@PathVariable('id') String commentID) {
    }

    /**
     * Get the variants for the Analyses.
     * @param comment
     */
    @RequestMapping(method = RequestMethod.POST, value = "{id}/upvotes/")
    @ResponseBody
    public final void deleteComment(@PathVariable('id') String commentID) {
    }


}
