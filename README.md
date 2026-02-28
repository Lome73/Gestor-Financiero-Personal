💰 Gestión de Dinero - Control de Gastos Mensuales

Este es un sistema local desarrollado para administrar ingresos y egresos mes por mes. El objetivo es tener un control claro de cuánto se gasta y en qué se va el dinero.

🚀 Requisitos del Sistema

Para que este programa funcione correctamente, necesitas tener instalado un servidor local. 

* Servidor Sugerido: [XAMPP](https://www.apachefriends.org/es/index.html) (Versión 8.2.12 o superior).
* Lenguaje: Java.
* Base de Datos: MySQL .

🛠️ Instalación y Configuración

Sigue estos pasos para poner en marcha el proyecto en tu computadora:

1.  Descargar XAMPP: Si no lo tienes, descarga el instalador que se encuentra en la carpeta `Servidor` (o desde la web oficial).
2.  Mover el Proyecto: Copia la carpeta de este repositorio y pégala dentro de la ruta de instalación de XAMPP:
    `C:\xampp\htdocs\Gestion-de-Dinero`
3.  Iniciar Servidor: Abre el XAMPP Control Panel e inicia los módulos *Apache* y *MySQL*.

   
   <img width="661" height="422" alt="image" src="https://github.com/user-attachments/assets/e58288f7-2f3e-41e7-a9fb-89a075a210d8" />


4.  Configurar Base de Datos:
    Ve a `http://localhost/phpmyadmin`.
    Crea una base de datos llamada `deudass`.
    Importa el archivo SQL que se encuentra en la carpeta deudass.sql y selecciona ese archivo para pasar la base de datos, al momento de agregarla iras a la parte de abajo donde dice "IMPORTAR", das clic     y automaticamente tendras la base de datos con el programa sincronizado.


    <img width="685" height="458" alt="image" src="https://github.com/user-attachments/assets/df8bb8f7-f017-47bf-802b-85a3b5ae61f3" />


✨ Funcionalidades
- [ ] Registro de entradas de dinero.
- [ ] Categorización de gastos.
- [ ] Reportes mensuales.
- [ ] Gráficos de consumo.


<img width="1450" height="814" alt="image" src="https://github.com/user-attachments/assets/6f6c64da-8bac-4042-a695-4d8b5a8c5326" />
