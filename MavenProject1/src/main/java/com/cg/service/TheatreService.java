package com.cg.service;

import java.util.List;

import com.cg.entity.Theatre;
import com.cg.exception.IdException;
import com.cg.exception.NameException;
import com.cg.exception.TheatreException;

public interface TheatreService {
	public String addNewTheatre(String id, String name, String location, int rows, int columns)
			throws IdException, NameException, TheatreException;
	public List<Theatre> viewTheatres();

}
