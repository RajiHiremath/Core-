package com.xworkz.dp.dto;

public class IplDTO {
	
		private String name;
		private Integer teamSize;
		private Integer noOfCoches;
		private String owner;
		private String sponsor;
		
		public IplDTO() 
		{
			System.out.println("invoked IplDTO no args const");
		}

		public IplDTO(String name, Integer teamSize, Integer noOfCoches, String owner, String sponsor) {
			super();
			this.name = name;
			this.teamSize = teamSize;
			this.noOfCoches = noOfCoches;
			this.owner = owner;
			this.sponsor = sponsor;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getTeamSize() {
			return teamSize;
		}

		public void setTeamSize(Integer teamSize) {
			this.teamSize = teamSize;
		}

		public Integer getNoOfCoches() {
			return noOfCoches;
		}

		public void setNoOfCoches(Integer noOfCoches) {
			this.noOfCoches = noOfCoches;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getSponsor() {
			return sponsor;
		}

		public void setSponsor(String sponsor) {
			this.sponsor = sponsor;
		}
	}

