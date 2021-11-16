package com.xworkz.dp.dto;

public class SeasonDTO {
	
	      private String name;
	      private String duration;
	      private float temperature;
	      private String typeFruit;
	      
	      public SeasonDTO()
		  {
			  System.out.println("SeasonDTO no arg invoke const");
			  
		  }

		public SeasonDTO(String name, String duration, float temperature, String typeFruit) {
			super();
			this.name = name;
			this.duration = duration;
			this.temperature = temperature;
			this.typeFruit = typeFruit;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public float getTemperature() {
			return temperature;
		}

		public void setTemperature(float temperature) {
			this.temperature = temperature;
		}

		public String getTypeFruit() {
			return typeFruit;
		}

		public void setTypeFruit(String typeFruit) {
			this.typeFruit = typeFruit;
		}
	      
}


