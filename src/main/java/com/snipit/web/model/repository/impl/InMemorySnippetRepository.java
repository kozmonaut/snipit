package com.snipit.web.model.repository.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.snipit.web.model.Snippet;
import com.snipit.web.model.repository.SnippetRepository;
import java.util.Date;

@Repository
public class InMemorySnippetRepository implements SnippetRepository {

    private List<Snippet> listOfSnippets = new ArrayList<Snippet>();

    // Create dummy snippets
    public InMemorySnippetRepository() {
	Snippet tomcat = new Snippet("1", "Tomcat", "Java");
	tomcat.setDescription("This is Tomcat AS configuration file.");
	tomcat.setCreationDate(new Date());
	tomcat.setProject("Project1");
	tomcat.setPopularity(6);

	Snippet glassfish = new Snippet("2", "Glassfish", "Server");
	glassfish.setDescription("This is Glassfish AS configuration file.");
	glassfish.setCreationDate(new Date());
	glassfish.setProject("Project2");
	glassfish.setPopularity(3);

	Snippet gitconfig = new Snippet("3", "Gitconfig", "Git");
	gitconfig.setDescription("This is gitconfig configuration file.");
	gitconfig.setCreationDate(new Date());
	gitconfig.setProject("Project3");
	gitconfig.setPopularity(13);

	listOfSnippets.add(tomcat);
	listOfSnippets.add(glassfish);
	listOfSnippets.add(gitconfig);

    }

    // List of all snippets
    public List<Snippet> getAllSnippets() {
	return listOfSnippets;
    }

    // Fetch snippet by id
    public Snippet getSnippetById(String snippetId) {
	Snippet snippetById = null;
	for (Snippet snippet : listOfSnippets) {
	    if (snippet != null && snippet.getSnippetId() != null && snippet.getSnippetId().equals(snippetId)) {
		snippetById = snippet;
		break;
	    }
	}
	if (snippetById == null) {
	    throw new IllegalArgumentException("No snippets found with the snippet id: " + snippetId);
	}
	return snippetById;
    }

    @Override
    public List<Snippet> getSnippetsByProject(String project) {
	List<Snippet> snippetsByProject = new ArrayList<Snippet>();
	for (Snippet snippet : listOfSnippets) {
	    if (project.equalsIgnoreCase(snippet.getProject())) {
		snippetsByProject.add(snippet);
	    }
	}
	return snippetsByProject;
    }

}
