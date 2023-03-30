package com.laptrinhjavaweb.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.servlet.ModelAndView;

import DAO.MenusDAO;
import model.Menus;

public class BaseController {
	
	public ModelAndView mvshare = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		MenusDAO dao = new MenusDAO();
		List<Menus> menuList = dao.readMenus();
		mvshare.addObject("menuList", menuList);
		return mvshare;
	}
}
