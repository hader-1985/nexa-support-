<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Bienvenido</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background: url("img/welcofondo.png") no-repeat center center fixed;
      background-size: cover;
      font-family: 'Segoe UI', sans-serif;
      height: 100vh;
      margin: 0;
      display: flex;
      justify-content: center;
      align-items: center;
    }
    .welcome-container {
      background: rgba(255, 255, 255, 0.15);
      padding: 40px;
      border-radius: 20px;
      box-shadow: 0 8px 25px rgba(0,0,0,0.3);
      text-align: center;
      color: #fff;
      max-width: 600px;
    }
    .welcome-container h1 {
      font-size: 2.5rem;
      margin-bottom: 15px;
      font-weight: bold;
      text-shadow: 1px 1px 3px rgba(0,0,0,0.5);
    }
    .welcome-container p {
      font-size: 1.2rem;
      margin-bottom: 25px;
    }
    .btn-logout {
      margin-top: 20px;
      background: linear-gradient(90deg, #0d6efd, #0a4fa3);
      border: none;
      font-weight: bold;
      padding: 10px 20px;
      border-radius: 10px;
    }
    .btn-logout:hover {
      background: linear-gradient(90deg, #0a4fa3, #0d6efd);
      transform: scale(1.05);
    }
  </style>
</head>
<body>
  <div class="welcome-container">
    <h1>¡Bienvenido a Nexa Support!</h1>
    <p>Has iniciado sesión correctamente.</p>
    <a href="index.html" class="btn btn-logout btn-primary">Cerrar sesión</a>
  </div>
</body>
</html>
