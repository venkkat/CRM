package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Masters_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Customer Information</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("          <table border=\"1\">\n");
      out.write("            <td><a href=\"Masters.jsp\">Customer details</a></td>\n");
      out.write("            <td><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Allcustomers\">All customers</a></td>            \n");
      out.write("        </table>\n");
      out.write("        <br />\n");
      out.write("\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/StudentServlet\" method=\"POST\">\n");
      out.write("         \n");
      out.write("        <table border=\"0\">\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>CustomerID:<input type=\"text\" name=\"Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.CustomerID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"20\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name:<input type=\"text\" name=\"Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.Name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"20\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address:<input type=\"text\" name=\"Address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.Address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"20\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Present Address:<input type=\"text\" name=\"Present Address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.PresentAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"20\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>State:<select name=\"state\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.State}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                <option>TamilNadu</option>\n");
      out.write("                                <option>Karnataka</option>\n");
      out.write("                                <option>Kerala</option>\n");
      out.write("                                <option>Goa</option>\n");
      out.write("                                <option>Madhya Pradhesh</option>\n");
      out.write("                            </select></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Country:<input type=\"text\" name=\"Country\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.Country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"20\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Telephone:<input type=\"text\" name=\"Telephone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.Telephone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Mobile:<input type=\"text\" name=\"Mobile\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.Mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"20\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email:<input type=\"text\" name=\"Email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.Email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"20\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Contact person:<input type=\"text\" name=\"Contactperson\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customer.Contactperson}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" size=\"20\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        \n");
      out.write("               \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Gender:<input type=\"radio\" name=\"Gender\" value=\"Male\" />Male\n");
      out.write("                <input type=\"radio\"name=\"Gender\"value=\"Female\" />Female\n");
      out.write("                 </td>\n");
      out.write("                   </tr>\n");
      out.write("            <tr> \n");
      out.write("                <td colspan=\"2\"><input type=\"submit\"value=\"Add\" name=\"Add\"/>\n");
      out.write("                    <input type=\"submit\"name=\"operation\"value=\"Edit\"/>\n");
      out.write("                    <input type=\"submit\"name=\"operation\"value=\"Delete\"/>\n");
      out.write("                    <input type=\"submit\"name=\"operation\"value=\"Search\"/></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            </tbody>\n");
      out.write("            </table>\n");
      out.write("                        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
