import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;



@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizzaorder")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizzaorder.jsp").forward(request, response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String crust = request.getParameter("crust");
        request.setAttribute("crust", crust);

        String sauce = request.getParameter("sauce");
        request.setAttribute("sauce", sauce);

        String size = request.getParameter("size");
        request.setAttribute("size", size);

        String toppings[] = request.getParameterValues("toppings");
        request.setAttribute("toppings", toppings);

        String address = request.getParameter("address");
        request.setAttribute("address", address);


        for (int i=0; i < toppings.length; i++){
            System.out.println(toppings[i]);
        }

        System.out.printf("\nYour pizza is a: %s, %s, %s, %s",crust, size, sauce, Arrays.toString(toppings));
        System.out.println("Delivery to address: " + address);
        request.getRequestDispatcher("/pizzaorder.jsp").forward(request, response);


    }
}