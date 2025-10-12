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

9. Você deve desenvolver um pequeno programa em Java que ajude estudantes a calcular a média de duas notas de uma disciplina. O programa deve:
    - Solicitar ao usuário que digite duas notas (valores decimais) de 0 a 10.
    - Realizar o cálculo da média aritmética dessas notas.
    - Exibir a média calculada com duas casas decimais.
    - Utilizar try-catch para garantir que:
        - O usuário digitou valores numéricos válidos.
        - Não ocorrerão erros de execução caso ele digite algo inválido (por exemplo, letras em vez de números).

    Regras adicionais:
    - Caso o usuário insira um valor inválido (como texto não numérico), exiba uma mensagem amigável informando o erro e peça que ele execute o programa novamente.
    - Não é necessário validar se a nota está entre 0 e 10 neste exercício (apenas o tipo do dado)

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