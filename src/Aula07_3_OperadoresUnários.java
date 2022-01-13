/*
* |----|-------------------|------|-------------|
* | ++ |     Incremento    | a ++ |  a = a + 1  |
* |----|-------------------|------|-------------|
* | -- |     Decremento    | a -- |  a = a - 1  |
* |----|-------------------|------|-------------|
*
* A posição do incremento ou decremento vai influenciar diretamente no resultado.
*
* Java utiliza o conceito de pós incremento e pré incremento; pós decremento e pré decremento.
*
* A posição do ++ ou --, isto é, antes ou depois da variável vai influenciar diretamente o resultado do cálculo.
*
*Para atribuições com valores acima de uma unidade, temos os Operadores de Atribuição
*
* |----|------------------------|--------|-----------|
* | += |    Somar e Atribuir    | a += b | a = a + b |
* |----|------------------------|--------|-----------|
* | -= |  Subtrair e Atribuir   | a -= b | a = a - b |
* |----|------------------------|--------|-----------|
* | *= | Multiplicar e Atribuir | a *= b | a = a * b |
* |----|------------------------|--------|-----------|
* | /= |   Dividir e Atribuir   | a /= b | a = a / b |
* |----|------------------------|--------|-----------|
* | %= |    Resto e Atribuir    | a %= b | a = a % b |
* |----|------------------------|--------|-----------|
*
* Segue abaixo os exemplos:
*
*/
public class Aula07_3_OperadoresUnários {
    public static void main(String[] args) {
        int numero = 5;
        numero ++;  //comando equivalente a numero = numero + 1, ou seja, 6
        System.out.println(numero);

        int numer = 5;
        numer --; //comando equivalente a numer = numer - 1, ou seja, 4
        System.out.println(numer);

        int n = 5;
        int valor = 5 + n++; //valor = 10. esse comando com o ++ depois faz com que o valor seja 5 + 5. pois o n ainda é igual a 5
        System.out.println(valor); // depois de fazer 5 + 5 = 10 que é o n vira n + 1, pois o ++ está depois
        System.out.println(numero);

        int nn = 5;
        int valoor = 5 + ++nn; //nesse caso, como o ++ está antes, o nn já é 6 antes de realizar o comando valoor, assim valoor = 11
        System.out.println(valoor); //para --, o pensamento é o mesmo.

        // exemplos de Operadores de Atribuição

        int x = 4;
        x += 4; // x = x + 4
        System.out.println(x);

        int y = 4;
        y *= 4; // y = y * 4
        System.out.println(y);

        int w = 4;
        w /= 4; // w = w / 4
        System.out.println(w);

        int z = 4;
        z %= 3; // z = z % 3
        System.out.println(z);
    }
}

/*
* A classe math permite fazer operações aritméticas.
* permite importar o valor de pi, exponenciação, raiz quadrada, raiz cúbica, transformar angulo de grau pra radiano, etc.
*
* |------|---------------|---------------|--------|
* |  Pi  |  Constante pi |    Math.PI    | 3.1415 |   //Math.PI (pi com letras maiúsculas por ser uma constante)
* |------|---------------|---------------|--------|
* | pow  | Exponenciação | Math.pow(5,2) |   25   |
* |------|---------------|---------------|--------|
* | sqrt | Raiz Quadrada | Math.sqrt(25) |    5   |
* |------|---------------|---------------|--------|
* | cbrt |  Raiz cúbica  | Math.cbrt(27) |    3   |
* |------|---------------|---------------|--------|
*
* Olhar próxima aula.
*/