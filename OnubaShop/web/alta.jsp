<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OnubaShop</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet"
              href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
    </head>

    <body>
        <header>
            <h2 class="logo"><span class="blanco">Onuba</span><span class="azul">Shop</span></h2>
            <div class="bx bx-menu" id="menu-icon"></div>
            <ul class="navbar">
                <li><a href="#">Inicio</a></li>
                <li><a href="#">Ver Artículos</a></li>
            </ul>
            <div class="header-btn">
                <a href="#" class="sign-up">Iniciar Sesión</a>
                <a href="#" class="registrarse">Registrarse</a>
            </div>
        </header>
        <div class="contenedor">
            <h1>Alta Usuario</h1>
        <form method="POST" action="/OnubaShop/acceso/guardar" onsubmit="return chekcForm()">
            <table>
                <tr>
                    <td align="right">NOMBRE:</td><td><input id="user" type="text" name="user"></td>
                </tr>
                <tr>
                    <td align="right">CLAVE: </td><td><input id="pwd1" type="password" name="pw1"></td>
                </tr>
                <tr>
                    <td align="right">REPETIR: </td><td><input id="pwd2" type="password" name="pw2"></td>
                </tr>               
                <tr>
                    <td></td><td><input type="submit" value="Alta"></td>
                </tr>
            </table>
        </form>
        <p><a href="/OnubaShop/acceso/home">Inicio</a></p>
        </div>
        <footer>
            <div class="footer-container">
                <p>&copy Jonathan G.Orna Ponce 2023</p>
            </div>
        </footer>
        <!-- Js file link -->
        <script src="scripts/script.js"></script>
    </body>


</html>