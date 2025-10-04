<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
</head>
<body>
  <h2>Ingresar</h2>
  
  <!-- ✅ Enlazado correctamente con /loginservlet -->
  <form action="${pageContext.request.contextPath}/loginservlet" method="post">
    <input type="text"     name="usuario"  placeholder="Usuario" required><br><br>
    <input type="password" name="password" placeholder="Contraseña" required><br><br>
    <button type="submit">Ingresar</button>
  </form>

  <!-- ✅ Mostrar mensaje de error si existe -->
  <p style="color:red;">
    <%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %>
  </p>
</body>
</html>

