package com.cg.service;

import java.util.List;

import com.cg.dao.TheatreDao;
import com.cg.dao.TheatreDaoImpl;
import com.cg.entity.Theatre;
import com.cg.exception.IdException;
import com.cg.exception.LocationException;
import com.cg.exception.NameException;
import com.cg.exception.TheatreException;

public class TheatreServiceImpl implements TheatreService {
	TheatreDao theatreDao = new TheatreDaoImpl();

	public boolean validateId(String id) throws IdException {
		if (!id.matches("[0-9]{4} ")) {
			throw new IdException("Id is inavlid");
		}
		return true;
	}

	public boolean validateTheatreName(String tname) throws NameException {
		if (!tname.matches("[a-zA-Z]")) {
			throw new NameException("Name is Invalid");
		}
		return true;
	}

	public String addNewTheatre(String theatreId, String name, String location, int rows, int columns)
			throws IdException, NameException, TheatreException 
	{
		if (validateId(theatreId) && validateTheatreName(name) ) {

			if(theatreDao.getTheatre(theatreId)!= null);{
				Theatre theatre = new Theatre(theatreId, name, location, rows, columns);
				theatreDao.addTheatre(theatre);
				{
					return "Theatre Inserted Successfully";
				}
			}
		}
		return "Theatre ID already exits";
	}
	@Override
	public List<Theatre> viewTheatres() {

		return theatreDao.getTheatres(); 
	}
}
