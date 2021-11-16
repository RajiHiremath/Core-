package com.xworkz.dp.dto;
import com.xworkz.dp.Constants.Genre;
public class WebSeriesDTO 
{
   private String name;
   private Genre genre;
   private String cast;
   private  int noOfCharacters;
   private float rating;
   private int totalSeason;
   private int currentSeason;
   
   public WebSeriesDTO() 
   {
	System.out.println("invoked no-arg constructor");
   }

public WebSeriesDTO(String name, Genre genre, String cast, int noOfCharacters, float rating, int totalSeason,
		int currentSeason) 
{
	this.name = name;
	this.genre = genre;
	this.cast = cast;
	this.noOfCharacters = noOfCharacters;
	this.rating = rating;
	this.totalSeason = totalSeason;
	this.currentSeason = currentSeason;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Genre getGenre() {
	return genre;
}

public void setGenre(Genre genre) {
	this.genre = genre;
}

public String getCast() {
	return cast;
}

public void setCast(String cast) {
	this.cast = cast;
}

public int getNoOfCharacters() {
	return noOfCharacters;
}

public void setNoOfCharacters(int noOfCharacters) {
	this.noOfCharacters = noOfCharacters;
}

public float getRating() {
	return rating;
}

public void setRating(float rating) {
	this.rating = rating;
}

public int getTotalSeason() {
	return totalSeason;
}

public void setTotalSeason(int totalSeason) {
	this.totalSeason = totalSeason;
}

public int getCurrentSeason() {
	return currentSeason;
}

public void setCurrentSeason(int currentSeason) {
	this.currentSeason = currentSeason;
}

public WebSeriesDTO[] saveDetails() {
	
	return null;
}

public void delete(int i) 
{
	
}

public void displayDetails() 
{
	
}

}
