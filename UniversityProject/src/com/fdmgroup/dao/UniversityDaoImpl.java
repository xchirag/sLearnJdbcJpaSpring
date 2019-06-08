package com.fdmgroup.dao;

import java.util.List;

import com.fdmgroup.model.University;

public class UniversityDaoImpl implements UniversityDao {

	public List<University> listofUniversity;
	
	@Override
	public void addUniversity(University university){
		listofUniversity.add(university);
	}
	
	@Override
	public void removeUniversity(int index){
		listofUniversity.remove(index);
	}
	
	@Override
	public University retriveUniversity(int index){
		return listofUniversity.get(index);
	}
	
	@Override
	public List<University> retriveAllUniversity(){
		return listofUniversity;
	}
}
