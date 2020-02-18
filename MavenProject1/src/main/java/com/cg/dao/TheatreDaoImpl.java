package com.cg.dao;

import java.util.*;
import java.util.stream.Collectors;

import com.cg.entity.Theatre;
import com.cg.exception.TheatreException;
import com.cg.util.TheatreRepo;

public class TheatreDaoImpl implements TheatreDao {
   Map<String, Theatre> theatreMap = TheatreRepo.getTheatre();
	@Override
	public boolean addTheatre(Theatre theatre) {
		theatreMap.put(theatre.getTheatreId(), theatre);
		return false;
	}

	@Override
	public List<Theatre> getTheatres() {
		List<Theatre> lst = theatreMap.values().stream().collect(Collectors.toList());
		return lst;
	}

	@Override
	public Theatre getTheatre(String theatreId)throws TheatreException {
	  if (!theatreMap.containsKey(theatreId))
			  throw new TheatreException("Theatre does not exists!.");
		return theatreMap.get(theatreId);
	}
	

}

