# IdesoftTest

1)Levantar el servicio con el siguiente comando despues de descargarlo

mvn clean

mvn install




Primero ejecutar el build de la imagen:

docker build -t springio/gs-spring-boot-docker .

Luego ejecutar la imagen docker.

docker run -p 8080:8080 springio/gs-spring-boot-docker




2)Utilizar el siguiente endpoint para busqueda de productos.

http://localhost:8080/search/{comuna} reemplazar {comuna} por la comuna que se requiera 

Ejemplo : http://localhost:8080/search/BUIN
