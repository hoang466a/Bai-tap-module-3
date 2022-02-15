import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet", value = "/calculator")
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        float discount_amount=price * discount*0.01f;
        float discount_price=price-discount_amount;


        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Information product: " + product + "</h1>");
        writer.println("<h1>Discount amount: " + discount_amount + "</h1>");
        writer.println("<h1>Discount price: " + discount_price + "</h1>");
        writer.println("</html>");
    }
}
