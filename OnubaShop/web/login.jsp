<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
            <h1>Identificación</h1>
            <form method="POST" action="/OnubaShop/acceso/validar">
                <table>
                    <tr>
                        <td align="right">Nombre:</td>
                        <td><<input type="text" name="username"></td>
                    </tr>
                    <tr>
                        <td align="right">Contraseña:</td>
                        <td><<input type="password" name="password"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><<input type="submit" value="Login"></td>
                    </tr>
                </table>
            </form>
            <p><a href="/OnubaShop/acceso/home"></a></p>
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
