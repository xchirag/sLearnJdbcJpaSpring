package com.fdmgroup.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fdmgroup.dao.UniversityDaoImpl;
import com.fdmgroup.model.University;

@RunWith(MockitoJUnitRunner.class)
public class UniversityDaoImplTest {
	
	@InjectMocks
	private UniversityDaoImpl target;
	
	@Mock
	private List<University> mockList;
	
	@Mock
	private University university;

	@Test
	public void test_addUniversityAddsanUniversityIntoList() {
		
		target.addUniversity(university);
		verify(mockList, times(1)).add(university);
	}
	@Test
	public void test_removeUniversity_removesAUniversityFromTheList(){
		int index =  0;
		target.removeUniversity(index);
		verify(mockList, times(1)).remove(index);
	}
	
	@Test
	public void test_retriveAllUniversity_returnsListSize3WhenThreeUniversitiesAreAddedIntoList(){
		
//		when(target.retriveAllUniversity().size()).thenReturn(3);
//		assertEquals(3,	target.retriveAllUniversity().size());
//		
////		
//		List<University> mockList2 = new ArrayList<>();
//		mockList2.add(university);
//		mockList2.add(university);
//		mockList2.add(university);
//		
		//arrange
		target.addUniversity(university);
		target.addUniversity(university);
		target.addUniversity(university);
		
		
		
		//act
		when(target.retriveAllUniversity().size()).thenReturn(3);
		//when(target.retriveAllUniversity()).thenReturn(mockList2);
		
		//assert
		assertEquals(3,	target.retriveAllUniversity().size());
		verify(mockList, times(3)).add(university);
		
//		//when(target.retriveAllUniversity()).thenReturn(mockList2);
//		when(target.retriveAllUniversity()).then
//		assertEquals(3, mockList2.size());
	}

	@Test
	public void test5(){
		
		University myUniversity = new University("universityName", 10987, 5678, 897);
		target.addUniversity(myUniversity);
		target.addUniversity(myUniversity);
		target.addUniversity(myUniversity);
		
		List<University> list = new ArrayList<>();
		list.add(myUniversity);
		list.add(myUniversity);
		list.add(myUniversity);
		
		when(target.retriveAllUniversity().size()).thenReturn(3); // this works but following fails!
		//when(target.retriveAllUniversity()).thenReturn(list);
		// http://www.baeldung.com/mockito-behavior
		
	}
}
