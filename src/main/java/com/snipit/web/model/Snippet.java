package com.snipit.web.model;

import java.util.Date;

public class Snippet {
	
	private String snippetId;
	private String name;
	private String description;
	private Date creationDate;
	private String code;
	private String project;
	private String label;
	private Integer popularity;
	
	public Snippet() {
		super();
	}
	
	public Snippet(String snippetId, String name, String label) {
		this.snippetId = snippetId;
		this.name = name;
		this.label = label;
	}
	
	public String getSnippetId() {
		return snippetId;
	}
	public void setSnippetId(String snippetId) {
		this.snippetId = snippetId;
	}
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
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Integer getPopularity() {
		return popularity;
	}
	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snippet other = (Snippet) obj;
		if (snippetId == null) {
			if (other.snippetId != null)
				return false;
		} else if (!snippetId.equals(other.snippetId))
			return false;
		return true;
	}
	
	//Snippet hash id
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((snippetId == null) ? 0 : snippetId.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Snippet [snippetId=" + snippetId + ", name=" + name + "]";
	}
}
