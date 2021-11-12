package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.pojo.Delivary_to_DB;

@RestController
public class Server_Controller {
	Server_Controller()
	{
		System.out.println("Whether it calling ..");
	}
	@RequestMapping({"callit","/","clicking"})
	public ModelAndView getIndex()
	{
		System.out.println("dei call aakutha illa ya da");
		return new ModelAndView("index");
	}
	@RequestMapping("sentdetail")
	public ModelAndView setIndex(Delivary_to_DB user)
	{
		System.out.println("its calling..");
		ModelAndView model=new ModelAndView();
		model.setViewName("secondpage");
		model.addObject(user);
		return model;
	}
}
