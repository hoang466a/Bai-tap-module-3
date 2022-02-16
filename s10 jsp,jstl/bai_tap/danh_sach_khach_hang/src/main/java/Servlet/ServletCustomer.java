package Servlet;

import Model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer", urlPatterns = "/customer")
public class ServletCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList=new ArrayList<Customer>();
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://tinyurl.com/2p8bavnd"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Hà Nội","https://tinyurl.com/2p8bavnd"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Hà Nội","https://tinyurl.com/2p8bavnd"));
        customerList.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Nội","https://tinyurl.com/2p8bavnd"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","https://tinyurl.com/2p8bavnd"));
        request.setAttribute("list", customerList);
        request.getRequestDispatcher("/customer/customer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
