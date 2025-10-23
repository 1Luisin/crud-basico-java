# 🧩 CRUD Básico em Java (Maven)

Projeto simples de estudo desenvolvido em **Java com Maven**, com o objetivo de realizar operações **CRUD (Create, Read, Update, Delete)** em um banco de dados MySQL.

---

## 📝 Visão Geral

Este projeto foi criado para praticar a integração entre **Java**, **JDBC** e **banco de dados**.  
A aplicação é executada no **console**, permitindo realizar o gerenciamento de registros (usuários, clientes, etc.) por meio de um menu interativo.

---

## ⚙️ Tecnologias Utilizadas

- ☕ **Java**
- 🧱 **Maven**
- 🗄️ **MySQL**
- 🔌 **JDBC**
- 🧰 **IDE:** IntelliJ IDEA / Eclipse

---

## 📂 Estrutura do Projeto

```

crud-basico-java/
├─ .idea/                     → Arquivos de configuração da IDE
├─ ConectorMYSQL/             → Classes responsáveis pela conexão com o banco
├─ src/main/java/br/com/scmjf/
│   ├─ dao/                   → Classes de acesso ao banco (CRUD)
│   ├─ model/                 → Classes modelo (entidades)
│   ├─ view/                  → Interface via console (menus e interações)
│   └─ Main.java              → Classe principal
├─ pom.xml                    → Configurações do Maven e dependências
└─ README.md                  → Este arquivo ✨

````

---

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/1Luisin/crud-basico-java.git
````

### 2️⃣ Importar na sua IDE

Abra o projeto em sua IDE preferida (IntelliJ, Eclipse, VS Code com extensão Java, etc).

### 3️⃣ Configurar o banco de dados

Crie um banco no MySQL e configure as credenciais de conexão no seu projeto Java.

Exemplo de criação de tabela:

```sql
CREATE DATABASE crud_java;
USE crud_java;

CREATE TABLE usuario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(100) NOT NULL
);
```

### 4️⃣ Executar o projeto

No terminal da IDE ou no console:

```bash
mvn clean install
mvn exec:java -Dexec.mainClass="br.com.scmjf.Main"
```

---

## 🧠 Funcionalidades

✅ **Criar** — adiciona um novo registro ao banco
🔍 **Ler** — lista todos os registros existentes
✏️ **Atualizar** — modifica dados de um registro
🗑️ **Excluir** — remove registros do banco
🔗 **Conexão JDBC** — integração direta com o MySQL

---

## 💡 Pontos de Aprendizado

* Utilização do **Maven** para gerenciamento de dependências
* Implementação de operações **CRUD** via **JDBC**
* Boas práticas de **organização de pacotes e classes**
* Manipulação de **dados persistentes em banco de dados**

---

## 🧭 Possíveis Melhorias Futuras

* Migrar o console para uma **API REST** com **Spring Boot**
* Implementar **login/autenticação de usuários**
* Adicionar **JUnit** para testes automatizados
* Usar **Hibernate/JPA** para mapeamento ORM
* Criar uma **interface web** (HTML, CSS, JS) para interagir com o CRUD

---

## 📄 Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).
Sinta-se à vontade para usar, modificar e compartilhar! 😄

---

## 👨‍💻 Autor

**Desenvolvido por [Luisin](https://github.com/1Luisin)**

> Projeto de aprendizado e prática com Java e MySQL 🚀

```

