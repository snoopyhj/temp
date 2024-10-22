package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.HotelSearchDAO;
import com.example.demo.dao.RegionSearchDAO;
import com.example.demo.vo.HotelVO;

@Controller
public class HotelController {
	@Autowired
	RegionSearchDAO dao;
	
	@Autowired
	HotelSearchDAO hdao;

	
	@RequestMapping(value="/regionsearch", method=RequestMethod.GET) 
	public String region_search(String region, String subregion, Model model) {
		  
		HotelVO vo = new HotelVO();
		vo.setRegion(region);
		vo.setSubregion(subregion);
		
		model.addAttribute("hotel_list", dao.select_region(vo));
	  
		return "hotellist";
	}
	
	@RequestMapping(value="/hoteldetail", method=RequestMethod.GET)
	public String gotohoteldetail(@RequestParam("name") String name, Model model) {
		HotelVO vo = new HotelVO();
		vo.setName(name);
		model.addAttribute("hotel", hdao.select_hotel(vo));
		System.out.println(hdao.select_hotel(vo).getName());
		return "hoteldetail";
	}
	
			
	
}