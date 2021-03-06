/**
 * 
 */
package com.flycode.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flycode.common.BaseController;

/**
 * @author Barrie
 *
 */
@Controller
@RequestMapping(value = "/web")
public class WebController extends BaseController {

	@RequestMapping(value = "/meter")
	public String meter(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/meter";
	}

	@RequestMapping(value = "/readrec")
	public String readrec(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/readrec";
	}
	
	@RequestMapping(value = "/daily-use")
	public String dailyUse(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/daily-use";
	}
	
	@RequestMapping(value = "/monthly-use")
	public String monthlyUse(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/monthly-use";
	}
	
	@RequestMapping(value = "/yearly-use")
	public String yearlyUse(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/yearly-use";
	}
	
	@RequestMapping(value = "/gas-alarm")
	public String gasAlarm(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/gas-alarm";
	}
	
	@RequestMapping(value = "/elec-alarm")
	public String elecAlarm(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/elec-alarm";
	}
	
	/**
	 * 系统日志查询
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/log")
	public String log(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/log";
	}
	
	/**
	 * 抄电压记录查询
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/meter-log")
	public String meterLog(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/meter-log";
	}
	
	/**
	 * 电压告警查询
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/data-error")
	public String dataError(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/data-error";
	}
		
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/login";
	}
	
	@RequestMapping(value = "/authorization")
	public String authorization(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/authorization";
	}

	@RequestMapping(value = {"/index" })
	public String index(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		return "/meter";
	}
}
