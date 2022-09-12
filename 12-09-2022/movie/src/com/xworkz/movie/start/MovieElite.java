package com.xworkz.movie.start;

import com.xworkz.movie.dao.MovieDAO;
import com.xworkz.movie.dao.Impl.MovieDAOImpl;
import com.xworkz.movie.dto.MovieDTO;

public class MovieElite {

	public static void main(String[] args) {
		
		MovieDTO dto = new MovieDTO();
		dto.setId(1);
		
		dto.setHeroname("Sudeep");
		dto.setHeroinename("Jacqueline Fernandez");
		dto.setWwcollections(1125d);
		dto.setShootinglocations("");
		String[] producers= {"Jack Manjunath"};
		dto.setProducersname(producers);
		System.out.println(dto.getProducersname());
		String[] actors= {"Sudeep","Neeta Ashok", "Nirup Bhandari"};
		dto.setActors(actors);
		System.out.println(dto.getActors());
		dto.setReviews(4.8f);
		System.out.println(dto.getReviews());
		dto.setYearofrelease(2022);
		System.out.println(dto.getYearofrelease());
		dto.setDirectorname("Anup Bhandari");
		System.out.println(dto.getDirectorname());
		
		MovieDAO dao = new MovieDAOImpl();
		dao.create(dto);
	

	}

}
