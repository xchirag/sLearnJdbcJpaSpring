package com.fdmgroup.controller;

import java.util.List;

import com.fdmgroup.dao.UniversityDao;
import com.fdmgroup.model.University;

public class UniversityControllerImpl implements UniversityController {
	
	private UniversityDao injectedDao;

	@Override
	public void addUniversityInDatabase(University university) {
		injectedDao.addUniversity(university);
	}

	@Override
	public void removeUniversityFromDatabase(int index){
		injectedDao.removeUniversity(index);
	}
	
	@Override
	public University retriveUniversityFromDatabase(int index){
		return injectedDao.retriveUniversity(index);
	}
	
	// 
	@Override
	public List<University> retriveAllUniversityFromDatabase(){
		return injectedDao.retriveAllUniversity();
	}
}
