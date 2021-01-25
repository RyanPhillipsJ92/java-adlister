import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //        CHECK FOR USER STATUS
        if (request.getSession().getAttribute("user") != null){
            response.sendRedirect("/profile");
            return;
        }else {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = (username.equals("user") && password.equals("password"));

//        GETS OUR CURRENT SESSION
        HttpSession session = request.getSession();
            if (validAttempt && username.equals("user")) {
                session.setAttribute("user", true);
                session.setAttribute("username", username);
                response.sendRedirect("/profile");  //Linked to a servlet

            }//        IF LOGIN ATTEMPT FAILS REDIRECT TO LOGIN TO TRY AGAIN
            else {
                response.sendRedirect("/login");
            }

        }
    }

