<%-- 
    Document   : Parcial
    Created on : 19/11/2020, 08:49:17 PM
    Author     : Maria Angelica
--%>

<%@page import="java.util.List"%>
<%@page import="co.edu.utap.parcial.domain.PlanPago"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <form method="post" action="ParcialController">

                <div class="form-row">
                    <div class="col-md-3">
                        <label>Plazo en meses</label>
                        <input type="number" id="txtPlazo" name="txtPlazo" class="form-control" />
                    </div>
                    <div class="col-md-3">
                        <label>Valor Prestamo</label>
                        <input type="number" id="txtValorPrestamo" name="txtValorPrestamo" class="form-control" />
                    </div>
                    <div class="col-md-3">
                        <label>Tasa</label>
                        <input type="text" id="txtTasa" name="txtTasa" class="form-control" />
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-3">
                        <br>
                        <input type="submit" value="Plan de pago" class="btn btn-primary" />
                    </div>
                </div>

            </form>

            <br>
            <h1>Plan de pagos</h1>
            <hr>
            <table class="table">
                <tr>
                    <td>Cuota #</td>
                    <td>Abono a intereses</td>
                    <td>Abono a capital</td>
                    <td>Cuota mensual</td>
                    <td>Saldo</td>
                </tr>

                <%
                    if (request.getAttribute("plan") != null) {
                        List<PlanPago> plan = (List<PlanPago>) request.getAttribute("plan");
                        for (PlanPago p : plan) {
                %>

                <tr>
                    <td><%= p.getNroCuota()%></td>
                    <td><%= p.getAbonoIntereses()%></td>
                    <td><%= p.getAbonoCapital()%></td>
                    <td><%= p.getCuotaMensual()%></td>
                    <td><%= p.getSaldo()%></td>
                </tr>

                <%
                        }
                    }
                %>

            </table>

        </div>
    </body>
</html>