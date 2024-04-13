
![Logo](https://cdn.freelogovectors.net/wp-content/uploads/2023/07/java-logo-01-freelogovectors.net_.png)

# JavaWeb | Projeto Lumierre

Um Sistema de Locadora desenvolvido no curso  de Desenvolvimento Java na instituição Senai Ricardo Lerner, com o objetivo de gerenciar uma locadora de filmes, permitindo aos usuários visualizar, adicionar, editar e excluir filmes, bem como gerenciar clientes. A aplicação oferece uma interface amigável e intuitiva, facilitando a interação dos usuários com o sistema.


## Referência
 - [Repositório FrontEnd]()
 - [Sistema Pagamento - Desenvolvido em Aula](https://github.com/Arthur-Rosa/ProjetoMVC)


## Documentação da API

    Base URL: /locadora

### Rotas do Controller LocadoraController

#### Visualização da Página de Dashboard
```http
GET /dashboard/
```

#### Página adicionar Filme do Dashboard
```http
GET /dashboard/addMovie
```

#### Adicionando Filme POST
```http
POST /dashboard/addMovie
```
| Parâmetro        | Tipo       | Descrição                                   |
| :--------------- | :--------- | :------------------------------------------ |
| titulo           | string     | **Obrigatório**. Título do filme            |
| genero           | string     | **Obrigatório**. Gênero do filme            |
| anoLancamento    | integer    | **Obrigatório**. Ano de lançamento do filme |
| description      | string     | Descrição do filme                          |
| duracao          | string     | Duração do filme                            |
| capa             | string     | URL ou caminho da capa do filme             |

#### Página Editar Filme
```http
GET /dashboard/editMovie
```
| Parâmetro        | Tipo       | Descrição                   |
| :--------------- | :--------- | :-------------------------- |
| id               | Long       | **Obrigatório**. ID do filme|

#### Atualizar Filme POST
```http
POST /dashboard/updateMovie
```
| Parâmetro        | Tipo       | Descrição                                   |
| :--------------- | :--------- | :------------------------------------------ |
| id               | Long       | **Obrigatório**. ID do filme                |
| titulo           | string     | **Obrigatório**. Título do filme            |
| genero           | string     | **Obrigatório**. Gênero do filme            |
| anoLancamento    | integer    | **Obrigatório**. Ano de lançamento do filme |
| description      | string     | Descrição do filme                          |
| duracao          | string     | Duração do filme                            |
| capa             | string     | URL ou caminho da capa do filme             |

#### Deletar Filme
```http
GET /dashboard/deleteMovie
```
| Parâmetro        | Tipo       | Descrição                   |
| :--------------- | :--------- | :-------------------------- |
| id               | Long       | **Obrigatório**. ID do filme|

#### Listar Filmes
```http
GET /dashboard/listMovie
```

---

#### Página adicionar Usuário do Dashboard
```http
GET /dashboard/addUser
```

#### Adicionar Usuário POST
```http
POST /dashboard/addUser
```
| Parâmetro        | Tipo       | Descrição                   |
| :--------------- | :--------- | :-------------------------- |
| nome             | string     | **Obrigatório**. Nome do cliente|
| email            | string     | **Obrigatório**. Email do cliente|
| password         | string     | **Obrigatório**. Senha do cliente|
| nivelPermissao   | string     | Nível de permissão do cliente|
| dataNascimento   | Date       | Data de nascimento do cliente|

#### Página editar Usuário
```http
GET /dashboard/editUser
```
| Parâmetro        | Tipo       | Descrição                   |
| :--------------- | :--------- | :-------------------------- |
| id               | Long       | **Obrigatório**. ID do cliente|

#### Atualizar Usuário POST
```http
POST /dashboard/updateUser
```
| Parâmetro        | Tipo       | Descrição                   |
| :--------------- | :--------- | :-------------------------- |
| id               | Long       | **Obrigatório**. ID do cliente|
| nome             | string     | **Obrigatório**. Nome do cliente|
| email            | string     | **Obrigatório**. Email do cliente|
| password         | string     | **Obrigatório**. Senha do cliente|
| nivelPermissao   | string     | Nível de permissão do cliente|
| dataNascimento   | Date       | Data de nascimento do cliente|

#### Deletar Usuário
```http
GET /dashboard/deleteUser
```
| Parâmetro        | Tipo       | Descrição                   |
| :--------------- | :--------- | :-------------------------- |
| id               | Long       | **Obrigatório**. ID do cliente|

#### Listar Usuários
```http
GET /dashboard/listUser
```

---

#### Página de visualização de Produtos para o Cliente
```http
GET /home
```

#### Página de visualização de detalhes do Filme
```http
GET /home/moviePage
```
| Parâmetro        | Tipo       | Descrição                   |
| :--------------- | :--------- | :-------------------------- |
| id               | Long       | **Obrigatório**. ID do filme|

## Instalação
### Pré-requisitos
Antes de iniciar a instalação, certifique-se de ter os seguintes pré-requisitos instalados:

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [MySQL](https://dev.mysql.com/downloads/mysql/)

### Passos para Instalação

#### 1. Instalação do Java JDK
Se você ainda não possui o Java JDK instalado, faça o download e siga as instruções de instalação no [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).

#### 2. Instalação do Maven
Faça o download do Maven a partir do [site oficial do Maven](https://maven.apache.org/download.cgi) e siga as instruções de instalação para o seu sistema operacional.

#### 3. Instalação do MySQL
- Faça o download do MySQL a partir do [site oficial do MySQL](https://dev.mysql.com/downloads/mysql/).
- Siga as instruções de instalação para o seu sistema operacional.
  
#### 4. Configuração do MySQL
- Após a instalação, crie um banco de dados chamado "locadora" utilizando o MySQL Workbench ou através do terminal com o comando: CREATE DATABASE Locadora;
## Deploy
Para fazer o deploy do projeto localmente, você pode executar o projeto Spring Boot diretamente do Eclipse

## Autores

- [@Drica2023](https://github.com/Drica2023)
- [@Arthur.exe](https://github.com/Ath3Dev)
- [@eigiihs](https://github.com/eigiihs)
- [@kethelyncddias ](https://github.com/kethelyncddias)
- [@laraazx](https://github.com/laraazx)
- [@sarinhallz](https://github.com/sarinhallz)
- [@larissacoelho21](https://github.com/larissacoelho21)

