package com.laptrinhjavaweb.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import DAO.BillDAO;
import DAO.CartDAO;
import DAO.CategoriesDAO;
import DAO.CustomerDAO;
import DAO.ProductDAO;
import DAO.UserDAO;
import model.Bill;
import model.Categories;
import model.Customer;
import model.Product;
import model.Users;
import model.item_listingData;
import model.slides;
import model.Cart;

@Controller(value = "homeControllerOfLogin")
public class HomeController extends BaseController {

	@RequestMapping(value = "/dangnhap-post", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView property(HttpServletRequest request) {
		UserDAO dao = new UserDAO();
		if (dao.CheckLogin(request.getParameter("email"), request.getParameter("password"))) {
			Users user = new Users();
			user.setEmail(request.getParameter("email"));
			user.setPassword(request.getParameter("password"));
			HttpSession userSession = request.getSession();
			userSession.setAttribute("userSession", user);
			return new ModelAndView("redirect:/trang-chu");
		} else {
			return new ModelAndView("redirect:/dangnhap");
		}

	}

	@RequestMapping(value = "/dangxuat")
	public RedirectView Dangxuat(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("userSession");
		return new RedirectView("trang-chu");
	}

	@RequestMapping("/dangky")
	public String Dangky() {
		return "dangky";
	}
	
	@RequestMapping(value = "/dangkypost", method = RequestMethod.POST)
	public ModelAndView DangkyPost(HttpServletRequest request) {
		UserDAO dao = new UserDAO();
		
		Users user = new Users();
		user.setName(request.getParameter("username"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		if (dao.addUser(user) == 1) {
			HttpSession userSession = request.getSession();
			userSession.setAttribute("userSession", user);
			return new ModelAndView("redirect:/trang-chu");
		} else {
			return new ModelAndView("redirect:/dangky");
		}

	}

	@RequestMapping("/quanlyuser")
	public ModelAndView Quanlytaikhoan() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/quanlyuser");
		UserDAO dao = new UserDAO();
		List<Users> userList = dao.readUsers();
		mav.addObject("userList", userList);
		return mav;
	}
	
	@RequestMapping("/quanlyslides")
	public ModelAndView Quanlyslides() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/quanlyslides");
		ProductDAO dao = new ProductDAO();
		List<slides> userList = dao.readProductSlides();
		mav.addObject("userList", userList);
		return mav;
	}

	@RequestMapping("/quanlyproduct")
	public ModelAndView Quanlysanpham() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/quanlysanpham");
		ProductDAO dao = new ProductDAO();
		List<Product> productList = dao.readProduct();
		mav.addObject("productList", productList);
		mav.addObject("productDAO", dao);
		return mav;
	}

	@RequestMapping("/quanlyhoadon")
	public ModelAndView Quanlyhoadon() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/quanlyhoadon");
		BillDAO dao = new BillDAO();
		List<Bill> billList = dao.readBill();
		mav.addObject("billList", billList);
		mav.addObject("billDAO", dao);
		return mav;
	}

	@RequestMapping("/quanlykhachhang")
	public ModelAndView Quanlykhachhang() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/quanlykhachhang");
		CustomerDAO dao = new CustomerDAO();
		List<Customer> customerList = dao.readCustomer();
		mav.addObject("customerList", customerList);
		mav.addObject("customerDAO", dao);
		return mav;
	}

	@RequestMapping("/addproduct")
	public ModelAndView addProduct() {
		CategoriesDAO categoryDAO = new CategoriesDAO();
		ModelAndView model = new ModelAndView();
		List<Categories> listCategory = categoryDAO.readCategories();
		model.addObject("listCategory", listCategory);
		model.setViewName("admin/addProduct");
		return model;
	}

	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	public ModelAndView AddBill(MultipartHttpServletRequest request) {

		ProductDAO dao = new ProductDAO();
		Product product = new Product();
		MultipartFile file1 = request.getFile("file1");
		ModelAndView model = new ModelAndView();

		// handle anh 1
		if (!file1.isEmpty()) {
			try {
				String originalFilename = file1.getOriginalFilename();
				String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
				String newFilename = "hinh1"
						+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + extension;
				byte[] bytes = file1.getBytes();
				ServletContext context = request.getServletContext();

				String path1 = context.getRealPath("/resources/images/" + newFilename);
				product.setProductImage(newFilename);
				FileOutputStream fos = new FileOutputStream(path1);
				fos.write(bytes);
				fos.close();
				model.addObject("message1", "File uploaded successfully");

			} catch (IOException e) {
				e.printStackTrace();
				model.addObject("message2", "File upload failed");
				return new ModelAndView("redirect:/addproduct");
			}
		} else {
			model.addObject("message2", "Please select a file to upload");
			return new ModelAndView("redirect:/addproduct");
		}
		// handle anh 2
		
		product.setProductName(request.getParameter("productname"));
		product.setListPrice(Integer.parseInt(request.getParameter("listprice")));
		product.setCategoryID(Long.parseLong(request.getParameter("categoryID")));
		System.out.println(request.getParameter("description"));
		product.setDescription(request.getParameter("description"));

		if (dao.addProduct(product) == 1) {
			return new ModelAndView("redirect:/quanlyproduct");
		} else {
			return new ModelAndView("redirect:/spring-mvc/addproduct");
		}
	}
	
	@RequestMapping(value= {"/", "/homepage"}, method = RequestMethod.GET)
	public ModelAndView Index(){
		
		mvshare.setViewName("user/index");
		ProductDAO dao = new ProductDAO();
		CategoriesDAO daoCate = new CategoriesDAO();
		List<slides> userList = dao.readProductSlides();
		List<Categories> cateList = daoCate.readCategories();
		List<item_listingData> itemList = dao.readProductListing();
		mvshare.addObject("userList", userList);
		mvshare.addObject("cateList", cateList);
		mvshare.addObject("itemList", itemList);
		return mvshare;
	}
	
	@RequestMapping(value= "product/{id}", method = RequestMethod.GET)
	public ModelAndView Product(@PathVariable long id) throws SQLException {
		mvshare.setViewName("user/product");
		ProductDAO dao = new ProductDAO();
		CategoriesDAO daoCate = new CategoriesDAO();
		List<slides> userList = dao.readProductSlides();
		List<Categories> cateList = daoCate.readCategories();
		List<item_listingData> itemList = dao.readProductListing();
		mvshare.addObject("userList", userList);
		mvshare.addObject("cateList", cateList);
		mvshare.addObject("itemList", dao.getProductById(id));
		return mvshare;
	}
	
	@RequestMapping(value= "AddCart/{id}")
	public String Cart(HttpServletRequest request ,HttpSession session ,@PathVariable long id) throws SQLException {
		HashMap<Long, Cart> cart = (HashMap<Long, Cart>)session.getAttribute("Cart");
			CartDAO dao = new CartDAO();
		if(cart == null) {
			cart = new HashMap<Long, Cart>();
	}
		cart = dao.AddCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("totalQuanty", dao.totalCart(cart));
		session.setAttribute("totalPrice", dao.totalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}
	
	
	@RequestMapping(value= "/listcart")
	public ModelAndView Cart(HttpSession session) throws SQLException{
		HashMap<Long, Cart> cart = (HashMap<Long, Cart>)session.getAttribute("Cart");
		mvshare.setViewName("user/list_cart");
		ProductDAO dao = new ProductDAO();
		CategoriesDAO daoCate = new CategoriesDAO();
		CartDAO cartdao = new CartDAO();
		if(cart == null) {
			cart = new HashMap<Long, Cart>();
		}
		List<slides> userList = dao.readProductSlides();
		List<Categories> cateList = daoCate.readCategories();
		List<item_listingData> itemList = dao.readProductListing();
		mvshare.addObject("userList", userList);
		mvshare.addObject("cateList", cateList);
		mvshare.addObject("itemList", itemList);
		session.setAttribute("Cart", cartdao.AddCart(0, cart));
		session.setAttribute("totalQuanty", cartdao.totalCart(cart));
		session.setAttribute("totalPrice", cartdao.totalPrice(cart));
		return mvshare;
	}
}
