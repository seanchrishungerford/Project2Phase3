package com.springbootbasics;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

 

@RestController
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackData;

 
    @PostMapping("/addNewFeedback")
    public RedirectView newFeedback(Feedback feedback) {

        feedbackData.save(feedback);
        return new RedirectView("allFeedback");

    }


    @GetMapping("/addNewFeedback")
    public ModelAndView addNewFeedback() {

        Feedback fbk = new Feedback();
        return new ModelAndView("newFeedback", "form", fbk);

    }

    @GetMapping("/allFeedback")
    public ModelAndView feedbacks() {
        List<Feedback> allFeedback = (List<Feedback>) feedbackData.findAll();
        return new ModelAndView("allFeedback", "feedback", allFeedback);

    }

}