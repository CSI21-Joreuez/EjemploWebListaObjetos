<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Segunda</title>
</head>
<body>
<form   object="${empleado}" method="post">
<label for="Nombre">Nombre</label>
<input type="text" id="nombre" name="nombre" th:field="*{nombre}">
<br>
<label for="Apellidos">Apellidos</label>
<input type="text" id="apellidos" name="apellidos" th:field="*{apellidos}">
<br>
<label for="nivel_acceso">Nivel Acceso</label>
<input type="number" id="nivel_acceso" name="nivel_acceso" th:field="*{nivel_acceso}">
<br>
<button type="submit">Enviar</button>
</form>
<%
String nombre = request.getParameter("nombre");
String apellidos = request.getParameter("apellidos");
String nivel_acceso = request.getParameter("nivel_acceso");
%>
 <c:forEach items="{empl.listaEmpleado}" var="empl" />
<p><c:out value="${empl.nombre}"/> </p>
<p><c:out value="${empl.apellido}"/> </p>
<p><c:out value="${empl.nivel_acceso}"/> </p>
</body>
</html>