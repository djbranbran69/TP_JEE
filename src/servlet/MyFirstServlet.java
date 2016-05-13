package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public MyFirstServlet(){
		super();
	}
	
	public void init (ServletConfig config) throws ServletException{
		super.init(config);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException{
		Map<String, String[]> mapParameters = req.getParameterMap();
		
		String infoParam = "<h1>Info Param</h1><ul>";
		
		for(String param : mapParameters.keySet()){
			infoParam += "<li>" + param + " : ";
			for(String values : mapParameters.get(param)){
				 infoParam += values + " ";
			}
			infoParam += "</li>";
		}
		infoParam += "</ul>";
		
		String infoWebBrowser = "<h1>Info Web browser</h1><ul>";
		infoWebBrowser += "<li>Remote Add: " + req.getRemoteAddr() +  "</li>";
		infoWebBrowser += "<li>Protocole: " + req.getProtocol() + "</li>";
		infoWebBrowser += "<li>ContentPath: " + req.getContextPath() + "</li>";
		infoWebBrowser += "<li>LocalPort: " + req.getLocalPort() + "</li>";
		infoWebBrowser += "</ul>";
		
		
		PrintWriter wr = resp.getWriter();
		wr.println("<!DOCTYPE html>");
		wr.println("<html>");
		wr.println("<head>");
		wr.println("<meta charset='UTF-8'>");
		wr.println("<title>TP1</title>");
		wr.println("</head>");
		wr.println("<body>");
		wr.println(infoParam);
		wr.println(infoWebBrowser);
	}
	
	protected void doDo(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		
	}
	
}
