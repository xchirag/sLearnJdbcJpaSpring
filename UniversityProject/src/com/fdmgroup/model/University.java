package com.fdmgroup.model;

public class University {
	
	private int capacityOfStudent;
	private int rank, totalCoursesAvailable;
		
	private String universityName;
	
	public University(){
		
	}

	public University(String universityName, int capacityOfStudent, int rank, int totalCoursesAvailable) {
		this.universityName = universityName;
		this.capacityOfStudent = capacityOfStudent;
		this.rank = rank;
		this.totalCoursesAvailable = totalCoursesAvailable;
	}

	public int getCapacityOfStudent() {
		return capacityOfStudent;
	}

	public int getRank() {
		return rank;
	}

	public int getTotalCoursesAvailable() {
		return totalCoursesAvailable;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setCapacityOfStudent(int capacityOfStudent) {
		this.capacityOfStudent = capacityOfStudent;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void setTotalCoursesAvailable(int totalCoursesAvailable) {
		this.totalCoursesAvailable = totalCoursesAvailable;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Override
	public String toString() {
		return "University [Name=" + universityName + ", rank=" + rank + ", capacityOfStudent="
				+ capacityOfStudent + ", totalCoursesAvailable=" + totalCoursesAvailable + "]";
	}

}
