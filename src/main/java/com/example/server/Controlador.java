package com.example.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("/")
    public String hola() {
        return "¡Hola mundo!";
    }

    @GetMapping("/futbol")
    public String futbol(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Mi Página Web Sencilla</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <header>\n" +
                "        <h1>Bienvenido a Mi Página Web</h1>\n" +
                "    </header>\n" +
                "    <nav>\n" +
                "        <ul>\n" +
                "            <li><a href=\"#\">Inicio</a></li>\n" +
                "            <li><a href=\"#\">Acerca de</a></li>\n" +
                "            <li><a href=\"#\">Servicios</a></li>\n" +
                "            <li><a href=\"#\">Contacto</a></li>\n" +
                "        </ul>\n" +
                "    </nav>\n" +
                "    <main>\n" +
                "        <h2>Acerca de Nosotros</h2>\n" +
                "        <p>Somos una pequeña empresa dedicada a crear soluciones web.</p>\n" +
                "\n" +
                "        <h2>Nuestros Servicios</h2>\n" +
                "        <ul>\n" +
                "            <li>Diseño web</li>\n" +
                "            <li>Desarrollo de aplicaciones</li>\n" +
                "            <li>Marketing en línea</li>\n" +
                "        </ul>\n" +
                "    </main>\n" +
                "    <footer>\n" +
                "        <p>&copy; 2023 Mi Página Web Sencilla</p>\n" +
                "    </footer>\n" +
                "</body>\n" +
                "</html>\n";
    }
}
