package ru.jfx.server;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ---
 * User: Navalikhin Nikita
 * Date: 10.12.13 17:05
 */
public class JServer extends AbstractHandler {
    public static void main(String[] args) throws Exception{
        Server server = new Server(777);
        server.setHandler(new JServer());

        server.start();
        server.join();
    }

    @Override
    public void handle(String s, Request request, HttpServletRequest request2, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        request.setHandled(true);
        //response.getWriter().println("<h1>Hello World</h1>");
    }
}
