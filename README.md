# Getting Started
Inicialmente se deberá generar la base de datos a utilizar mediante el fichero docker-compose.yml en la raiz este creará la red, la base de datos e insertará la información predefinida en el fichero db.sql que se encuentra dentro de la carpeta sql.

Docker al generar el contenedor de la BD le asigna una dirección ip, la cual se puede obtener mediante el comando
sudo docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' db_test

Se puede acceder a la api a través de la url http: 
# Actuator
Toda la información de la api está pública a través de la url
http://localhost:9000/manage/actuator/