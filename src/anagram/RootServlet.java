package anagram;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class RootServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	IOException, ServletException {
	// set the response type to be html text
	resp.setContentType("text/html");
	
	UserService us = UserServiceFactory.getUserService();
	User u = us.getCurrentUser();
	String login_url = us.createLoginURL("/");
	String logout_url = us.createLogoutURL("/");
	// attach a few things to the request such that we can access them in the
	// jsp
	req.setAttribute("user", u);
	req.setAttribute("login_url", login_url);
	req.setAttribute("logout_url", logout_url);
	// get a request dispatcher and launch a jsp that will render our page
	RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/root.jsp");
	rd.forward(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
			// get access to all of the values
			String text_input = req.getParameter("text_input");
			   anagramSolver as = new anagramSolver(text_input);
			   resp.sendRedirect("/");
	}
	
}
