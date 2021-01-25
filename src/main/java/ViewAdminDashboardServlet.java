import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "ViewAdminDashboardServlet", urlPatterns = "/admin")
public class ViewAdminDashboardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        CHECK FOR ADMIN STATUS
        HttpSession session = request.getSession();

        boolean isAdmin = (boolean) session.getAttribute("isAdmin");

//        USER PATH IF NOT ADMIN
        if (!isAdmin) {
            response.sendRedirect("/profile");
            return;
        }
        //        IF IS ADMIN REDIRECT TO ADMIN PAGE
            request.getRequestDispatcher("/WEB-INF/admin.jsp").forward(request, response);

    }
}