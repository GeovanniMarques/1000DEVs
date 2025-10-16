# 1000DEVs - Lógica de programação

> Este repositório contém os ensinamentos e exercícios referente a lógica de programação e crição de algoritmos utilizando Java.

## Tópicos abordados
- Java I/O;
- Variáveis;
- Tipos de dados;
- Operadores aritméticos;
- Operadores lógicos;
- Concatenação e formatação de saída de dados;
- Estruturas condicionais (If-else);
- Estruturas de repetição ();
- Try-catch-finally;

## Exercícios
1. Faça um algoritmo que receba como entrada duas notas, calcule e exiba a média final.

2. Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo. Para isto será necessário o usuário informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro quadrado.

3. Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.

4. Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras. O usuário devera informar a quantidade de cavalos adquiridos.

5. Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. Após o aumento, desconte 11% de INSS e 8% de FGTS. Imprima o salário inicial, o salário com o aumento, o salário final, o desconto do INSS, o desconto do FGTS e o Total de Descontos (INSS+FGTS).

6. A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos que deverá ser informado pelo usuário.

7. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 120 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.

8. Escreva um algoritmo que leia 4 notas de um aluno de 0 a 10. Leia a quantidade de aulas que foram ministradas e a quantidade de aulas que o aluno faltou. Calcule uma media simples entre as 4 notas e também o percentual de faltas do aluno. Ao termino informe o aluno foi:
    - Reprovado por falta. PercentualFaltas >= 25;
    - Aprovado. MediaNotas notas >= 6;
    - Recuperação. MediaNotas >= 3 e < 6;
    - Reprovado por Nota. MediaNotas < 3;

<!-- 9. Você deve desenvolver um pequeno programa em Java que ajude estudantes a calcular a média de duas notas de uma disciplina. O programa deve:
    - Solicitar ao usuário que digite duas notas (valores decimais) de 0 a 10.
    - Realizar o cálculo da média aritmética dessas notas.
    - Exibir a média calculada com duas casas decimais.
    - Utilizar try-catch para garantir que:
        - O usuário digitou valores numéricos válidos.
        - Não ocorrerão erros de execução caso ele digite algo inválido (por exemplo, letras em vez de números).

    Regras adicionais:
    - Caso o usuário insira um valor inválido (como texto não numérico), exiba uma mensagem amigável informando o erro e peça que ele execute o programa novamente.
    - Não é necessário validar se a nota está entre 0 e 10 neste exercício (apenas o tipo do dado)
-->

9. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
    - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    - A mensagem "Reprovado", se a média for menor do que sete;
    - A mensagem "Aprovado com Distinção", se a média for igual a dez.

10. Um posto está vendendo combustíveis com a seguinte tabela de descontos:

    Álcool:
    - até 20 litros, desconto de 3% por litro
    - acima de 20 litros, desconto de 5% por litro

    Gasolina:
    - até 20 litros, desconto de 4% por litro
    - acima de 20 litros, desconto de 6% por litro

    Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível como um número inteiro (codificado da seguinte forma: 1 - álcool, 2 - gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$ 3,90.

11. Uma loja de venda de frutas está vendendo frutas com a seguinte tabela de preços:

    - Até 5 Kg: Morango R$ 2,50 por Kg e Maçã R$ 1,80 por Kg
    - Acima de 5 Kg: Morango R$ 2,20 por Kg e Maçã R$ 1,50 por Kg

    Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

12. Um empresa resolveu dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calcularáos reajustes. Faça um programa que recebe o salário de um colaborador e faça o reajuste segundo o seguinte critério, baseado no salário atual:

    - salários até R$ 280,00 (incluindo) : aumento de 20%
    - salários entre R$ 280,00 e R$ 700,00: aumento de 15%
    - salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
    - salários de R$ 1500,00 em diante: aumento de 5%

    Após o aumento ser realizado, informe na tela:
    - o salário antes do reajuste;
    - o percentual de aumento aplicado;
    - o valor do aumento;
    - o novo salário, após o aumento.

13. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

    Desconto do IR:
    - Salário Bruto até 900 (inclusive) - isento
    - Salário Bruto até 1500 (inclusive) - desconto de 5%
    - Salário Bruto até 2500 (inclusive) - desconto de 10%
    - Salário Bruto acima de 2500 - desconto de 20%

    Imprima na tela as informações, dispostas conforme o exemplo abaixo.

    QTDE de Horas Trabalhadas: 5
    Valor da hora trabalhada R$: 220.00

    Salário Bruto: (5 * 220)        : R$ 1.100,00

    (-) IR (5%)                     : R$       55,00 

    (-) INSS ( 10%)                 : R$     110,00

    (-) Sindicato (3%)              : R$        33,00

    FGTS (11%)                      : R$     121,00

    Total de descontos              : R$     198,00

    Salário Liquido                 : R$     902,00

## Resolução dos exercícios
> ⚠️ Para visualizar o código fonte dos exercícios, basta clicar no título referente ao desejado verificar ou navegar até a superior deste repositório.

### 1. [Calculadora de média de notas;](src/MediaAluno.java)
```terminal
¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ CALCULADORA DE MÉDIA ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬

Por gentileza, informe a 1ª nota: 8,9
Por gentileza, informe a 2ª nota: 6,7

A média final do aluno foi: 7,80
```

### 2. [Calculadora de valor e área total de terreno;](src/MediaAluno.java)
```terminal
¬¬¬¬¬¬¬¬¬¬ CALCULE QUANTO VALE O SEU TERRENO ¬¬¬¬¬¬¬¬¬¬

Informe em metros o tamanho frontal do terreno: 6
Informe em metros o tamanho lateral do terreno: 11
Informe o valor do metro quadrado na região do terreno: R$5.797,25

Área total do terreno: 66,0m²
Valor total do terreno: R$382618,50
```

### 3. [Calculadora de quantidade de salários recebidos;](src/QuantidadeSalarios.java)
```terminal
¬¬¬¬¬¬¬¬¬¬ QUANTIDADE DE SALÁRIOS RECEBIDOS ¬¬¬¬¬¬¬¬¬¬

Informe o valor atual do salário mínimo: R$1.518,00
Informe o valor atual do salário do funcionário: R$5.817,63

O funcionário recebe 3,8 salários mínimos
```

### 4. [Calculadora de quantidade e valor de ferraduras para cavalos;](src/Ferraduras.class)
```terminal
¬¬¬¬¬¬¬¬¬¬ CALCULADORA DE FERRADURAS PARA CAVALOS ¬¬¬¬¬¬¬¬¬¬

Informe a quantidade de cavalos a serem equipados: 154
Informe o valor de custo de cada ferradura: R$2,89

Quantidade de ferraduras necessárias para equipar os 154 cavalos: 616
Valor total de custo das ferraduras: R$1780,24
```

### 5. [Calculadora de novo salário e descontos de funcionário](src/ContraCheque.java)
```terminal
¬¬¬¬¬¬¬¬¬¬ CALCULADORA DE SALÁRIO ¬¬¬¬¬¬¬¬¬¬

Informe o salário atual do funcionário: R$2817,98

Salário inicial: R$2817,98
Salário reajustado: R$3240,68
Desconto do INSS (11%): R$356,47
Desconto do FGTS (8%): R$259,25
Total de descontos: R$615,73

Salário final: R$2624,95
```

### 6. [Custo de controle para identificação de frangos em granja;](src/ControleGranja.java)
```terminal
¬¬¬¬¬¬¬¬¬¬ CUSTO DE IDENTIFICAÇÃO - GRANJA ¬¬¬¬¬¬¬¬¬¬

Por gentileza, informe a quantidade de frango que há na granja FrangoTech: 149

Custo total para identificação dos frangos: R$1639,00
```

### 7. [Dimensionamento de ingredientes - Hamburgueria](src/Lanchonete.java)
```terminal
¬¬¬¬¬¬¬¬¬¬ DIMENSIONAMENTO DE INGREDIENTES - HAMBURGUERIA ¬¬¬¬¬¬¬¬¬¬

Por gentileza, informe a quantidade sanduiches a serem feitos: 126

Para produzir 126 sanduiches serão necessários:
12,600kg de mussarela
6,300kg de presunto
15,120kg de hamburguer
```

### 8. [Verificação de status de aluno (aprovação, recuperação ou reprovação)](src/CondicionalMediaNotas.javaotas)
```terminal
¬¬¬¬¬¬¬¬¬¬ DIÁRIO DE MATÉRIAS ¬¬¬¬¬¬¬¬¬¬

Por gentileza, abaixo informe as notas referentes as provas do aluno, entre 0 e 10,
a quantidade de aulas ministradas e as faltas do aluno.

Informe a 1ª nota do aluno: 10
Informe a 2ª nota do aluno: 9,6
Informe a 3ª nota do aluno: 8,2
Informe a 4ª nota do aluno: 7,75
Informe a quantidade de aulas ministradas: 45
Informe a quantidade faltas do aluno: 9

Média final: 8,9 - Aluno aprovado.
```

<!-- ### 9.  -->

### 9. [Estrutura de condicional - Aprovação de aluno](src/CondicionalAprovacao.java)
```terminal
Informe a 1ª nota do aluno: 10
Informe a 2ª nota do aluno: 10

Média: 10,0 - Aluno aprovado com distinção
```

### 10. [Estrutura de condicional - Abastecimento de veículo](src/CondicionalAbastecimento.java)
```terminal
Informe a quantidade de litros abastecida: 38,7
Informe o combustível utilizado no abastecimento:
[1] - Álcool | [2] - Gasolina: 2

Valor total: R$200,08
```

### 11. [Estrutural de condicional - Compras em hortifrúti](src/CondicionalHortiFruti.java)
```terminal
Informe o peso total comprado de morangos: 4
Informe o peso total comprado de maça: 6

Valor total a ser pago: R$17,10
```

### 12. [Estrtura de condicional - Reajuste salarial de funcionário](src/CondicionalReajuste.java)
```termimal
Informe o salário do funcionário: R$1518

Salário atual: R$1518,00
Percentual de aumento aplicado: 0,05%
Valor de aumento: R$75,90
Salário reajustado: R$1593,90
```

### 13. [Cálculo de descontos e geração de contracheque](src/CondicionalDesconto.java)
```terminal
Por gentileza, informe a quantidade de horas trabalhadas neste mês: 144
Agora, informe o valor de cada hora trabalhada: 15,18

Quantidade de horas trabalhadas: 144,00
Valor da hora trabalhada: R$15,18

+-------------------------------------+-------------------------+
| Informações                         |                 Valores |
+-------------------------------------+-------------------------+
| Salário bruto (144.0 * 15.18)       : R$              2185,92 |
| (-) IR (10.0%)                      : R$               218,59 |
| (-) INSS (9.0%)                     : R$               196,73 |
| (-) Sindicato (3.0%)                : R$                65,58 |
| FGTS (11%)                          : R$               240,45 |
| Total de descontos                  : R$               480,90 |
+-------------------------------------+-------------------------+
| Salário líquido                     : R$              1705,02 |
+-------------------------------------+-------------------------+
```