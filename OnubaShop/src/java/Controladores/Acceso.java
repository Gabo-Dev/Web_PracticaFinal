package Controladores;

import Entidades.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jhony
 */
@WebServlet(name = "Acceso", urlPatterns = {"/acceso/*"})
public class Acceso extends HttpServlet {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("OnubaShopPU");

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion;
        accion = request.getPathInfo();
        String vista = "/index.jsp";
        EntityManager em = emf.createEntityManager();
        HttpSession session = request.getSession();

        switch (accion) {
            case "/home":
                //  Página Principal
                vista = "/index.jsp";
                break;
            case "/login":
                //  Mostrar el formulario de login
                vista = "/login.jsp";
                break;
            case "/validar":
                //  Validar el usuario
                try {
                String user = request.getParameter("username");
                String pass = request.getParameter("password");

                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(pass.getBytes());
                byte[] digest = md.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format("%02x", b & 0xff));
                }
                String pass_digest = sb.toString();
                TypedQuery<Usuarios> query = em.createNamedQuery("Usuarios.finByNameAndPass", Usuarios.class);
                query.setParameter("nombre", user);
                query.setParameter("clave", pass_digest);

                List<Usuarios> lu;
                lu = query.getResultList();
                if (!lu.isEmpty()) {
                    Usuarios u = lu.get(0);
                    session.setAttribute("id", u.getId());
                    session.setAttribute("user", u.getName());
                    request.setAttribute("msg", "Login correcto.");
                } else {
                    request.setAttribute("msg", "Usuario o Password incorrecto.");
                }
                } catch (NoSuchAlgorithmException e) {
                    System.err.println(e);
                    request.setAttribute("msg", "ERROR: imposible validar al usuario");
                }
                vista = "/index.jsp";
                break;
            case "/guardar":
                //  Guardar datos del usuario
                //  UNDO: Verificación de los datos
                try {
                    String user = request.getParameter("user");
                     String pass = request.getParameter("pw1");
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    md.update(pass.getBytes());
                    byte[] digest = md.digest();
                    StringBuilder sb = new StringBuilder();
                    for (byte b : digest) {
                        sb.append(String.format("%02x", b & 0xff));
                    }
                    String pass_digest = sb.toString();
                    Usuarios u = new Usuarios();
                    u.setName(user);
                    u.setPass(pass_digest);
                    persist(u);
                    request.setAttribute("msg", "Usuario guardado");
                } catch (NoSuchAlgorithmException e) {
                    request.setAttribute("msg", "ERROR: Usuario NO guardado");
                }
                vista = "/index.jsp";
                break;
            case "/logout":
                //  Cerrar Sesión
                session.invalidate();
                request.setAttribute("msg", "Usuarios Desconectado");
                vista = "/index.jsp";
                break;
            case "/privado":
                // Redirigir a la vista privada
                if (session.getAttribute("user") != null) {
                    vista = "/WEB-INF/privado/privado.jsp";
                }
                else{
                    vista = "/index.jsp";
                }
            default:
                vista = "/index.jsp";
                break;
        }

        RequestDispatcher rd = request.getRequestDispatcher(vista);
        rd.forward(request, response);
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

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);// Guarda los datos en la tabla de la BD
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
