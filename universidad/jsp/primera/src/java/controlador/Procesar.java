package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;

public class Procesar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre=request.getParameter("txtNombre");
        String apellido=request.getParameter("txtApellidos");
        String pais=request.getParameter("txtPais");
        String ciudad=request.getParameter("txtCiudad");
        String edad=request.getParameter("txtEdad");
        String descripcion=request.getParameter("descripcion");
        
        if (nombre.trim().equals("") ||apellido.trim().equals("")|| pais.trim().equals("")|| 
                ciudad.trim().equals("")||edad.trim().equals("") || descripcion.trim().equals("")){
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }else{
            int ed=Integer.parseInt(edad);
            Persona p1=new Persona(nombre, apellido, pais, ciudad, ed, descripcion);
            request.getSession().setAttribute("persona1", p1);
            request.getRequestDispatcher("Datos.jsp").forward(request, response);
            
        }
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
