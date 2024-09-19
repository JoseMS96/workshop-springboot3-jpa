# Projeto Spring Boot com JPA/Hibernate

## Descrição

Este projeto Spring Boot utiliza JPA/Hibernate com um banco de dados em memória **H2**, gerado automaticamente ao iniciar a aplicação.

## Como rodar

1. Garanta que a versão do Java que você está utilizando é compatível com a especificada no `pom.xml` do projeto.
2. Execute o arquivo `CourseApplication.java`.

O projeto será iniciado na porta 8080.

## Rotas

As rotas da API podem ser acessadas utilizando o **Postman** ou outra ferramenta de requisições HTTP, já que o projeto é puramente backend.

As rotas estão localizadas no pacote **/src/main/java/br/mg/melojeduardo/course/resources**

## Banco de Dados H2

O banco de dados H2 é configurado para ser gerado automaticamente toda vez que a aplicação for iniciada. Ele roda em modo memória, o que significa que todos os dados são descartados ao finalizar a aplicação.

Para acessar o **H2 Console**, vá até:

[`http://localhost:8080/h2-console`](http://localhost:8080/h2-console)

Use a **JDBC URL** definida no `application.properties` para conectar:

jdbc:h2:mem:testdb






## Tecnologias

- Spring Boot
- JPA/Hibernate
- Banco H2 (em memória)
