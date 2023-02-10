       <%@ include file="/vistas/cabecera.jsp" %>
       <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
<form:form method="post" action="guardar" modelAttribute="empl">
<label for="Nombre">Nombre</label>
<form:input path="nombre"/>
<br>
<label for="Apellidos">Apellidos</label>
<form:input path="apellidos"/>
<br>
<label for="nivel_acceso">Nivel Acceso</label>
<form:input path="nivel_acceso"/>
<br>
<button type="submit">Enviar</button>
</form:form>
</body>
</html>