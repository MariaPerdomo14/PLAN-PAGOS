package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import co.edu.utap.parcial.domain.PlanPago;

public final class Parcial_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form method=\"post\" action=\"ParcialController\">\n");
      out.write("\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <label>Plazo en meses</label>\n");
      out.write("                        <input type=\"number\" id=\"txtPlazo\" name=\"txtPlazo\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <label>Valor Prestamo</label>\n");
      out.write("                        <input type=\"number\" id=\"txtValorPrestamo\" name=\"txtValorPrestamo\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <label>Tasa</label>\n");
      out.write("                        <input type=\"text\" id=\"txtTasa\" name=\"txtTasa\" class=\"form-control\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" value=\"Plan de pago\" class=\"btn btn-primary\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <h1>Plan de pagos</h1>\n");
      out.write("            <hr>\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Cuota #</td>\n");
      out.write("                    <td>Abono a intereses</td>\n");
      out.write("                    <td>Abono a capital</td>\n");
      out.write("                    <td>Cuota mensual</td>\n");
      out.write("                    <td>Saldo</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    if (request.getAttribute("plan") != null) {
                        List<PlanPago> plan = (List<PlanPago>) request.getAttribute("plan");
                        for (PlanPago p : plan) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( p.getNroCuota());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getAbonoIntereses());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getAbonoCapital());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getCuotaMensual());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( p.getSaldo());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
