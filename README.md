# JavaChatBot

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-%23FF9500.svg?style=for-the-badge&logo=lombok&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

JavaChatBot é um chatbot desenvolvido em Java usando Spring Boot. Ele se comunica com a API da Groq para gerar respostas com base em mensagens enviadas pelo usuário.

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Lombok
- Maven
- Groq API

## 📌 Funcionalidades

- Recebe mensagens do usuário via endpoint HTTP.
- Envia solicitações para a API da Groq.
- Retorna respostas geradas pelo modelo de IA da Groq.

## 📂 Estrutura do Projeto

```
JavaChatBot/
├── src/main/java/com/moostdev/ChatBot/Application/Study/
│   ├── config/GroqConfig.java
│   ├── controllers/ChatController.java
│   ├── dto/
│   │   ├── ChatRequestDTO.java
│   │   ├── ChatResponseDTO.java
│   ├── services/GroqService.java
│   ├── Application.java
├── pom.xml
├── README.md
```

## ⚙️ Configuração e Execução

1. Clone o repositório:
   ```sh
   git clone https://github.com/Moost999/JavaChatBot.git
   cd JavaChatBot
   ```

2. Configure a chave da API Groq no ambiente:
   ```sh
   export GROQ_API_KEY="sua_chave_aqui"
   ```

3. Compile e execute o projeto:
   ```sh
   mvn spring-boot:run
   ```

## 🔥 Endpoints

### Chatbot

- **Rota:** `POST /chat`
- **Descrição:** Envia uma mensagem ao chatbot e recebe uma resposta.
- **Corpo da Requisição:**
  ```json
  {
    "messages": [
        {
            "role": "user",
            "content": "Hello, can you help me understand quantum computing?"
        }
    ],
    "temperature": 0.7
  }
  ```
- **Resposta:**
  ```json
  {
    "resposta": "Sure! Quantum computing is a field that..."
  }
  ```

## 🤝 Contribuição

Contribuições são bem-vindas! Para sugerir melhorias ou corrigir bugs, abra uma issue ou envie um pull request.

## 📜 Licença

Este projeto está licenciado sob a MIT License. Consulte o arquivo `LICENSE` para mais detalhes.

