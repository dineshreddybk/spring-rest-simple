package com.model;

public class Movie {
	private String id;
    private String title;
    private int releaseYear;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String id, String title, int releaseYear) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
	}
}
