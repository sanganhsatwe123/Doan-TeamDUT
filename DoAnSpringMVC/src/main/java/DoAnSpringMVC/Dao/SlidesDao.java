package DoAnSpringMVC.Dao;

import java.util.List;

import DoAnSpringMVC.Entity.Slides;

public interface SlidesDao {
	
	public int save(Slides slides);
	
	public int update(Slides slides);
	
	public int delete(Slides slides);
	
	public Slides get(int id);
	
	public List<Slides> list();
}
