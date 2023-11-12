package com.portfolio.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.portfolio.model.GitHubRepository;
import com.portfolio.service.GitHubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProjectsController {

    @Autowired
    private GitHubService gitHubService;

    @GetMapping("/projects")
    public String projects(Model model) throws JsonProcessingException {
        List<GitHubRepository> projects = null;
        try {
            projects = gitHubService.getGitHubProjects();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        model.addAttribute("projects", projects);
        return "projects";
    }
}
