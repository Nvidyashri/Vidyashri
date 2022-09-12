package com.xworkz.speaker.dao.impl;

import com.xworkz.speaker.dao.SpeakerDAO;
import com.xworkz.speaker.dto.SpeakerDTO;


public class SpeakerDAOImpl implements SpeakerDAO {
	
	
	private SpeakerDTO[] speakers=new SpeakerDTO[14];
	private int index=0;
	
	@Override
	public boolean create(SpeakerDTO dto) {
		this.speakers[index]=dto;
		System.out.println("Speaker is saved,"+dto+"into index"+this.index);
		this.index++;
		return true;
		
	}


}