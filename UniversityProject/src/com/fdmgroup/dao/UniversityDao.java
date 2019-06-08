package com.fdmgroup.dao;

import java.util.List;

import com.fdmgroup.model.University;

public interface UniversityDao {

	void addUniversity(University university);

	void removeUniversity(int index);

	University retriveUniversity(int index);

	List<University> retriveAllUniversity();

}