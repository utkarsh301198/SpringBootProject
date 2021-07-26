package com.utkarsh;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.utkarsh.controller.Library;
import com.utkarsh.controller.LibraryController;
import com.utkarsh.service.LibraryService;

@SpringBootTest
class SpringBootRestServiceApplicationTests {
	@Autowired
	LibraryController con;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void checkBuildIDLogic() {
		LibraryService lib= new LibraryService();
		String id = lib.buildId("ZMAN",24);
		assertEquals(id,"OLDZMAN24");
	}
	
//	@Test
//	public void addBookTest() {
//		ResponseEntity response = con.addBookImplimentation(buildLibrary());
//		System.out.println(response.getStatusCode());  
//	}
//	public Library buildLibrary() {
//		Library lib= new Library();
//		lib.setAisle(203);
//		lib.setBook_name("Spring");
//		lib.setIsbn("qwe");
//		lib.setAuthor("Utkarsh");
//		lib.setId("qwe203");
//		return lib;
//	}

}
