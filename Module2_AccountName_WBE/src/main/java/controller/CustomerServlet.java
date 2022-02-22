package controller;

import model.Customer;
import repository.customer_repo.CustomerImpl;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    private CustomerImpl customerImpl=new CustomerImpl();

    //public void init() {
        //customerImpl = new CustomerImpl();
    //}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        {
            System.out.println(123);
            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }

            switch (action) {
                case "create":
                    //showNewForm(request, response);
                    break;
                case "edit":
                    // showEditForm(request, response);
                    break;
                case "delete":
                    // deleteUser(request, response);
                    break;
                default:
                    listCustomer(request, response);
                    break;
            }
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        {
            String action = request.getParameter("action");
                if (action == null) {
                    action = "";
                }

            switch (action) {
                case "create":
                    // showNewForm(request, response);
                    break;
                case "edit":
                    // showEditForm(request, response);
                    break;
                case "delete":
                    // deleteUser(request, response);
                    break;
                default:
                  listCustomer(request,response);
                    break;
            }

        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(123);
        List<Customer> customerList=customerImpl.showAllCustomer();
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


