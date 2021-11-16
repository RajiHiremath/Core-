package com.xworkz.dp.dto;

public class ParkDTO {
	    private String name;
		private String location;
		private int noOfbenches;
		private boolean exerciseTools;
		private String openTime;
		private String closeTime;
		
		 public ParkDTO()
		  {
			  System.out.println("ParkDTO no arg invoke const");
			  
		  }

		public ParkDTO(String name, String location, int noOfbenches, boolean exerciseTools, String openTime,
				String closeTime) {
			super();
			this.name = name;
			this.location = location;
			this.noOfbenches = noOfbenches;
			this.exerciseTools = exerciseTools;
			this.openTime = openTime;
			this.closeTime = closeTime;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public int getNoOfbenches() {
			return noOfbenches;
		}

		public void setNoOfbenches(int noOfbenches) {
			this.noOfbenches = noOfbenches;
		}

		public boolean isExerciseTools() {
			return exerciseTools;
		}

		public void setExerciseTools(boolean exerciseTools) {
			this.exerciseTools = exerciseTools;
		}

		public String getOpenTime() {
			return openTime;
		}

		public void setOpenTime(String openTime) {
			this.openTime = openTime;
		}

		public String getCloseTime() {
			return closeTime;
		}

		public void setCloseTime(String closeTime) {
			this.closeTime = closeTime;
		}
		 

	}


