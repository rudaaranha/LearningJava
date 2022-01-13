/*
* String com letra maiúscula é uma classe e automaticamente vai criar um objeto.
* Instanciar usando a cláusula "new" vai fazer diferença.
* vamos enteder com o exemplo abaixo.
*/

public class Aula08_2_ComparandoStrings {
    public static void main(String[] args) {
        String nome1 = "Rudá";
        String nome2 = "Rudá";
        String nome3 = new String("Rudá");
        String resultado = (nome1==nome2)?"igual":"diferente";   //operação ternária
        String resultado2 = (nome1==nome3)?"igual":"diferente";
        String resultado3 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}

/*
*O nome1, de fato, é igual ao nome2. Porém, eles diferem do nome3.
*Isto ocorre porque ao utilizar a cláusula new, a estrutura do nome3 se torna diferente dos outros dois, embora
*todos recebam o mesmo "nome"
*
* .equals é um objeto que verifica se o conteúdo de um objeto é igual ao de outro.
* Neste exemplo, o resultado vai ser igual. Embora a estrutura seja diferente.*
*/