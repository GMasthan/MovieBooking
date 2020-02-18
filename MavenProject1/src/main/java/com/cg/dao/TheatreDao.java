package com.cg.dao;

import java.util.List;
import java.util.Map;

import com.cg.entity.Theatre;
import com.cg.exception.TheatreException;

public interface TheatreDao {
	public boolean addTheatre(Theatre theatre);
	public List<Theatre> getTheatres();
	public Theatre getTheatre(String theatreId)throws TheatreException;

}
