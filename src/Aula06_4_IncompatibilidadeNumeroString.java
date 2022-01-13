/*
 * Incompatibilidades entre números e strings
 * A linguagem java é fortemente tipada e em algumas vezes, os tipos brigam entre eles. Existe incompatibilidade entre valores numéricos e strings
 * Por exemplo, a se fazer:
 *
 * int idade = 30;
 * String valor = idade;
 *
 * Um erro vai aparecer afirmando que os valores são incompatíveis. int não pode ser convertido para string diretamente.
 *
 * por typecast também não funciona: String valor = (String) idade;
 *
 * A maneira certa de converter int em string é atraves da utilização da classe invólucro "Integer" com o método "toString()"
 * String valor = Integer.toString(idade);
 *
 * vamos fazer isso no código.
 */

public class Aula06_4_IncompatibilidadeNumeroString {
    public static void main(String[] args) {
        int idade = 31;
        String valor = Integer.toString(idade); //Classe invólucro(Integer) e o método toString.
        System.out.println(valor);
    }
}

/*
 * Para fazer o contrário, ou seja, transformar um string em int, o método também é através de classe invólucro e semelhante à mostrada acima.
 *
 * String valor = "31";
 * int idade = Integer.parseInt(valor);  //parseInte é o método para transformar string em int.
 * System.out.print(idade);
 *
 *
 * Se a conversão fosse de string para float, o método também é semelhante:
 *
 * String valor = "30.5";
 * float idade = Float.parseFloat(valor);  //Float é a classe e parseFloat é o método de conversão de string para float
 * System.out.print(idade);
 */