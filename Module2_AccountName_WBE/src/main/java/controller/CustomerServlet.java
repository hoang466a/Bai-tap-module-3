package controller;

import model.Customer;
import repository.customer_repo.CustomerImpl;
import service.CustomerServiceImpl;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    private CustomerServiceImpl customerService=new CustomerServiceImpl();

    //public void init() {
        //customerImpl = new CustomerImpl();
    //}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        {

            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }

            switch (action) {
                case "create":
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteUser(request, response);
                    break;
                default:
                    listCustomer(request, response);
                    break;
            }
        }
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {

    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("customer/create.jsp");
        dispatcher.forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        {
            String action = request.getParameter("action");
                if (action == null) {
                    action = "";
                }

            switch (action) {
                case "create":
                    insertCustomer(request, response);
                    break;
                case "edit":
                    editCustomer(request, response);
                    break;
                case "delete":
                    deleteCustomer(request, response);
                    break;
                default:
                  listCustomer(request,response);
                    break;
            }

        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {

    }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int typeid=Integer.parseInt(request.getParameter("typeid"));
        String name=request.getParameter("name");
        String birthday=request.getParameter("birthday");
        Boolean gender=Boolean.valueOf(request.getParameter("gender"));
        String idcard=request.getParameter("idcard");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        Customer customer=new Customer(typeid,name,birthday,gender,idcard,phone,email,address);
        customerService.create(customer);
        RequestDispatcher dispatcher=request.getRequestDispatcher("customer/create.jsp");
        request.setAttribute("massage","New Customer was created");
        dispatcher.forward(request,response);
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList=customerService.showAll();
        request.setAttribute("customerList",customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


