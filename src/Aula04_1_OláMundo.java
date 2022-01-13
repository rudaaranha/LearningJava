/*
AULA 04 - Primeiro Programa em Java

O funcionamento básico do Java é por meio de um método principal(main) que vai estar dentro de uma classe(public class
PrimeiroPrograma), que faz parte do pacote(package primeiroprograma). Ou seja, vou ter um método(main) que vai estar
dentro de uma classe(class) que vai estar dentro de um pacote de classes(package).
*/

public class Aula04_1_OláMundo {
    public static void main(String[] args) {
        System.out.print("Olá, Mundo!");
    }
}

/*
Técnica do CamelCase:

sempre que a primeira letra estiver em maiúscula, ela vai indicar uma classe ou uma interface. ex:PrimeiroPrograma

Se a primeira letra for minúscula e as outras palavras seguirem a técnica do CamelCase, ela pode ser um atributo,
uma variável ou um método.
ex atributo: nomeAluno
ex variável: mediaPrimeiroBimestre
ex método: lancarNotaAluno

Se as palavras só tiverem letras minúsculas, ela é um pacote. ex: primeiroprograma

E para todas as letras maiúsculas, a palavra vai ser uma constante. ex: VALOR_DE_PI

No código do olá mundo escrito acima, primeiroprograma(pacote), PrimeiroPrograma(clasee), main(método, por causa...)
(...da palavra void), System.out.print()(primeira letra maiúscula, temos uma classe)

Entendendo o comando System.out.print(imprimir no sistema de saída), o comando tem que ser extenso porque o sistema
de saída pode variar, por exemplo, o display do celular e o monitor do computador. Ou seja, vai depender do tipo do
sistema. Já o .print é um método que vai escrever o texto(nesse caso que é uma string) no sistema de saída da máquina.

No momento, o "Olá, Mundo!" do nosso programa está saindo na tela de terminal do eclipse. Porém, tem como exportar
o texto com técnicas diferentes, de forma que ele pode ser executado por uma interface gráfica(arquivo .jar)
e até pode ser feito para sistema android.
*/
