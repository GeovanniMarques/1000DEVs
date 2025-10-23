# Desafio: Algoritmo para validação de CPF

<!-- Explicação sobre desafio -->

## O que é o CPF?

<details open>
    <summary><strong>🚨👉🏼 Clique aqui para visualizar conteúdo completo</strong><br><br></summary>
    
O CPF (Cadastro de Pessoas Físicas) é composto por 11 dígitos. Em determinados sistemas é necessário identificar se um CPF informado não foi digitado incorretamente. Para isto, o CPF possui um conjunto de dois dígitos conhecidos como digito verificador. Estes dois dígitos podem ser calculados através de um algoritmo para identificar erros de digitação.

> Exemplo: **123.456.789-09**

- Os **9 primeiros dígitos (123456789)** são o **número base**.
- Os **2 últimos dígitos (09)** são  **verificadores**. Eles servem para verificar se os 9 primeiros números foram digitados corretamente.

### Objetivo da validação

Verificar se os 2 últimos dígitos (verificadores) estão corretos com base nos 9 primeiros.

### Como calcular os dígitos verificadores?

Vamos dividir isso em 2 etapas, uma para cada dígito verificador.
</details>

## ✅ Etapa 1: Calcular o primeiro dígito verificador

<details>
    <summary><strong>🚨👉🏼 Clique aqui para visualizar conteúdo completo</strong></summary>

### 📝 Passo a passo:

1. Pegue os 9 primeiros dígitos do CPF.
    - Exemplo: 123456789
2. Multiplique cada dígito por um peso que vai de 10 a 2: (10, 9, 8, 7, 6, 5, 4, 3, 2) (do primeiro ao último).
    - (1 * 10) + (2 * 9) + (3 * 8) + (4 * 7) + (5 * 6) + (6 * 5) + (7 * 4) + (8 * 3) + (9 * 2)
3. Some os resultados
    - Soma = 1 * 10 + 2 * 9 + 3 * 8 + ... + 9 * 2 = 210
4. Pegue o resultado da soma e faça uma divisão inteira por 11 e pegue o resto
    - 210 % 11: resto 1
5. Agora, aplique a regra:
    - Se o resto for menor que 2, o dígito verificador é 0
    - Se for 2 ou mais, o dígito verificador é o resultado de (11 - resto)

Neste caso, o resto foi `1` e *1 é < 2*:

✅ **Resultado: o primeiro dígito verificador é 0**

</details>


## ✅ Etapa 2: Calcular o segundo dígito verificador

<details>
    <summary><strong>🚨👉🏼 Clique aqui para visualizar conteúdo completo</strong><br><br></summary>

Agora usamos os **9 dígitos originais + o primeiro dígito verificador** (agora são 10 dígitos):

> Exemplo: **123456789***0* (Os 9 primeiros números os digitos do próprio CPF e o 0, último número, é o resultado do primeiro dígito verficador)

1. Multiplique cada dígito por um peso que vai de 11 a 2 (11, 10, 9, 8, 7, 6, 5, 4, 3, 2)
    - (1 * 11) + (2 * 10) + (3 * 9) + (4 * 8) + (5 * 7) + (6 * 6) + (7 * 5) + (8 * 4) + (9 * 3) + (0 * 2)
2. Some os resultados
    - Soma = 255
3. Divida por 11 e veja o resto
    - 255 % 11 = Resto 2
4. Aplique a mesma regra:
    - Se o resto < 2 → dígito = 0
    - Se resto ≥ 2 → dígito = (11 - resto) = 9

✅ **Resultado: o segundo dígito verificador é 9**

</details>

## Resultado Final

Se o CPF for **12345678909**, acabamos de ver que os dois dígitos verificadores (0 e 9) batem com os calculados!

✅ **Isso significa que esse CPF é válido!**

## Validações extras

Antes de fazer os cálculos, é importante também verificar:

- Se o CPF tem 11 dígitos (sem pontos ou traços).
- Se não é uma sequência repetida como **000.000.000-00**, **111.111.111-11**, **222.222.222-22**, ... **999.999.999-99**, que são **inválidas**.

## ✅ Resumo da lógica:

<details>
    <summary><strong>🚨👉🏼 Clique aqui para visualizar conteúdo completo</strong><br><br></summary>

- Multiplicar os dígitos por pesos decrescentes;
- Somar os resultados;
- Dividir por 11 e pega o resto;
- Comparar com os dígitos verificadores;

A seguir temos um trecho de código de exemplo de como obter cada um dos dígitos do CPF para a realização do cálculo. Utilizando como exemplo o código abaixo, desenvolva o seu algoritmo completo de validação de CPF e submeta o arquivo Main.java compactado em zip no final desta página até o dia 23/10/2025.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cpf;

        int d1, d2, d3, d4, d5, d6, d7, d8, d9;

        int parte1, parte2;
        int restoDivisao1, restoDivisao2;

        System.out.println("Digite o seu CPF: ");
        cpf = teclado.nextLine();
    

        // charat devolve o codigo ascii (decimal) do digito conforme a tabela
        // como os digitos iniciam na posicao decimal 48 (0 = 48), (1 = 49)
        d1 = cpf.charAt(0) - 48; //primeiro digito
        d2 = cpf.charAt(1) - 48; //segundo digito
        d3 = cpf.charAt(2) - 48; //terceiro digito

        parte1 = (d1 * 10) + (d2 * 9) + (d3 * 8);

        restoDivisao1 = parte1 % 11;

        teclado.close();
    }
}
```
</details>

## Autor

## Licença
