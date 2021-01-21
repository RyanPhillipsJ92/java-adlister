import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;


@WebServlet(name = "GuessNumberServlet", urlPatterns = "/guess")
public class GuessNumberServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/guess-app/guess.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int randomNum = (int) Math.ceil(Math.random() * 3);

//        GET AND SET USERS GUESS
        String userGuess = request.getParameter("userGuess");
        request.setAttribute("userGuess", userGuess);


        if (userGuess.equalsIgnoreCase(String.valueOf(randomNum))){
            response.sendRedirect("/correct");
        }else {
            request.getRequestDispatcher("/incorrect");
        }
    }


}