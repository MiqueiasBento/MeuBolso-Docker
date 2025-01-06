
# MeuBolso

Este repositório contém uma aplicação utilizando **Spring Boot** como backend e **PostgreSQL** como banco de dados, configurados e executados em contêineres Docker. O objetivo do repositório é dockerizar a aplicação como atividade de Gerência de Configuração, e aprender a configurar e executar aplicações de forma eficiente com Docker.
  
## Estrutura do Projeto

- **API (Spring Boot)**: Backend da aplicação.
- **PostgreSQL**: Banco de dados relacional para persistência.
- **Docker**: Contêineres para API e banco de dados.
  
## Como Executar

1. **Clonar o repositório:**  
   ``git clone <url-do-repositorio>``
  ``cd <nome-do-repositorio>``

2.  **Subir os contêineres com Docker Compose:** Certifique-se de ter o Docker e o Docker Compose instalados no sistema.  
    `docker-compose up`

3. **Executar a aplicação:** ou através da IDE ou com o seguinte comando:  
   `java -jar target/MeuBolso-0.0.1-SNAPSHOT.jar`
    
4.  **Acessar a API:** A aplicação estará disponível em:  
    `http://localhost:8080`
    
5.  **Banco de Dados:** O PostgreSQL será inicializado e estará acessível na porta `5433`.  
    Credenciais padrão:  
    -   **Usuário**: `seu_usuario`
    -   **Senha**: `sua_senha`
    -   **Banco de Dados**: `seu_banco`
  
## Observações

-   O volume de dados do banco de dados é persistente por meio de volumes Docker configurados no arquivo `docker-compose.yml`.
-   Para reconstruir os contêineres ou limpar dados, utilize:  
    `docker-compose down --volumes` 
    

## Tecnologias Utilizadas

-   **Java** (17)
-   **Spring Boot** (3.4.1)
-   **PostgreSQL** (15)
-   **Docker** e **Docker Compose**
-   **Swagger**

## Grupo
**Antônio Rewelli**  
**Lucas Ferreira**  
**Gilliardy Alves**  
**Miqueias Bento**  
