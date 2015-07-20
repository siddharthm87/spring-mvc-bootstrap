package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by siddharthmolleti on 7/18/15.
 */
@Controller
@RequestMapping("/projects")
public class ProjectsController {
    @RequestMapping(method = RequestMethod.GET)
    public String mapPage() {
        return "projects";
    }
}
