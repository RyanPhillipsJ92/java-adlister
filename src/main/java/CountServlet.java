import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
   private int counter = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        String reset = req.getParameter("reset");

        if (reset == null){
            counter +=1;
            out.println("Views: " + counter);
        }else if(reset.equals("reset")) {
            counter = 1;
            out.println("Views: " + counter);
        }else {
            counter +=1;
            out.println("Views: " + counter);
        }

    }
 }


