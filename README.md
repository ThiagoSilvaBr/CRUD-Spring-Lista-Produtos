---

# 📦 CRUD Spring Boot - Lista de Produtos

API REST desenvolvida com **Spring Boot** para gerenciamento de produtos, utilizando operações CRUD (Create, Read, Update, Delete).

O projeto utiliza **H2 Database (em memória)** e pode ser testado facilmente com **Postman** ou qualquer cliente HTTP.

---

## 🚀 Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Web (REST API)
* Spring Data JPA
* H2 Database
* Maven

---

## 📌 Funcionalidades

A API permite:

* Criar um produto
* Listar todos os produtos
* Buscar produto por ID
* Atualizar produto
* Deletar produto

---

## 🗄️ Banco de Dados (H2)

Este projeto utiliza o **H2 Database**, um banco de dados em memória ideal para desenvolvimento e testes.

### 📍 Console H2

Após rodar a aplicação, acesse:

```
http://localhost:8080/h2-console
```

### ⚙️ Configuração (application.properties)

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```

---

## ⚙️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/ThiagoSilvaBr/CRUD-Spring-Lista-Produtos.git
```

### 2️⃣ Acessar o diretório

```bash
cd CRUD-Spring-Lista-Produtos
```

### 3️⃣ Executar a aplicação

```bash
mvn spring-boot:run
```

A aplicação será iniciada em:

```
http://localhost:8080
```

---

## 📬 Como Testar a API (Postman)

Você pode testar todos os endpoints usando **Postman** ou **Insomnia**.

---

### 🔗 Endpoints

| Método | Endpoint         | Descrição               |
| ------ | ---------------- | ----------------------- |
| GET    | `/produtos`      | Lista todos os produtos |
| GET    | `/produtos/{id}` | Busca produto por ID    |
| POST   | `/produtos`      | Cria um novo produto    |
| PUT    | `/produtos/{id}` | Atualiza um produto     |
| DELETE | `/produtos/{id}` | Remove um produto       |

---

### 📌 Exemplo de JSON (POST / PUT)

```json
{
  "nome": "Mouse Gamer",
  "preco": 150.00,
  "quantidade": 5
}
```

---

## 🧠 Conceitos Aplicados

Este projeto foi desenvolvido para praticar:

* Desenvolvimento de APIs REST com Spring Boot
* Arquitetura MVC
* Injeção de dependência
* Spring Data JPA
* Banco de dados em memória (H2)
* Boas práticas de organização de projeto

---

## 📁 Estrutura do Projeto

```bash
src
 ├── main
 │   ├── java
 │   │   └── com.seuprojeto
 │   │       ├── controller
 │   │       ├── model
 │   │       ├── repository
 │   │       └── service
 │   └── resources
 │       └── application.properties
```

---

## 📄 Licença

Este projeto está sob a licença **MIT**.

---

## ⭐ Melhorias Futuras

Possíveis evoluções para este projeto:

* Validação de dados (@Valid)
* DTOs para separação de camadas
* Tratamento de exceções global (@ControllerAdvice)
* Swagger para documentação da API
* Paginação e filtros
* Deploy na nuvem (Render / Railway)

---
