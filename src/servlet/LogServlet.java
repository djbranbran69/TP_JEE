package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logme")
public class LogServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Map<String, String> userMap;
	
	public LogServlet(){
		super();
		userMap=new HashMap<>();
		userMap.put("Antoine", "Bouquet");
		userMap.put("Brandon", "Oziol");
	}
	
	public void init (ServletConfig config) throws ServletException{
		super.init(config);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException{
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		String generalContent="<!DOCTYPE html><html><head><meta charset='UTF-8'><title>TP1</title></head><body>";
		String generalEnd="</body></html>";
		String successMsg="<h1>Welcome "+req.getParameter("loginInput") + "</h1>";
		String errorMsg="<h1>Bad Auth</h1>";
		String message;
		Boolean isChecked = false;
		
		//CHECK LOGIN PASSWORD
		String loginParam=req.getParameter("loginInput");
		String psswdParam=req.getParameter("pwdInput");
		
		if(userMap.containsKey(loginParam)){
			if(userMap.get(loginParam).equals(psswdParam))
				isChecked = true;
		}
		
		if(isChecked)
			message = successMsg;
		else
			message = errorMsg;
		
		PrintWriter wr = resp.getWriter();
		wr.print(generalContent + message + generalEnd);
	}
	
}
