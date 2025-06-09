# 📖 Criando um Ebook com IAs

## 🎯 Objetivo do projeto

Criar um ebook utilizando tecnologias de IAs para acelerar o desenvolvimento e compartilhar a experiência no desenvolvimento do ebook e do Apache Camel com Spring Boot e Java.

*Esse projeto foi criado com base no desafio de projeto "Criando um Ebook com ChatGPT & MidJourney" do bootcamp [TONNIE - Java and AI in Europe] na [DIO]*

## 💻 Tecnologias utilizadas

- [Microsoft Copilot Chat]
- [Carbon]


## 📄 Resultado Final do Projeto

- 📥 **Download do Ebook em PDF:** [Clique aqui para baixar o ebook](./ebook-O-Despertar-do-Guerreiro-Java.pdf)
- 📊 **Download do Ebook editável pelo PowerPoint:** [Clique aqui para baixar o arquivo do PowerPoint](./ebook-O-Despertar-do-Guerreiro-Java.pptx)
- 🧑‍💻 **Repositório de Exemplo:** Este projeto inclui como submódulo o repositório de exemplo prático com código-fonte dos microsserviços:  
  [didifive/ebook-com-ia-apache-camel-example](https://github.com/didifive/ebook-com-ia-apache-camel-example)
- 🌐 **Publicação no LinkedIn** (aproveite para reagir, comentar e conectar): [Criando um Ebook com IAs]()

---
---

## 🛠️ Passos para a construção

Abaixo estão os passos para a construção do ebook

### 1️⃣ Criando um título épico utilizando IA

O primeiro passo foi criar um título para o ebook. Após prompts com o chat Microsoft Copilot (abaixo descritos), o título criado (escolhido) foi: 
**O Despertar do Guerreiro Java: A Arte Shinobi dos Microsserviços Apache Camel**

<details>

<summary>Prompts e respostas</summary>

**Prompt:**  
Crie um título de um ebook sobre o tema Apache Camel, o ebook é do nicho de programação e o subnicho é Java, microsserviços e o framework Apache Camel. O título deve ser épico e curto, com temática de anime (animação japonesa) de aventura. Me liste 5 variações de títulos.

**Resposta:**  
Aqui estão cinco variações de títulos épicos para seu eBook, inspirados na temática de anime de aventura:
1. **Apache Camel: A Jornada do Código Samurai**  
2. **O Caminho do Guerreiro Java: Dominando Apache Camel**  
3. **Microsserviços no Reino de Camel: A Lenda do Código**  
4. **Apache Camel Chronicles: O Despertar do Dev Shinobi**  
5. **A Saga do Camel Dourado: Conquistando Microsserviços com Java**
Cada título evoca uma vibe aventureira, heroica e misteriosa, perfeita para atrair programadores que gostam de desafios épicos! Gostou de algum ou quer uma versão ainda mais audaciosa? 🚀🔥

---

**Prompt:**  
Combine os dois títulos abaixo para gerar novos títulos poderosos mantendo a temática de anime e foco no framework Apache Camel:
"O Caminho do Guerreiro Java: Dominando Apache Camel"
"Apache Camel Chronicles: O Despertar do Dev Shinobi"

**Resposta:**  
Aqui estão algumas combinações poderosas dos seus títulos, mantendo a temática de anime e o foco no Apache Camel:
1. **Apache Camel Chronicles: O Caminho do Dev Samurai**
2. **O Despertar do Guerreiro Java: A Saga Apache Camel**
3. **Apache Camel: A Jornada do Shinobi do Código**
4. **A Lenda do Guerreiro Java: Dominando o Reino Camel**
5. **O Código Secreto dos Devs: A Arte Shinobi do Apache Camel**
Cada um traz um toque épico e aventureiro, perfeito para capturar a essência da jornada dos programadores! Gostou de algum? 🚀🔥

---

**Prompt:**  
Gostei da resposta, mas quero também incluir referência à arquitetura de microsserviços, gere outros títulos que mantém a temática de anime, continue remetendo ao framework Apache Camel, mas que mostre o poder do desenvolvimento do Apache Camel em arquitetura de microsserviços, lembrando que o título deve ser poderoso e curto. abaixo deixo 2 opções dos anteriores que gostei para poder misturar:
"O Código Secreto dos Devs: A Arte Shinobi do Apache Camel"
"O Despertar do Guerreiro Java: A Saga Apache Camel"

**Resposta:**  
Aqui estão algumas variações épicas, agora incorporando a arquitetura de microsserviços e mantendo a vibe de anime e Apache Camel:
1. **O Código Secreto dos Devs: A Arte Shinobi dos Microsserviços Apache Camel**
2. **O Despertar do Guerreiro Java: A Revolução dos Microsserviços com Apache Camel**
3. **A Arte Ninja dos Microsserviços: Dominando Apache Camel no Campo de Batalha**
4. **Apache Camel: A Jornada Shinobi na Arquitetura dos Microsserviços**
5. **O Samurai do Código: Microsserviços e Apache Camel na Era Digital**
Cada título reforça o poder do Apache Camel no desenvolvimento de microsserviços, enquanto mantém a essência heroica e aventureira dos animes! Algum desses te parece perfeito ou deseja ajustes? 🚀🔥

</details>


### 2️⃣ Arte para a capa

Após escolher um título para o ebook, a próxima etapa é criar uma arte para a capa. Aqui utilizei também o chat do Microsoft Copilot para gerar.

**Prompt:**   
Crie uma imagem com personagem estilo shinobi e que esteja com uma xícara de café (para representar a linguagem de programação java), tenha um camelo (para representar o framework apache camel) e a paisagem seja de primavera (para representar o framework spring boot). A imagem deve ser estilo anime (animação japonesa) 

**Resposta:**  
![Arte Capa](artecapa.png)


### 3️⃣ Montar a capa

Com a imagem para a capa, a próxima etapa é criar a capa do ebook em si, para isso pode-se utilizar ferramentas como Microsoft PowerPoint, LibreOffice Impress, Google Slides ou até o Canva (mesmo que não é otimizado para documentos). 

Como possuo o PowerPoint eu escolhi essa ferramenta.

### 4️⃣ Montar o layout do conteúdo

Depois de montar a capa o próximo passo foi definir o layout do conteúdo para padronizar. Foram montados 2 layouts: 1 de capa para cada seção/capítulo para separar o conteúdo e outro para o conteúdo em si.

### 5️⃣ Prompt para o conteúdo

Após ter os layouts o próximo passo foi criar o conteúdo, para isso utilizei novamente o Microsoft Copilot para gerar o conteúdo de base com o prompt abaixo.

<details>

<summary>Prompt e resposta</summary>

**Prompt**  
Faça um texto para ebook com foco no framework Apache Camel, considerando o uso do Apache Camel 4.10 com Java 21 e Spring Boot 3.5. Demonstrando como criar 2 microsserviços (A e B) que se comunicam através de um message broker.  
  
{REGRAS}  
- Explicar de maneira simples considerando o público programadores estagiários e júniors
- O texto deve compreender: os requisitos mínimos tal como ter que possuir o JDK 21, maven e docker, sobre como criar o arquivo do docker compose, criar o projeto de cada microsserviço (mostrar a configuração e as dependencias básicas no pom.xml) para que o leitor possa replicar os passos
- Trazer exemplos de códigos que contemplem os requisitos do projeto geral e de cada microsserviço
- Sempre crie um título e um subtítulo sugestivo para cada tópico
- Considere a temática de anime (animação japonesa) de aventura
- Considere o título do ebook "O Despertar do Guerreiro Java: A Arte Shinobi dos Microsserviços Apache Camel"
  
{Requisitos do projeto geral}  
- O projeto deve conter 2 microsserviços e docker-compose para executar componentes externos (como o message broker)
- Os microsserviços devem utilizar as tecnologias Java 17, maven, Spring Boot 3.5 e Apache Camel 4.10
- O message broker é ActiveMQ
  
{Requisitos do Microsserviço A}  
- Deve ler arquivo que fica na pasta c:/carta-recebida
- Deve checar se na primeira linha contém a frase secreta correta
- Deve extrair os e-mails da segunda linha (e-mails devem estar separados por ";") 
- Deve extrair o assunto da terceira linha
- O restante do conteúdo do arquivo representa a mensagem que será enviada ao destinatário do email extraido
- Para cada e-mail coletado, é enviado uma mensagem ao Message Broker em uma fila "mensagems para enviar" contendo o email do destinatário, o assunto e a mensagem
  
{Requisitos do Microsserviço B}  
- Deve ficar escutando a fila "mensagems para enviar" para checar se tem mensagens para enviar
- Quando receber a mensagem deve pegar as informações de e-mail, assunto e mensagem para gerar um e-mail para envio ao destinatário.


**Resposta** 

A seguir, segue um capítulo do ebook "O Despertar do Guerreiro Java: A Arte Shinobi dos s Apache Camel", repleto de aventura e simplicidade para que você, guerreiro em formação, possa dominar a arte dos microsserviços com Apache Camel 4.10, Java (JDK 21) e Spring Boot 3.5. Cada tópico apresenta um título e subtítulo sugestivo para guiar sua jornada.

*Capítulo 1: Preparando o Terreno da Batalha*
*Subtítulo: Requisitos Básicos para Ingressar na Missão Shinobi*

Antes de iniciar sua aventura, é imprescindível que seu arsenal esteja completo. Certifique-se de ter instalados os seguintes itens:
- JDK 21
- Maven
- Docker (para orquestrar componentes externos)

Além disso, sua missão integrará dois microsserviços que se comunicarão por meio de um message broker, utilizando o ActiveMQ via Docker Compose.

*Capítulo 2: A Força do Dragão Docker Compose*
*Subtítulo: Configurando o ActiveMQ para a Comunicação Mística*

Para que a comunicação entre nossos microsserviços ocorra com precisão, vamos utilizar o Docker Compose para lançar o ActiveMQ, nosso message broker lendário. Crie um arquivo chamado docker-compose.yml com o seguinte conteúdo:

```yaml
version: '3'
services:
  activemq:
    image: rmohr/activemq:latest
    ports:
      - "61616:61616"
      - "8161:8161"
```

Este arquivo configura o ActiveMQ para escutar na porta 61616 (para mensagens) e 8161 (para interface administrativa). Assim, nosso clã de microsserviços terá um canal seguro para trocar informações.


*Capítulo 3: Forjando o Arsenal do Guerreiro*
*Subtítulo: Criando Projetos Maven e Configurando o pom.xml*

Para equipar cada microsserviço, crie dois projetos Maven independentes. No arquivo pom.xml de cada projeto, adicione as seguintes configurações mínimas:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.guerreiro.java</groupId>
  <artifactId>microservico-a-ou-b</artifactId>
  <version>1.0.0</version>
  <properties>
    <java.version>21</java.version>
    <spring-boot.version>3.5.0</spring-boot.version>
    <camel.version>4.10.0</camel.version>
  </properties>
  <dependencies>
    <!-- Spring Boot Starter -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter</artifactId>
    </dependency>
    <!-- Apache Camel com Spring Boot -->
    <dependency>
      <groupId>org.apache.camel.springboot</groupId>
      <artifactId>camel-spring-boot-starter</artifactId>
      <version>${camel.version}</version>
    </dependency>
    <!-- Dependência para integração com ActiveMQ -->
    <dependency>
      <groupId>org.apache.activemq</groupId>
      <artifactId>activemq-camel</artifactId>
      <version>5.16.4</version>
    </dependency>
  </dependencies>
  <build>
    <plugins>
      <!-- Plugin do Spring Boot -->
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
    </plugins>
  </build>
</project>
```

Esse pom.xml equipará seus projetos com os recursos necessários para criar e gerenciar rotas com Apache Camel, além de integrar o ActiveMQ e rodar com Spring Boot.

*Capítulo 4: Missão Secreta do Microsserviço A*
*Subtítulo: Decifrando a Mensagem e Enviando Sinais para a Guerra*

O Microsserviço A é o mensageiro secreto responsável por ler missivas guardadas na pasta c:/carta-recebida. Sua missão é:

Verificar se a primeira linha contém a frase secreta correta.

Extrair os e-mails da segunda linha (separados por ;).

Obter o assunto da terceira linha.

Ler o restante do arquivo para compor a mensagem.

Para cada e-mail extraído, enviar uma mensagem formatada à fila mensagems_para_enviar do ActiveMQ.

Segue um exemplo de rota com Apache Camel:

```java
package com.guerreiro.java.microservicoa;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouteMicroservicoA extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file://c:/carta-recebida?noop=true")
            .process(exchange -> {
                String conteudo = exchange.getIn().getBody(String.class);
                String[] linhas = conteudo.split("\\r?\\n");
                
                if (linhas.length < 4 || !linhas[0].trim().equals("SENHA-SECRETA")) {
                    throw new Exception("Arquivo inválido ou senha incorreta!");
                }
                
                String[] emails = linhas[1].split(";");
                String assunto = linhas[2];
                StringBuilder mensagemBuilder = new StringBuilder();
                for (int i = 3; i < linhas.length; i++) {
                    mensagemBuilder.append(linhas[i]).append("\n");
                }
                String mensagem = mensagemBuilder.toString();
                
                for (String email : emails) {
                    String mensagemFormatada = String.format("TO:%s;SUBJECT:%s;MESSAGE:%s", email.trim(), assunto, mensagem);
                    exchange.getContext()
                            .createProducerTemplate()
                            .sendBody("activemq:queue:mensagems_para_enviar", mensagemFormatada);
                }
            })
            .log("Arquivo processado e mensagens enviadas para a fila.");
    }
}
```

Neste código, o microsserviço lê o arquivo, verifica a autenticidade da missão e distribui as mensagens para cada destinatário via ActiveMQ.

*Capítulo 5: O Despertar do Guardião*
*Subtítulo: Microsserviço B - O Vigia da Fila e o Envio do Alerta*

Enquanto o mensageiro A envia as mensagens, o Microsserviço B mantém-se alerta, escutando a fila mensagems_para_enviar. Quando uma mensagem chega, ele extrai os dados (e-mail, assunto e mensagem) e simula o disparo de um e-mail para o destinatário. Eis um exemplo prático:

```java
package com.guerreiro.java.microservicob;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouteMicroservicoB extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("activemq:queue:mensagems_para_enviar")
            .process(exchange -> {
                String corpo = exchange.getIn().getBody(String.class);
                // Formato esperado: "TO:email;SUBJECT:assunto;MESSAGE:mensagem"
                String[] partes = corpo.split(";");
                if (partes.length < 3) {
                    throw new Exception("Mensagem mal formatada.");
                }
                String email = partes[0].substring(partes[0].indexOf(":") + 1).trim();
                String assunto = partes[1].substring(partes[1].indexOf(":") + 1).trim();
                String mensagem = partes[2].substring(partes[2].indexOf(":") + 1).trim();
                
                // Simula o envio do e-mail (substitua por integração com seu serviço de e-mail real)
                System.out.println("Enviando e-mail para: " + email);
                System.out.println("Assunto: " + assunto);
                System.out.println("Mensagem: " + mensagem);
            })
            .log("Mensagem recebida e processada para envio do e-mail.");
    }
}
```

Com essa rota, o Microsserviço B atua como o guardião da comunicação, pronto para converter as mensagens recebidas em ações que alertam os destinatários.

*Capítulo 6: União de Forças – O Despertar Final*
*Subtítulo: Integrando Sabedoria e Tecnologia para Vencer a Batalha Digital*

Nesta aventura, dois microsserviços – o mensageiro secreto (Microsserviço A) e o vigilante (Microsserviço B) – unem forças por meio do ActiveMQ e do Apache Camel. Com o Docker Compose orquestrando o cenário e o Maven gerenciando as dependências, você possui agora um exemplo prático e enxuto para criar sistemas integrados e escaláveis.

Use esses exemplos para expandir seu arsenal, testar novas rotas e, quem sabe, personalizar sua jornada na arte dos microsserviços. A cada linha de código, você se aproxima do domínio total dessa técnica ninja!

Esta aventura prática proporciona os passos mínimos para que você possa replicar e expandir o projeto. Se desejar aprofundar em testes, configurações avançadas ou integração com serviços reais de envio de e-mails, sua próxima missão já está lançada

</details>


### 6️⃣ Revisão e inclusão do conteúdo

Após a elaboração do conteúdo sugerido, foi realizada uma revisão detalhada. Aproveitando essa etapa, foi criado o projeto de exemplo [didifive/ebook-com-ia-apache-camel-example], implementando o código apresentado no ebook. Isso permitiu validar, revisar e testar funcionalmente o funcionamento do código, além de incluir testes unitários, estes últimos não foram abordados no ebook, pois estavam fora do escopo do documento.


### 7️⃣ Montagem do ebook
Com o conteúdo revisado e validado, o próximo passo foi montar o ebook no PowerPoint. Para isso, foram utilizados os layouts criados anteriormente, garantindo que cada seção do ebook tivesse uma apresentação visual consistente e atraente.


### 8️⃣ Agradecimentos
Para finalizar o ebook, foi adicionada uma página de agradecimentos, onde foram incluídos links para a DIO e para o bootcamp TONNIE, além de links para as ferramentas utilizadas, como o Microsoft Copilot Chat e o Carbon.


### 9️⃣ Exportação do ebook
Após a montagem do ebook no PowerPoint, o último passo foi exportar o arquivo para PDF. O PowerPoint permite essa funcionalidade de forma simples, garantindo que o layout e o conteúdo sejam preservados.


---

Criado com paixão, dedicação e o compromisso sincero de compartilhar conhecimento 🧑‍💻❤️🤝📚



[DIO]: https://www.dio.me/sign-up?ref=WQ0TRWQ8E1 
[TONNIE - Java and AI in Europe]: https://www.dio.me/bootcamp/tonnie-java-and-ai-europe?ref=WQ0TRWQ8E1

[Microsoft Copilot Chat]: https://copilot.microsoft.com/
[Carbon]: https://carbon.now.sh/

[didifive/ebook-com-ia-apache-camel-example]: https://github.com/didifive/ebook-com-ia-apache-camel-example