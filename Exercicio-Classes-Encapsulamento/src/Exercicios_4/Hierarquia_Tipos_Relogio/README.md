# ⏰ Hierarquia de Classes para Criação de Relógios

Escreva uma hierarquia de classes para criação de relógios para diferentes lugares do mundo.

## Defina uma classe pai que tenha as propriedades:

- Hora
- Minuto
- Segundo

Com seus respectivos getters e setters <i>(atendendo as regras do funcionamento de um relógio) </i>

E um método que deverá retornar a hora no formato <b> HH:MM:SS. </b>

## A partir dessa classe, crie 2 implementações:

- Relógio Americano: Nesse formato, não existem as horas de 13 até 24.
- Relógio Brasileiro: Segue o formato padrão de 24 horas.

Defina também na superclasse um método que ficará por responsabilidade da classe que a estende.

Esse método deve receber um relógio <i>(independente da implementação) </i>

E deve-se extrair as informações dele e usá-las no objeto que recebeu para setar as novas informações do relógio.