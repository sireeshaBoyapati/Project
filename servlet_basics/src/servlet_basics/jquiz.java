package servlet_basics;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
public class jquiz extends HttpServlet
{
public void Service(HttpServletRequest req,HttpServletResponse res)
throws servletException,IOException
{
int c=0;
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("");
if((req.getparameter("T1")).equals("lucknow"))
c++;
if((req.getparameter("T2")).equals("srilanka"))
c++;
if((req.getparameter("T3")).equals("sydney"))
c++;
if((req.getparameter("r4")).equals("Greece"))
c++;
if((req.getparameter("r5")).equals("WestIndies"))
c++;
out.println(c+"Questions are correct");
out.println("Score="+(c*5));
out.println("thank u");
out.println("");
} }






