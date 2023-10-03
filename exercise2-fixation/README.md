# Exercício de fixação

Fazer um programa para:

- Ler os dados de N produtos (N fornedido pelo usuário);
- No final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados;
- Todo produto tenha nome e preço;
- Produtos importados possuem taxa de alfândega;
- Produtos usados possuem data de fabricação;
- Os dados especificados deverem ser acrescentados na etiqueta de preço conforme o exemplo;
- Para produtos importados, a taxa e a alfândega deve ser acrescentada ao preço final do produto;

### Exemplo:

> ### Product
> - name: String
> - price: Double
> 
>> ### ImportedProduct
>>
>> - customsFee: Double
>> ---------------------
>> - priceTag(): String
>> - totalPrice(): Double
>
>> ### UsedProduct
>>
>> - manufactureDate: Date
>> ---------------------
>> - priceTag(): String

- Enter the number of products: [3]
- Product #1 data:
- Common, used or imported (c/u/i)? [i]
- Name: [Tablet]
- Price: [260.00]
- Customs fee: [20.00]
- Product #2 data:
- Common, used or imported (c/u/i)? [c]
- Name: [Notebook]
- Price: [1100.00]
- Product #3 data:
- Common, used or imported (c/u/i)? [u]
- Name: [Iphone]
- Price: [400.00]
- Manufacture date (DD/MM/YYYY): [15/03/2017]
- PRICE TAGS:
- Tablet $ 280.00 (Customs fee: $ 20.00)
- Notebook $ 1100.00
- Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)