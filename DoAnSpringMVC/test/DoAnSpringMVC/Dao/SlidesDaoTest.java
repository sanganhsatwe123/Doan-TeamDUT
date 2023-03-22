package DoAnSpringMVC.Dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import DoAnSpringMVC.Entity.Slides;

class SlidesDaoTest {

	private DriverManagerDataSource dataSource;
	private SlidesDao dao;
	
	@Test
	void testSave() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/sport_store");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		
		dao = new SlidesDaoImpl(dataSource);
		
		Slides slides = new Slides("dick.png", "it a dick", "dick");
		int result = dao.save(slides);
		
		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testList() {
		fail("Not yet implemented");
	}

}
