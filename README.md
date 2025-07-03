# 🛒 Sistema de Catálogo de Produtos e Simulação de Pedidos

Este projeto é uma aplicação distribuída composta por microsserviços independentes que simulam um **catálogo de produtos** e um sistema de **pedidos**, utilizando **Spring Boot**, **Spring Cloud**, **Eureka Service Discovery** e **Spring Cloud Gateway**.

## 📌 Objetivo

Demonstrar uma arquitetura simples baseada em microsserviços, onde:
- Cada serviço é independente;
- Os serviços se comunicam via HTTP;
- Um **API Gateway** centraliza as rotas;
- Um **Service Discovery (Eureka)** permite escalabilidade e registro automático dos serviços.

## 🧱 Arquitetura


                +----------------------+
                |     Eureka Server    |
                |   (Service Registry)  |
                +----------+-----------+
                            |
            --------------+--------------
            |                           |
    +-------v-------+           +--------v--------+
    | catalog-service|          |  order-service  |
    |    (Produtos)  |          |    (Pedidos)    |
    +-------+-------+           +--------+--------+
            \                           /
                \                         /
                +----------+------------+
                            |
                +----------v----------+
                |     API Gateway     |
                |  (Spring Cloud GW)  |
                +---------------------+




## 🧪 Funcionalidades

### 📦 catalog-service
- Endpoint: `GET /products`
- Retorna uma lista de produtos simulados.

### 🛒 order-service
- Endpoint: `GET /orders/simulate`
- Consome o `catalog-service` e simula um pedido com os produtos.

### 🌐 api-gateway
- Encaminha requisições para os microsserviços:
  - `/products/**` → `catalog-service`
  - `/orders/**` → `order-service`

## 🚀 Como Executar

### Pré-requisitos
- Java 17+
- Maven
- IDE (ex: IntelliJ, VSCode ou Eclipse)

### Passo a passo

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seuusuario/catalogo-pedidos-microsservicos.git
   cd catalogo-pedidos-microsservicos

## Execute os projetos na seguinte ordem:

- eureka-server → `Porta: 8761`

- catalog-service → `Porta: 8081`

- order-service → `Porta: 8082`

- pi-gateway → `Porta: 8080`

## Acesse os endpoints:

http://localhost:8080/products

http://localhost:8080/orders/simulate

http://localhost:8761 → Painel do Eureka

📁 Estrutura do Projeto

    catalogo-pedidos-microsservicos/
    │
    ├── api-gateway/
    ├── catalog-service/
    ├── eureka-server/
    ├── order-service/
    └── README.md


## 🛠️ Tecnologias Utilizadas

| Tecnologia                  |                                               |
|----------------------------|--------------------------------------------------|
| Java 17                    | ![Java](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)         |
| Spring Boot                | ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=white)   |
| Spring Cloud Netflix Eureka| ![Eureka](https://img.shields.io/badge/Spring%20Cloud%20Netflix%20Eureka-6DB33F?logo=spring&logoColor=white) |
| Spring Cloud Gateway       | ![Spring Cloud Gateway](https://img.shields.io/badge/Spring%20Cloud%20Gateway-6DB33F?logo=spring&logoColor=white) |
| REST (HTTP)                | ![REST](https://img.shields.io/badge/REST-API-blue)                              |
| Maven                      | ![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white)          |


## 📚 Referências
Spring Cloud Netflix Docs
Spring Cloud Gateway
Baeldung - Microservices with Spring Boot



## 👩‍💻 Desenvolvido por
[![Victória Freyre](https://img.shields.io/badge/%20Victória%20Freyre-7D3C98?style=for-the-badge&logo=github&logoColor=white&animation=glow)](https://github.com/VicFreyre)
