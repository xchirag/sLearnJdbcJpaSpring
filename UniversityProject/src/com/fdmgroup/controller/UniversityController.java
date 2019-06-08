package com.fdmgroup.controller;

import java.util.List;

import com.fdmgroup.model.University;

public interface UniversityController {

	void addUniversityInDatabase(University university);

	void removeUniversityFromDatabase(int index);

	University retriveUniversityFromDatabase(int index);

	List<University> retriveAllUniversityFromDatabase();

}