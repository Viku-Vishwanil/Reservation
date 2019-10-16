package edu.jspiders.trainreservationapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.jspiders.trainreservationapp.dao.TrainDAOImpl;
import edu.jspiders.trainreservationapp.dao.UserDAOImpl;
import edu.jspiders.trainreservationapp.dto.TrainDTO;

@Controller
public class MyController 
{
	@Autowired
	private UserDAOImpl dao;
	@Autowired
	private TrainDAOImpl train;
	
	@RequestMapping("/home")
	public String getHomePage()
	{
		return"home";
	}
	@RequestMapping("/login")
	public String getLoginForm()
	{
		return"login";
	}
	@RequestMapping("/logindata")
	public String getLoginFormData(HttpServletRequest req)
	{
		String user = req.getParameter("username");
		String password = req.getParameter("pswd");
		
		if(dao.validate(user,password))
		{
			return "home";
		}
		else
		{
			return "redirect:/login";
		}
	}
	@RequestMapping("/addtrain")
	public String getAddTrain()
	{
		return"addtrain";
	}
	@RequestMapping("/savetrain")
	public String saveTrain(HttpServletRequest req)
	{
		String tno = req.getParameter("tno");
		String tname = req.getParameter("tname");
		String sstation = req.getParameter("sstation");
		String dstation = req.getParameter("dstation");
		String arrivaltime = req.getParameter("arrivaltime");
		String deptime = req.getParameter("deptime");
		
		TrainDTO traindto = new TrainDTO();
		
		traindto.setTrainNo(Integer.parseInt(tno));
		traindto.setTrainName(tname);
		traindto.setSourceStation(sstation);
		traindto.setDestinationStation(dstation);
		traindto.setArrivalTime(arrivaltime);
		traindto.setDepartureTime(deptime);
		
		train.createTrain(traindto);
		
		 return "success";
	}
	@RequestMapping("/search") 
	public String getTrain()
	{
		return "searchtrain";
	}
	
	@RequestMapping("/searchtrain")
	public String getTrainInfo(HttpServletRequest req, Model myModel)
	{
		String sStation = req.getParameter("sStation");
		String dStation = req.getParameter("dStation");
		
		List<TrainDTO> trainInfo = train.searchTrain(sStation, dStation);
		
		myModel.addAttribute("trainerInfo",trainInfo);
		
		return "showdata";
	}
	@RequestMapping("/logout")
	public String logout()
	{
		return"logout";
	}
}
