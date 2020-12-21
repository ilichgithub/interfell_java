Ilich Rondon

java version 1.8

Ejeuctar para desplegar

mvn clean
mvn install
mvn spring-boot:run


la ruta del servicio es 

http://localhost:8080/timezone

el cuerpo de la request debe ser por ejemplo

{"dato1":"20:45:10","dato2":"-3"}

la respuesta del mismo seria ejemplo

{"response":{"time":"23:45:10","timezone":"utc"}}