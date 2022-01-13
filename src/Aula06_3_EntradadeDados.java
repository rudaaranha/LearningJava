import java.util.Scanner;

/*
 * Entrada de dados
 * A entrada de dados ocorre quando todo dado que está fora é colocado para dentro do computador, normalmente utilizando teclado.
 *
 * O Java já vem com os comandos de saída de dados, mas não tem nenhum comando de entrada de dados.
 * Para realizar a entrada de dados, será utilizado o java.util.Scanner... sendo necessário importar essa classe.
 *
 * Uma vez importado o java.util.Scanner, é preciso ativar essa classe. e o modo de fazer isso é através da criação de um objeto:
 *
 * Scanner teclado = new Scanner(System.in);   //teclado é um objeto. o que está entre parênteses (System.in) é o que vai ser scanneado, o que
 * vai estar sendo monitorado.
 *
 * Se so System.out é a saída de um dispositivo, o System.in é a entrada dele.
 *
 * Usar a ferramenta Scanner permite inserir dados ao código semelhante ao imput do Pyhton. Porém, tem de adicionar um System.out.print para
 * dar um pouco de interatividade, ou seja, adicionar o "Digite o nome do aluno". no python, tudo é feito na mesma linha
 * em pyhton fica - nome = string(input("Digite o nome do aluno: "))
 */

public class Aula06_3_EntradadeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //desta forma eu transformo o objeto teclado em um dado de entrada. semelhante ao imput do python
        System.out.println("Digite o nome do aluno: "); //linha para gerar um pouco de interatividade no código
        String nome = teclado.nextLine(); //nextLine é usado para Strings, nesse caso para ler o nome do aluno
        System.out.println("Digite a nota do aluno: "); //linha para gerar um pouco de interatividade no código
        float nota = teclado.nextFloat(); //nextFloat é usado para ler um número real, nesse caso para ler a nota do aluno
        System.out.println("Qual é a idade do aluno: "); //linha para gerar um pouco de interatividade no código
        int idade = teclado.nextInt(); //nextInt é usado para ler um número inteiro, nesse caso a idade do aluno
        System.out.printf("%s, que tem %d anos, tirou nota %.2f. \n", nome, idade, nota); //print formatado
    }
}
