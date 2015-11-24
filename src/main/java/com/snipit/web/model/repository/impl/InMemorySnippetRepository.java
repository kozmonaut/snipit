package com.snipit.web.model.repository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.snipit.web.model.Snippet;
import com.snipit.web.model.repository.SnippetRepository;

@Repository
public class InMemorySnippetRepository implements SnippetRepository {

    private List<Snippet> listOfSnippets = new ArrayList<Snippet>();

    public InMemorySnippetRepository() {
	Snippet tomcat = new Snippet("1", "Tomcat", "Java");
	tomcat.setDescription("This is Tomcat AS configuration file.");
	tomcat.setProject("Project One");

	Snippet glassfish = new Snippet("2", "Glassfish", "Server");
	glassfish.setDescription("This is Glassfish AS configuration file.");
	glassfish.setProject("Project Two");

	Snippet gitconfig = new Snippet("3", "Gitconfig", "Git");
	gitconfig.setDescription("This is gitconfig configuration file.");
	gitconfig.setProject("Project Three");

	listOfSnippets.add(tomcat);
	listOfSnippets.add(glassfish);
	listOfSnippets.add(gitconfig);

    }

    public List<Snippet> getAllSnippets() {
	return listOfSnippets;
    }

}
