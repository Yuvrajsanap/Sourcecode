//Webcount.java

package first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Webcount extends HttpServlet

{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Integer count;

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();

		HttpSession session = req.getSession(true);

		String heading;

		count = (Integer) session.getAttribute("accessCount");
		if (count == null) {

			count = new Integer(0);
			heading = "Welcome, newcomer";
		} else {
			heading = "Welcome back";
			count = new Integer((count.intValue()) + 1);
		}
		session.setAttribute("accessCount", count);
		out.println("<BODY><HTML>" + "<H1>" + heading + "</H1>\n" + "<H2>Information on your session:</H2>\n"
				+ "Session ID:" + session.getId() + "<br>Last Accessed on:" + new Date(session.getLastAccessedTime())
				+ "<br>Number of Number Previous Accesses:" + count + "<br></BODY></HTML>");

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}