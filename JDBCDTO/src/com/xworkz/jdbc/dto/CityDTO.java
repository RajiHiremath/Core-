package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class CityDTO implements Serializable{
	
	private int id;
	private String name;
	private int population;
	private String famousFor;
	
	public CityDTO() {
		System.out.println("invoked no args const");
	}

	public CityDTO(int id, String name, int population, String famousFor) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousFor = famousFor;
	}

	@Override
	public String toString() {
		return "CityDTO [id=" + id + ", name=" + name + ", population=" + population + ", famousFor=" + famousFor + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

}
