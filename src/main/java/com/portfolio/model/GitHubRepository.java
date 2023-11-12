package com.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitHubRepository {
    private String name;
    private String description;
    private String html_url;
    // Construtor padrão
    public GitHubRepository() {
    }

    // Construtor com todos os campos
    public GitHubRepository(String name, String description, String html_url) {
        this.name = name;
        this.description = description;
        this.html_url = html_url;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    // Método toString (opcional, útil para depuração)
    @Override
    public String toString() {
        return "GitHubRepository{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", html_url='" + html_url + '\'' +
                '}';
    }
}

