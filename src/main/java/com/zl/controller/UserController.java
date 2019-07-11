package com.zl.controller;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zl.pojo.User;
import com.zl.service.UserService;
import com.zl.util.MD5;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService us;

	@RequestMapping("/login")
	public String loginUser(HttpServletResponse resp, HttpSession session, User loginUser, String zidong) {
		System.out.println("到达登录模块");
		System.out.println(loginUser);
		String dl = "";
		System.out.println("密码长度" + loginUser.getPsd().length());
		if (loginUser.getPsd().length() < 32) {
			loginUser.setPsd(MD5.GetMD5Code(loginUser.getPsd()));
			System.out.println(MD5.GetMD5Code(loginUser.getPsd()));
		}

		loginUser = us.userLogin(loginUser);
		System.out.println(loginUser + "+++++++++++++++");
		if (loginUser != null) {
			session.setAttribute("loginUser", loginUser);
			// 保存cookie
			System.out.println("到达保存Cookie模块1");
			try {
				if ("yes".equals(zidong)) {
					// 用户需要保存
					// 创建cookie对象
					System.out.println("到达保存Cookie模块2");
					Cookie namec = new Cookie("name", URLEncoder.encode(loginUser.getName(), "utf-8"));
					Cookie psdc = new Cookie("psd", loginUser.getPsd());
					// 设置cookie路径
					namec.setPath("/bxw");
					psdc.setPath("/bxw");
					// 设置cookie的有效时间
					namec.setMaxAge(24 * 60 * 60);
					psdc.setMaxAge(24 * 60 * 60);
					// 通过respon对象把cookie发送给客户端
					resp.addCookie(namec);
					resp.addCookie(psdc);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			dl = "test";
		} else {
			dl = "dl";
		}
		System.out.println("dl的值为" + dl);
		return dl;
	}

	// 退出系统
	@RequestMapping("/out")
	public String outsystem(HttpServletRequest request) {
		System.out.println("到达退出系统模块");
		request.getSession().invalidate();

		return "redirect:/dl.jsp";

	}

}
