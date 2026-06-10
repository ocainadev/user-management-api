# User Management API

API REST desenvolvida com Java e Spring Boot para gerenciamento de usuários e tarefas.

O projeto foi criado com foco em praticar conceitos fundamentais do ecossistema Spring, incluindo persistência de dados com JPA, versionamento de banco com Flyway, arquitetura em camadas e boas práticas de organização de código.

---

## Funcionalidades

### Usuários

- Criar usuário
- Buscar usuário por ID
- Listar todos os usuários
- Atualizar usuário
- Remover usuário

### Tarefas

- Criar tarefa
- Buscar tarefa por ID
- Listar tarefas
- Remover tarefa

---

## Tecnologias Utilizadas

| Tecnologia | Finalidade |
|------------|------------|
| Java 17 | Linguagem principal |
| Spring Boot 4 | Framework Backend |
| Spring Web MVC | Criação da API REST |
| Spring Data JPA | Persistência de dados |
| Hibernate | ORM |
| H2 Database | Banco de dados em memória |
| Flyway | Controle de versões do banco |
| Lombok | Redução de código boilerplate |
| Maven | Gerenciamento de dependências |

---

## Arquitetura

O projeto segue uma arquitetura em camadas:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

Estrutura principal:

```text
src/main/java/dev/ocaina/usercontroller

├── Users
│   ├── UserController
│   ├── UserService
│   ├── UserRepository
│   ├── UserDTO
│   ├── UserMapper
│   └── UserModel
│
├── Tasks
│   ├── TaskController
│   ├── TaskService
│   ├── TaskRepository
│   └── TaskModel
│
└── UserManagementApplication
```

---

## Banco de Dados

O projeto utiliza H2 Database para facilitar o desenvolvimento e testes.

Além disso, utiliza Flyway para controle de versões do banco de dados.

Exemplo de migration:

```text
db/migrations
└── V2__Add_rank_tb_users.sql
```

---

## Endpoints

### Usuários

| Método | Endpoint |
|----------|----------|
| GET | /api/user/all |
| GET | /api/user/{id} |
| POST | /api/user/create |
| PUT | /api/user/update/{id} |
| DELETE | /api/user/delete/{id} |

### Tarefas

| Método | Endpoint |
|----------|----------|
| GET | /api/task/all |
| GET | /api/task/{id} |
| POST | /api/task/create |
| DELETE | /api/task/delete/{id} |

---

## Executando o Projeto

Clone o repositório:

```bash
git clone https://github.com/ocainadev/user-management-api.git
```

Entre na pasta:

```bash
cd user-management-api
```

Execute:

```bash
mvn spring-boot:run
```

Ou gere o jar:

```bash
mvn clean package
```

```bash
java -jar target/UserManagement-0.0.1-SNAPSHOT.jar
```

---

## Testes

```bash
mvn test
```

---

## Conceitos Aplicados

- REST APIs
- Spring Boot
- Spring Data JPA
- DTO Pattern
- Mapper Pattern
- Injeção de Dependência
- Arquitetura em Camadas
- Flyway Migrations
- Relacionamentos JPA

---

## Melhorias Futuras

- [ ] Validação com Bean Validation
- [ ] Tratamento global de exceções
- [ ] Swagger/OpenAPI
- [ ] Testes unitários
- [ ] Testes de integração
- [ ] Docker
- [ ] PostgreSQL
- [ ] Paginação
- [ ] Filtros de busca

---

## Autor

**Cainã Santos**

Desenvolvedor BackEnd com foco em Java e Spring Boot.

GitHub:
https://github.com/ocainadev
