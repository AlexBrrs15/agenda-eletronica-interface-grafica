# 📒 Agenda Eletrônica com Interface Gráfica em Java (Swing)

## 📌 Descrição

Este projeto consiste em uma **Agenda Eletrônica desenvolvida em Java**, utilizando **Programação Orientada a Objetos (POO)** e **Interface Gráfica com Java Swing**.  
O sistema permite o **cadastro, busca, exclusão e visualização de contatos**, oferecendo uma interface limpa, intuitiva e funcional.

O projeto tem **finalidade didática e acadêmica**, sendo adequado para avaliações práticas, trabalhos de curso e provas técnicas.

---

## 🛠️ Tecnologias Utilizadas

- Java (JDK 8 ou superior)
- Java Swing
- Git e GitHub
- GitHub Codespaces
- IDE compatível (VS Code, Eclipse ou IntelliJ)

---

## 📂 Estrutura do Projeto

src/<br>
 ├── Agenda.java<br>
 ├── Contato.java<br>
 └── AgendaGUI.java


---

## 📄 Descrição das Classes

### 🔹 Agenda.java
Classe responsável pela **lógica do sistema**, contendo:
- Lista de contatos (`List<Contato>`)
- Cadastro de contatos
- Busca de contato pelo CPF
- Exclusão de contatos
- Retorno seguro da lista de contatos

---

### 🔹 Contato.java
Classe modelo que representa um contato da agenda, contendo:
- CPF
- Nome
- Email
- Telefone

Inclui:
- Construtor
- Getters e setters
- Validações para evitar dados nulos ou inválidos

---

### 🔹 AgendaGUI.java
Classe responsável pela **interface gráfica**, permitindo ao usuário:
- Cadastrar novos contatos
- Buscar contatos existentes
- Excluir contatos
- Visualizar todos os contatos em uma tabela (`JTable`)

Utiliza os principais componentes do Swing:
- `JFrame`
- `JPanel`
- `JLabel`
- `JTextField`
- `JButton`
- `JTable`

---

## ✅ Funcionalidades

✔️ Cadastrar novos contatos  
✔️ Buscar contato pelo CPF  
✔️ Excluir contato  
✔️ Exibir todos os contatos cadastrados  
✔️ Validação de campos obrigatórios  
✔️ Interface gráfica organizada e intuitiva  

---

## 🖥️ Interface Gráfica

A interface foi projetada com foco em:
- Facilidade de uso
- Clareza visual
- Organização dos componentes
- Separação entre lógica e interface

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/agenda-eletronica-interface-grafica.git

2. Abra o projeto em uma IDE Java ou no GitHub Codespaces

3. Execute a classe principal:
-AgendaGUI.java

## 📋 Requisitos

- Java JDK 8 ou superior  
- Ambiente que suporte aplicações gráficas (Java Swing)

---

## 📚 Conceitos Aplicados

- Programação Orientada a Objetos (POO)  
- Encapsulamento  
- Validação de dados  
- Coleções (`List` e `ArrayList`)  
- Interface gráfica com Java Swing  
- Organização e boas práticas de código  

---

## 🎓 Contexto Acadêmico

Projeto desenvolvido para fins educacionais, sendo indicado para:

- Trabalhos acadêmicos  
- Avaliações práticas  
- Provas técnicas  
- Demonstração de conhecimento em Java e Swing  

---

## ✍️ Autor

**Alexx Barroso**  
Desenvolvedor e estudante de Java  

---

## 📄 Licença

Projeto de uso livre para fins educacionais.
