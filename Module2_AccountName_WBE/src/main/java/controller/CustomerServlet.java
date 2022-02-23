package controller;

import model.Customer;
import model.CustomerType;
import repository.customer_repo.CustomerImpl;
import repository.customer_repo.CustomerTypeImpl;
import service.CustomerServiceImpl;
import service.CustomerTypeServiceImpl;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    private CustomerServiceImpl customerService=new CustomerServiceImpl();
    private CustomerTypeServiceImpl customerTypeService=new CustomerTypeServiceImpl();

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
                case "search":
                    showSearch(request, response);
                    break;
                case "view":
                    showView(request,response);
                default:
                    listCustomer(request, response);
                    break;
            }
        }
    }

    private void showView(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        Customer customer=customerService.findById(id);
        RequestDispatcher requestDispatcher;
        if(customer==null){
           requestDispatcher=request.getRequestDispatcher("error-404.jsp");
        }else{
            request.setAttribute("customer",customer);
            requestDispatcher=request.getRequestDispatcher("customer/view.jsp");
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showSearch(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("search");
        List<Customer>customerList=customerService.search(name);
        request.setAttribute("customer",customerList);
        try {
            request.getRequestDispatcher("customer/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType>customerTypeList= customerTypeService.getAllCustomerType();
        request.setAttribute("customerTypeList",customerTypeList);
        int id=Integer.parseInt(request.getParameter("id"));
        Customer customer=customerService.findById(id);
        RequestDispatcher dispatcher;
        if(customer==null)
        {
            dispatcher=request.getRequestDispatcher("error-404.jsp");
        }
        else{
            request.setAttribute("customer",customer);
            dispatcher=request.getRequestDispatcher("customer/edit.jsp");
        }
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        int id=Integer.parseInt(request.getParameter("id"));
        customerService.delete(id);
        try {
            response.sendRedirect("/customers");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        String code=request.getParameter("code");
        int typeid=Integer.parseInt(request.getParameter("typeid"));
        String name=request.getParameter("name");
        String birthday=request.getParameter("birthday");
        Boolean gender=Boolean.valueOf(request.getParameter("gender"));
        String idcard=request.getParameter("idcard");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        Customer customer=new Customer(code,typeid,name,birthday,gender,idcard,phone,email,address);

        customerService.edit(id,customer);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("customer/edit.jsp");
        if(customer==null){
            requestDispatcher= request.getRequestDispatcher("error-404.jsp");
        }else{
            request.setAttribute("customer",customer);
            request.setAttribute("massege","Customer was update");
            requestDispatcher=request.getRequestDispatcher("customer/listCustomer.jsp");
        }
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code=request.getParameter("code");
        int typeid=Integer.parseInt(request.getParameter("typeid"));
        String name=request.getParameter("name");
        String birthday=request.getParameter("birthday");
        Boolean gender=Boolean.valueOf(request.getParameter("gender"));
        String idcard=request.getParameter("idcard");
        String phone=request.getParameter("phone");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        Customer customer=new Customer(code,typeid,name,birthday,gender,idcard,phone,email,address);
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


