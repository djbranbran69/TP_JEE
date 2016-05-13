package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Counter;

/**
 * Servlet implementation class PingPongServlet
 */
@WebServlet("/ping")
public class PingPongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String SESSION_COUNTER="session_counter";  
    private static final String APPLICATION_COUNTER="application_counter";  
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PingPongServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Counter counterSession;
		if(session.getAttribute(SESSION_COUNTER)==null){
			counterSession = new Counter();
			counterSession.inc();
			session.setAttribute(SESSION_COUNTER, counterSession);
		}
		else{
			counterSession = (Counter) session.getAttribute(SESSION_COUNTER);
			counterSession.inc();
		}
		

		Counter counterApplication;
		if(session.getAttribute(APPLICATION_COUNTER)==null){
			counterApplication = new Counter();
			counterApplication.inc();
			session.setAttribute(APPLICATION_COUNTER, counterApplication);
		}
		else{
			counterApplication = (Counter) session.getAttribute(APPLICATION_COUNTER);
			counterApplication.inc();
		}
		
		String generalContent="<!DOCTYPE html><html><head><meta charset='UTF-8'><title>TP1</title></head><body>";
		String generalEnd="</body></html>";
		String counterSessionInfo="<h1> Compteur session : " + counterSession.getCompteur() + "</h1>";
		String counterApplicationInfo="<h1> Compteur application : " + counterApplication.getCompteur() + "</h1>";
		PrintWriter wr = response.getWriter();
		wr.println(generalContent + counterSessionInfo + counterApplicationInfo + generalEnd);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
