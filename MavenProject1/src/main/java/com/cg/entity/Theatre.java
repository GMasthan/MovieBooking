package com.cg.entity;

public class Theatre {
	// Creating the movie details variables as private.
	private String theatreId;
	private String theatreName;
	private String location;
	private int totalRows;
	private int totalColumns;

	// Creating default constructor
	public Theatre() {
	}
	// Creating parameterized constructor

	public Theatre(String theatreId, String theatreName, String location, int totalRows, int totalColumns) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.location = location;
		this.totalRows = totalRows;
		this.totalColumns = totalColumns;
	}

	// Getters and Setters for the movie variables.
	public String getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getTotalColumns() {
		return totalColumns;
	}

	public void setTotalColumns(int totalColumns) {
		this.totalColumns = totalColumns;
	}

	@Override
	public String toString() {
		return theatreId+" "+ theatreName+" " + location+" "+  totalRows+" " + totalColumns;
	}
	
}
