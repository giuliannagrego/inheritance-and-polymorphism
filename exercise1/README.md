# Exercício de fixação

Uma empresa possui funcionários próprios e terceirizados.
Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
Funcionários terceirizados possuem ainda uma despesa adicional.

O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista.
Depois de ler todos os dados, mostrar o nome e o pagamento de cada funcionário na mesma ordem em que foram digitados.

Construa o programa conforme projeto abaixo:

class: **[Employee]**

- name: _[String]_
- hours: _[Integer]_
- valuePerHour: _[Double]_


class: **[OutsourcedEmployee]**

- additionalCharge: _[Double]_


Exemplo:

- Enter the number of employees: [3]
- Employee #1 data:
- Outsourced (y/n)? [n]
- Name: [Alex]
- Hours: [50]
- Value per hour: [20.0]
- Employee #2 data:
- Outsourced (y/n)? [y]
- Name: [Bob]
- Hours: [100]
- Value per hour: [15.0]
- Additional charge: [200.0]
- Employee #1 data:
- Outsourced (y/n)? [n]
- Name: [Maria]
- Hours: [60]
- Value per hour: [20.0]

PAYMENTS:
Alex - $1000.00
Bob - $1720.00
Maria - $1200.00
