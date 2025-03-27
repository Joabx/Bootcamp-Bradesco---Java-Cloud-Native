# 👥 Hierarquia de Classes para Tipos de Usuários
Crie uma hierarquia de classes que definem os tipos de usuários de um sistema, use os seguintes requisitos:

## Classe Gerente
### Atributos:
- Nome
- Email
- Senha
- Um atributo que informa se ele é administrador <i> (esse último deve ser sempre verdadeiro).</i>


## Classe Vendedor
### Atributos:
- Nome
- Email
- Senha
- Quantidade de vendas
- E um atributo que informa se ele é administrador <i>(esse último deve ser sempre falso).</i>

## Classe Atendente
### Atributos:
- Nome
- Email
- Senha
- Valor em caixa
- E um atributo que informa se ele é administrador <i>(esse último deve ser sempre falso). </i>

Cada classe deve ter seus respectivos getters e setters <i> (para atributos que façam sentido ter). </i>

E as classes devem ter os seguintes métodos:

## A classe Gerente deve ter os métodos:

- Gerar relatório financeiro
- Consultar vendas
- Realizar login
- Realizar logoff
- Alterar dados
- Alterar senha

## A classe Vendedor deve ter os métodos:

- Realizar venda <i> (incrementar o número de vendas quando acionado)</i>
- Consultar vendas
- Realizar login
- Realizar logoff
- Alterar dados
- Alterar senha

## A classe Atendente deve ter os métodos:

- Receber pagamentos <i> (onde o método recebe um valor que deve ser incrementado no valor em caixa) </i>
- Fechar o caixa
- Realizar login
- Realizar logoff
- Alterar dados
- Alterar senha