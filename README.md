# Herança

- É um tipo de associação que permite que uma classe herde _todos_ dados e comportamentos de outra
- Definições importantes
- Vantagens
    
    - Reuso
    - Polimorfismo
- Sintaxe

    - class A extends B

> Herança permite o reuso de atributos e métodos (dados e comportamento)

### Definições importantes

- Relação "é-um"
- Generalização/especialização
- Superclasse (classe base) / subclasse (classe derivada)
- Herança / extensão
- Herança é uma associação entre classes (e não objetos)

## Upcasting e downcasting

- Upcasting

  - Casting da subclasse para superclasse
  - Uso comum: polimorfismo
- Downcasting

  - Casting da superclasse para subclasse
  - Palavra instanceof
  - Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)


### Sobreposição, palavra super, anotação @Override

- É a implementação de um método de uma superclasse na subclasse
- É fortemente recomendável usar a
  anotação @Override em um método
  sobrescrito

  - Facilita a leitura e compreensão do código
  - Avisamos ao compilador (boa prática)

### Classes e métodos final

- Palavra chave: **final**
- **Classe**: evita que a classe seja herdada
  >public final class SavingsAccount {
- **Método**: evita que o método sob seja sobreposto

  #### Pra quê?
  - Segurança: dependendo das regras do negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que um método não seja sobreposto.

    - Geralmente convém acrescentar **final** em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada pra inconsistências
  - Performance: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução.
  
    - Exemplo clássico: String

# Polimorfismo

### Importante entender:

 - A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).
 - O compilador não sabe para qual tipo específico a chamada do método Withdraw está sendo feita (ele só sabe que são duas variáveis do tipo Account):
 

> Account x = new Account(1020, "Alex", 1000.0);
> 
> Account y = new Account(1023, "Maria", 1000.0, 0.01);
> 
> x.withdraw(50.0);
>
> y.withdraw(50.0);

=======
# Herança

- É um tipo de associação que permite que uma classe herde _todos_ dados e comportamentos de outra
- Definições importantes
- Vantagens
    
    - Reuso
    - Polimorfismo
- Sintaxe

    - class A extends B

> Herança permite o reuso de atributos e métodos (dados e comportamento)

### Definições importantes

- Relação "é-um"
- Generalização/especialização
- Superclasse (classe base) / subclasse (classe derivada)
- Herança / extensão
- Herança é uma associação entre classes (e não objetos)

## Upcasting e downcasting

- Upcasting

  - Casting da subclasse para superclasse
  - Uso comum: polimorfismo
- Downcasting

  - Casting da superclasse para subclasse
  - Palavra instanceof
  - Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)


### Sobreposição, palavra super, anotação @Override

- É a implementação de um método de uma superclasse na subclasse
- É fortemente recomendável usar a
  anotação @Override em um método
  sobrescrito

  - Facilita a leitura e compreensão do código
  - Avisamos ao compilador (boa prática)

### Classes e métodos final

- Palavra chave: **final**
- **Classe**: evita que a classe seja herdada
  >public final class SavingsAccount {
- **Método**: evita que o método sob seja sobreposto

  #### Pra quê?
  - Segurança: dependendo das regras do negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que um método não seja sobreposto.

    - Geralmente convém acrescentar **final** em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada pra inconsistências
  - Performance: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução.
  
    - Exemplo clássico: String

# Polimorfismo

### Importante entender:

 - A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).
 - O compilador não sabe para qual tipo específico a chamada do método Withdraw está sendo feita (ele só sabe que são duas variáveis do tipo Account):
 

> Account x = new Account(1020, "Alex", 1000.0);
> 
> Account y = new Account(1023, "Maria", 1000.0, 0.01);
> 
> x.withdraw(50.0);
>
> y.withdraw(50.0);
