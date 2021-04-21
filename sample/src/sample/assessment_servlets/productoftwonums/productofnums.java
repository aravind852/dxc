import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
public class Product_Numbers extends HttpServlet{
public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
{
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
int product = num1 * num2;
PrintWriter output = response.getWriter();
output.println("The product :"+product);
}
}