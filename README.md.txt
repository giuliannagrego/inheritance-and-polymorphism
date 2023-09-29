# Herança e polimorfismo

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