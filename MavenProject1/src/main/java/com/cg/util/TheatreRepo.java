package com.cg.util;

import java.util.*;
import com.cg.entity.Theatre;
public class TheatreRepo {
	private static Map<String, Theatre> TheatreMap=new HashMap();
	static
	{
		TheatreMap.put("1111", new Theatre("1111","Viva Mall","Jalandhar",12,20));
		TheatreMap.put("2222",new Theatre("2222","Uni Mall","Phagwara",25,20));
		TheatreMap.put("3333",new Theatre("3333","Inox Mall","Jalandhar",30,35));	
		TheatreMap.put("4444",new Theatre("4444","Rhee Mall","Mexico",12,40));
		TheatreMap.put("5555",new Theatre("5555","Glenn Mall","San Diego",25,25));
		TheatreMap.put("6666",new Theatre("6666","Inorbit Mall","Hyderabad",20,30));
	}
	public static Map<String,Theatre> getTheatre(){
		return TheatreMap;
	}
	
	
}

