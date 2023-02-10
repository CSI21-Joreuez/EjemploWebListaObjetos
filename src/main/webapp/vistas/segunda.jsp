           <%@ include file="/vistas/cabecera.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${miModelo.listaEmpleado}" var="empl">
<c:out value="${empl.nombre}"/> 
      <i><c:out value="${empl.apellidos}"/></i>
            <i><c:out value="${empl.nivel_acceso}"/></i>
      <br>
</c:forEach>
<a href="<c:url value="navegacionFormulario"/>">A formulario</a>
</body>
</html>