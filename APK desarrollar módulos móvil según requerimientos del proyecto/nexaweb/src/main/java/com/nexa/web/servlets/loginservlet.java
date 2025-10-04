/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nexa.web.servlets;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // ⚠️ Deben coincidir con los "name" del formulario
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        

        if ("hader".equals(usuario) && "6333996".equals(password)) {
            // ✅ Guardar sesión ANTES de ir a bienvenida
            HttpSession ses = req.getSession(true);
            ses.setAttribute("usuario", usuario);
            req.getRequestDispatcher("/welcome.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", "Usuario o contraseña incorrectos");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}


