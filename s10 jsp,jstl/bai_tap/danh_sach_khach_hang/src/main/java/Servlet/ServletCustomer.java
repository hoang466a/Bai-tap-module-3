package Servlet;

import Model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer", value = "/ServletCustomer")
public class ServletCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList=new ArrayList<Customer>();
        Customer customer=new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://tinyurl.com/2p8bavnd");
        Customer customer1=new Customer("Nguyễn Văn Nam","1983-08-21","Hà Nội","https://tinyurl.com/2p8bavnd");
        Customer customer2=new Customer("Nguyễn Thái Hòa","1983-08-22","Hà Nội","https://tinyurl.com/2p8bavnd");
        Customer customer3=new Customer("Trần Đăng Khoa","1983-08-17","Hà Nội","https://tinyurl.com/2p8bavnd");
        Customer customer4=new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","https://tinyurl.com/2p8bavnd");
        customerList.add(customer);
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

    }
}
