# DevSuperior - Java Spring Professional

## Desafio 01 - Componentes e injeção de dependência
Neste desafio trabalhamos conceitos de inversão de controle com injeção de dependências com componentes.

O que utilizamos no backend:
- Java
- Framework Spring Boot

O desafio consiste em calcular o valor final de um pedido, que contém ID, valor bruto e desconto.
Foram criados dois serviços para o cálculo do valor final, que consiste em valor com desconto com a adição do frete.

Os serviços criados foram:
- OrderService - Que calcula o valor final do pedido
- ShippingService - Que calcula o valor do frete

Também foi criada uma entidade para representar o pedido:
- Order - Guarda o ID, valor bruto e percentual de desconto

Ambos serviços são injetados com annotations do framework, e ambos recebem um objeto da entidade pedido para realizar os cálculos.
E o serviço do pedido, novamente por injeção, recebe o serviço do frete e o utiliza para obter o valor do frete e calcular o valor final do pedido.

## Como executar
Clonar este repositório, importar na IDE de preferência e executar a classe principal `Dsjsp01Application`.

Os resultados são mostrados no log, visto que a classe principal implementa a interface `CommandLineRunner` do framework Spring.