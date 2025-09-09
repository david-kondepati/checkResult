package com.result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AdminController {

	@PostMapping("/addStu")
	public ModelAndView addStu(@RequestParam("stuid") String id, 
								@RequestParam("stuname") String name, 
								@RequestParam("stuemail") String email) throws ClassNotFoundException, SQLException {
		
		DBConnection dbc = new DBConnection();
		
		Connection con = dbc.getConnection();
		
		String query = "insert into student values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setString(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, "0");
		ps.setString(5, "0");
		ps.setString(6, "0");
		ps.setString(7, "0");
		ps.setString(8, "0");
		
		System.out.println(id+" "+name+" "+email);
		
		try {
			ps.execute();
			System.out.println("Data has been added successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		ModelAndView mv = new ModelAndView("welcome-admin");
		
		return mv;
	}


	@PostMapping("/deleteStu")
	public ModelAndView deleteStudent(@RequestParam("stuid") String id) throws ClassNotFoundException, SQLException {
		
		ModelAndView mv = new ModelAndView("welcome-admin");
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getConnection();
		
		String query = "delete from student where id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, id);
		
		try {
			ps.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return mv;
	}

	@PostMapping("/updateMarks")
	public ModelAndView updateMarks(
			@RequestParam("id") String id,
			@RequestParam("core") String core,
			@RequestParam("adv") String adv,
			@RequestParam("spring") String spring,
			@RequestParam("react") String react,
			@RequestParam("oracle") String oracle
			) throws ClassNotFoundException, SQLException {
		ModelAndView mv = new ModelAndView("welcome-admin");
		
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getConnection();
		
		String query = "update student set core_marks = ?, adv_marks = ?, spring_marks = ?, react_marks = ?, oracle_marks = ? where id = ?";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setString(1, core);
		ps.setString(2, adv);
		ps.setString(3, spring);
		ps.setString(4, react);
		ps.setString(5, oracle);
		ps.setString(6, id);
		
		try {
			ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return mv;
	}

}





