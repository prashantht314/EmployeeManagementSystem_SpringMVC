package com.jsp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.EmployeeDao;
import com.jsp.DTO.Employee;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/insert")
	public ModelAndView insert()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("insert.jsp");
		return mv;
	}
	
	@RequestMapping("/insertEmployee")
	public ModelAndView insertEmployee(@ModelAttribute Employee emp)
	{
		dao.saveEmployee(emp);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@RequestMapping("/get")
	public ModelAndView get()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("get.jsp");
		return mv;
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@ModelAttribute Employee employee)
	{
		ModelAndView mv=new ModelAndView();
		Employee emp=dao.getEmployeeById(employee.getId());
		mv.addObject("employee",emp);
		mv.setViewName("display.jsp");
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("delete.jsp");
		return mv;
	}
	
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(@ModelAttribute Employee emp)
	{
		ModelAndView mv=new ModelAndView();
		dao.deleteEmployee(emp.getId());
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView update()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("employee",new Employee());
		mv.setViewName("update.jsp");
		return mv;
	}
	
	@RequestMapping("/updateEmployee")
	public ModelAndView updateEmployee(@ModelAttribute Employee emp)
	{
		ModelAndView mv=new ModelAndView();
		dao.updateEmployee(emp);
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@RequestMapping("/getAll")
	public ModelAndView getAllEmployee()
	{
		ModelAndView mv=new ModelAndView();
		List<Employee> employees=dao.getAllEmployee();
		mv.addObject("employeelist",employees);
		mv.setViewName("displayAll.jsp");
		return mv;
	}
}
