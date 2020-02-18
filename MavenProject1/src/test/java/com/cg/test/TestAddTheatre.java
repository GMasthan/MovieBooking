package com.cg.test;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.cg.exception.IdException;
import com.cg.exception.NameException;
import com.cg.exception.TheatreException;
import com.cg.service.TheatreService;
import com.cg.service.TheatreServiceImpl;

public class TestAddTheatre {
	
	@Test
	public void TheatreTest1()   {
		TheatreService ser=new TheatreServiceImpl();
		assertThrows(NameException.class,()->ser.addNewTheatre("1234","UniMall","Jalandhar",2,3));
	}
	
	@Test
	public void TheatreTest2()  {
		TheatreService ser=new TheatreServiceImpl();
		assertThrows(IdException.class,()->ser.addNewTheatre("2333","Mall67775","Jalandhar",2,3));
	}
	
	@Test
	public void TheatreTest3() {
		TheatreService ser=new TheatreServiceImpl();
		assertThrows(IdException.class,()->ser.addNewTheatre("1200fg","fgsf4576","Jalandhar",2,3));
	}
	

	}
	


