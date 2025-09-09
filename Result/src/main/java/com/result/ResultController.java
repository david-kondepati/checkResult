package com.result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	
	@PostMapping("/checkResult")
	public ModelAndView result(@RequestParam("stuid") String id) throws ClassNotFoundException, SQLException {
		ModelAndView mv = new ModelAndView("result");
		
		String query = "select *from student where id = ?";
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getConnection();
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			String roll = rs.getString(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String core = rs.getString(4);
			String adv = rs.getString(5);
			String spring = rs.getString(6);
			String react = rs.getString(7);
			String oracle = rs.getString(8);
			
			mv.addObject("id", roll);
			mv.addObject("name", name);
			mv.addObject("email", email);
			mv.addObject("core",core);
			mv.addObject("adv",adv);
			mv.addObject("spring", spring);
			mv.addObject("react", react);
			mv.addObject("oracle", oracle);
			
			int c = Integer.parseInt(core);
			int a = Integer.parseInt(adv);
			int s = Integer.parseInt(spring);
			int r = Integer.parseInt(react);
			int o = Integer.parseInt(oracle);
			
			if(c>=33 && a>=33 && s>=33 && r>=33 && o>=33) {
				mv.addObject("status", "Pass");
			}
			else {
				mv.addObject("status", "Fail");
			}
		}
		
		return mv;
	}
}
