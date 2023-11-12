package com.portfolio.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.portfolio.model.GitHubRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

@Service
public class GitHubService {
    private final String gitHubUrl = "https://api.github.com/users/LuisCarlosOliveira/repos";

    public List<GitHubRepository> getGitHubProjects() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(gitHubUrl, String.class);

        ObjectMapper mapper = new ObjectMapper();
        List<GitHubRepository> repositories = mapper.readValue(response, new TypeReference<List<GitHubRepository>>() {});
        return repositories;
    }
}