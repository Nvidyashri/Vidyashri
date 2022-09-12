package com.xworkz.movie.dao.Impl;

import com.xworkz.movie.dao.MovieDAO;
import com.xworkz.movie.dto.MovieDTO;

public class MovieDAOImpl implements MovieDAO{
	
	private MovieDTO[] movies = new MovieDTO[14];
	private int index = 0;
	
	@Override
	public boolean create(MovieDTO dto) {
		
		this.movies[index] = dto;
		System.out.println("Movie is saved,"+dto +"into index"+this);
		this.index++;
		return true;
	}
	

}
