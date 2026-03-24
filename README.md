API de Gerenciamento de Pedidos

Sistema REST para controle de pedidos com data, valor e status.

Tecnologias

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database

Estrutura do projeto

* models → entidades JPA
* repositories → acesso ao banco de dados
* services → regras de negócio
* controllers → endpoints REST

Endpoints

* POST /pedidos
* GET /pedidos
* GET /pedidos/{id}
* PUT /pedidos/{id}
* DELETE /pedidos/{id}

Como testar

Os endpoints podem ser testados utilizando:

Postman
ou
Swagger: http://localhost:8080/swagger-ui/index.html
