package com.spring.listsetmapdatamembers.SpringProject4;
import java.util.*;
public class Employeedm {
	
	List<String> technologies;
	Set<String> projects;
	Map<String ,String> companies;
	public Employeedm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employeedm(List<String> technologies, Set<String> projects, Map<String, String> companies) {
		super();
		this.technologies = technologies;
		this.projects = projects;
		this.companies = companies;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	public Map<String, String> getCompanies() {
		return companies;
	}
	public void setCompanies(Map<String, String> companies) {
		this.companies = companies;
	}
	@Override
	public String toString() {
		return "Employeedm [technologies=" + technologies + ", projects=" + projects + ", companies=" + companies + "]";
	}
	
	
	

}
