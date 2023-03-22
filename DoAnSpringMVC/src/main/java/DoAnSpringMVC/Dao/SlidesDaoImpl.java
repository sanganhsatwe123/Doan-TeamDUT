package DoAnSpringMVC.Dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import DoAnSpringMVC.Entity.Slides;

public class SlidesDaoImpl implements SlidesDao {

	private JdbcTemplate jdbcTemplate;
	
	public SlidesDaoImpl(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Slides slides) {
		String sql = "INSERT INTO slides (id, img, caption, content) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, slides.getId(), slides.getImg(), slides.getCaption(), slides.getContent());
		return 0;
	}

	@Override
	public int update(Slides slides) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Slides slides) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Slides get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Slides> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
