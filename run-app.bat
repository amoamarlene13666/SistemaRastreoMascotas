@echo off
echo Eliminando logs antiguos...
del logs\mascotas-debug.log 2>nul
echo Corriendo la aplicación...
mvn spring-boot:run