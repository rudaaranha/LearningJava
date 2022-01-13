/*
 * Aqui serão feitos os testes dos tipos primitivos aprendendo saída de dados em java
 * A saída de dado é quando um dado que está na memória do computador é mostrado de alguma forma para quem está vendo o programa.
 * Vejamos um exemplo:
 *
 * float nota = 8.5f;   //variável real
 *
 * System.out.print("Sua nota é" + nota); //o + pode ser soma ou concatenação (nesse caso é concatenado)
 *
 * System.ou.println("Sua nota é"+ nota); //o ln modifica apenas o salto de linha
 */

public class Aula06_2_SaídadeDados {
    public static void main(String[] args) {
        String nome = "Rudá"; //variável literal, dessa vez uma classe do tipo string. posso adicionar quantas letras eu quiser
        float nota = 8.5f;    //float de forma direta tem que adicionar o f no final
        System.out.println("Sua nota é " + nota); //o println vai fazer com que qualquer outro código que se segue apareça em baixo.
        System.out.println("Sua nota é " + nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota); // print f é uma impressão formatada. Ao colocar o %f significa formatação do float
        System.out.format("A nota de %s é %.2f \n", nome, nota); //Outra forma de fazer o print formatado.
    }
}

/*
 * O print f é uma impressão formatada. Ao colocar o %f significa formatação do float, enquanto o %s é uma formatação do string
 * .2 é o número de casas decimais da formatação. no printf não precisamos do concatenado. o \n faz com que a próxima impressão apareça
 * na linha abaixo.
 *
 * Existe outra forma de utilizar o print formatado diferente do printf que é o System.out.format(); veja abaixo
 */
