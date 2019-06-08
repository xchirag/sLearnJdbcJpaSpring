package com.fdmgroup.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fdmgroup.controller.UniversityControllerImpl;
import com.fdmgroup.dao.UniversityDao;
import com.fdmgroup.model.University;

@RunWith(MockitoJUnitRunner.class)
public class UniversityControllerImplTest {

	@InjectMocks
	private UniversityControllerImpl target;

	@Mock
	private UniversityDao mockDao;
	
	@Mock
	private University mockUniversity;

	@Test
	public void test_addUniversityInDatabase_callsAddUniversityMethodOfDatabase() {

		target.addUniversityInDatabase(mockUniversity);
		verify(mockDao, times(1)).addUniversity(mockUniversity);
	}

	@Test
	public void test_removeUniversityFromDatabase_calls_removeUniversityofDatabase() {

		int index = 0;
		target.removeUniversityFromDatabase(index);
		verify(mockDao, times(1)).removeUniversity(index);
	}

	@Test
	public void test_retriveUniversityFromDatabase_returnsUniversityandCalls_retriveUniversityOfDatabase(){
		int index = 0;
		
		target.retriveUniversityFromDatabase(index);
		verify(mockDao, times(1)).retriveUniversity(index);
		
		University mockUniversity2 = new University("universityName", 12000, 1, 786);
		when(target.retriveUniversityFromDatabase(0)).thenReturn(mockUniversity2);
		
		assertEquals(12000, target.retriveUniversityFromDatabase(0).getCapacityOfStudent());
		assertEquals("universityName", target.retriveUniversityFromDatabase(0).getUniversityName());
		assertEquals(1, target.retriveUniversityFromDatabase(0).getRank());
		assertEquals(786, target.retriveUniversityFromDatabase(0).getTotalCoursesAvailable());
		
		when(target.retriveUniversityFromDatabase(0)).thenReturn(mockUniversity);
		//assertEquals(mockUniversity, new University());
		//assertEquals(mockUniversity20, mockUniversity);
	}

	@Test
	public void test_retriveAllUniversityFromDatabase_Calls_retriveAllUniversityOfDatabase(){
		target.retriveAllUniversityFromDatabase();
		verify(mockDao, times(1)).retriveAllUniversity();
	}
}
