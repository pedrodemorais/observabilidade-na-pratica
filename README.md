# Observabilidade na Prática

Projeto exemplo do livro **"Observabilidade na Prática: Do Caos ao Controle"**.

Este repositório contém um sistema simples de microserviços utilizado para demonstrar, na prática, os conceitos fundamentais de observabilidade.

O sistema é composto por três serviços independentes:

- **order-service** → responsável por receber o pedido  
- **payment-service** → responsável pelo processamento de pagamento  
- **inventory-service** → responsável pela atualização de estoque  

Fluxo:
Cliente → Order → Payment → Inventory

Antes de executar o projeto, certifique-se de possuir:

- Java 17+
- Maven 3+

---

Cada serviço é uma aplicação Spring Boot independente.

Você deve subir os três serviços separadamente:

 1. Subir o inventory-service
  - cd inventory-service
  - mvn spring-boot:run

2. Subir o payment-service
  -	cd payment-service
  -	mvn spring-boot:run

3. Subir o order-service
  - cd order-service
  - mvn spring-boot:run

---
Com os três serviços em execução, envie uma requisição para:
  - POST http://localhost:8081/orders

O que observar

Ao executar o fluxo, verifique os logs de cada serviço:

Order Service → recebe o pedido
Payment Service → processa o pagamento
Inventory Service → atualiza o estoque

Você verá o mesmo pedidoId sendo utilizado em todos os serviços, permitindo acompanhar o fluxo completo da requisição.

Este projeto representa a versão inicial (simples) de um sistema distribuído.
---
Nos próximos capítulos do livro, ele será evoluído para incluir:

processamento assíncrono (Kafka)
  - retry
  - circuit breaker
  - observabilidade completa (logs, métricas e tracing)
