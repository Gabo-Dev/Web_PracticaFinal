<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
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
            <div class="contenedor-nostros contenedor">
                <div class="texto-nosotros">
                    <p class="bienvenida">Bienvenidos</p>
                    <h1>Onuba Shop</h1>
                    <p>
                        Empresa fundada en 2023 por Jonathan G. Orna Ponce
                        Lorem, ipsum dolor sit amet consectetur adipisicing elit. 
                        Tempore, quam iure, a ratione ex illo repellendus rerum recusandae possimus sit cumque doloribus impedit unde tenetur ad ducimus nostrum sequi voluptate!
                        Lorem ipsum dolor sit, amet consectetur adipisicing elit. 
                        Deleniti quod ipsum, provident, nisi ut et illum consectetur facere omnis veniam saepe recusandae sequi unde quasi, cumque nobis itaque in atque. 
                    </p>        
                    <c:if test="$session.Scope.user!=null" > Hola ${sessionScope.user}</c:if>
                    <c:choose>
                            <c:when test="$session.Scope.user!=null"> 
                                <p><a href="/OnubaShop/acceso/privado"></a></p>
                                <p><a href="/OnubaShop/acceso/logout"></a></p>
                            </c:when>
                            <c:otherwise>
                                <p><a href="/OnubaShop/acceso/alta"></a></p>
                                <p><a href="/OnubaShop/acceso/login"></a></p>
                            </c:otherwise>
                        </c:choose>

                </div>
            </div>
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