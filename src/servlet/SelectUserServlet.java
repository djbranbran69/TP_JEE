package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

@WebServlet("/selectUser")
public class SelectUserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private List<User> userList;
	private Random rand;
	
	public SelectUserServlet(){
		super();
		rand = new Random();
		userList = new ArrayList<User>();
		userList.add(new User("monPseudo", "pwd", "DaSilvaCampos", "Anis", "50"));
		userList.add(new User("Antoine", "pwd", "Antoine", "Antoine", "50"));
		userList.add(new User("Brandon", "pwd", "Brandon", "Brandon", "50"));
	}
	
	public void init (ServletConfig config) throws ServletException{
		super.init(config);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
		throws ServletException, IOException{
		int i = rand.nextInt(userList.size());
		resp.sendRedirect("/tp1/tableauUser.jsp?var="+userList.get(i).getPseudo());
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		
	}
	
}
