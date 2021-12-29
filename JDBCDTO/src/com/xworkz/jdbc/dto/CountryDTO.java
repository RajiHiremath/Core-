package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable
{
		private int id;
		private String name;
		private int code;
		private String continent;
		
		public CountryDTO() {
			System.out.println("invoked no args const");
		}

		public CountryDTO(int id, String name, int code, String continent) {
			super();
			this.id = id;
			this.name = name;
			this.code = code;
			this.continent = continent;
		}

		@Override
		public String toString() {
			return "CountryDTO [id=" + id + ", name=" + name + ", code=" + code + ", continent=" + continent + "]";
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

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public String getContinent() {
			return continent;
		}

		public void setContinent(String continent) {
			this.continent = continent;
		}
		
}
