# 🚀 API de Usuários - Spring Boot

API REST desenvolvida com **Java + Spring Boot** para gerenciamento de usuários.

O projeto foi criado com foco em aprendizado de backend, arquitetura em camadas e boas práticas no desenvolvimento de APIs REST.

---

Desenvolvido por Leandro durante os estudos de Java e Spring Boot 🚀

# 📚 Funcionalidades

✅ Criar usuário  
✅ Listar usuários  
✅ Buscar usuário por ID  
✅ Atualizar usuário  
✅ Deletar usuário  
✅ Validação de email único  
✅ Tratamento global de erros  

---

# 🛠️ Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

# 📂 Estrutura do Projeto

```text
src
 ┣ 📂 controller
 ┣ 📂 service
 ┣ 📂 repository
 ┣ 📂 model
 ┣ 📂 exception
 ┗ 📂 resources
```

# ⚙️ Endpoints

```➕ Criar usuário

POST /usuarios
Exemplo JSON
{
  "nome": "Leandro",
  "email": "leandro@teste.com",
  "senha": 1234
}

📋 Listar usuários
GET /usuarios
🔍 Buscar usuário por ID
GET /usuarios/{id}

✏️ Atualizar usuário
PUT /usuarios/{id}
Exemplo JSON
{
  "nome": "Novo Nome",
  "email": "novoemail@teste.com",
  "senha": 4321
}

❌ Deletar usuário
DELETE /usuarios/{id}
```

⚠️ Tratamento de Erros

A aplicação possui tratamento global de exceções utilizando:

@ControllerAdvice
@ExceptionHandler
ResponseEntity

Exemplo de resposta de erro
```
{
  "status": 400,
  "erro": "Esse email já existe!",
  "data": "2026-05-12T19:00:00"
}
```
### 🧠 Conceitos Praticados
CRUD completo

Arquitetura em camadas

Repository Pattern

Service Layer

Tratamento global de exceções

ResponseEntity

Optional e orElseThrow

APIs RESTful

Integração com banco de dados

Organização de código

## ▶️ Como Executar o Projeto

1️⃣ Clonar repositório
git clone https://github.com/leandro-2025/API-produtos-java.git

2️⃣ Entrar na pasta
cd API-produtos-java

3️⃣ Configurar banco de dados

Editar o arquivo:

src/main/resources/application.properties

Adicionar suas credenciais:

spring.datasource.url=
spring.datasource.username=
spring.datasource.password=

4️⃣ Executar aplicação
mvn spring-boot:run

# 🧪 Testes

Os testes da API foram realizados utilizando:

Insomnia

# 🚀 Melhorias Futuras
DTOs
Bean Validation
Criptografia de senha
JWT Authentication
Swagger
Docker
Paginação
👨‍💻 Autor

