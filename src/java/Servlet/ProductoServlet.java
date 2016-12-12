/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import facade.ProductoLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Productos;

/**
 *
 * @author Buging
 */
@WebServlet(name = "ProductoServlet", urlPatterns = {"/ProductoServlet"})
public class ProductoServlet extends HttpServlet {
    
    @EJB
    private ProductoLocal productoFacade;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
     
        String action = request.getParameter("action");
        String codigoStr = request.getParameter("codigo");
        int codigo=0;
        if(codigoStr!=null && !codigoStr.equals("")){
            codigo=Integer.parseInt(codigoStr);    
        }
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String precioStr = request.getParameter("precio");
        int precio=0;
        if(precioStr!=null && !precioStr.equals("")){
            precio=Integer.parseInt(precioStr);    
        }
        String foto=request.getParameter("foto");
        String ciudad=request.getParameter("ciudad");
        String nombreAnunciante=request.getParameter("nombreAnunciante");
        String correoAnunciante=request.getParameter("correoAnunciante");
        Productos producto = new Productos(codigo, nombre, descripcion, precio, foto, ciudad, nombreAnunciante, correoAnunciante);
        
        if("Agregar".equalsIgnoreCase(action)){
            productoFacade.addProducto(producto);
        }else if("Editar".equalsIgnoreCase(action)){
            productoFacade.editProducto(producto);
        }else if("Delete".equalsIgnoreCase(action)){
            productoFacade.deleteProducto(codigo);
        }else if("Search".equalsIgnoreCase(action)){
            producto = productoFacade.getProducto(codigo);
        }
        request.setAttribute("producto", producto);
        request.setAttribute("allProductos", productoFacade.getAllProductos());
        request.getRequestDispatcher("productoinfo.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
