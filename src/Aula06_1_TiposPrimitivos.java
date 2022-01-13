//Para fazer comentário de uma linha, usar "//"

//Outra forma de comentar é usar /* no inicio e */ no fim. Esse método é usado para comentários mais longos.

//Ao utilizar o método /* */ alguns programadores colocam "*" em cada linha para deixar organizado.

//Também existe os comentários para documentação, onde se usa /** no inicio e */ no fim. por exemplo
/**
 * Exemplo para o CursoemVídeo de Java
 * @author Rudá Aranha
 * @version 1.0
 * @since 2021-01-01
 */

/* revisão de algoritmos.
 * A declaração de tipos e inicialização de variáveis. existindo a área de variáveis e a área de corpo do programa:
 * Cada tipo primitivo (inteiro, real, caractere e logico) viram familia em java
 *
 * variáveis: idade : inteiro   (poderiamos declarar a variável idade do tipo inteiro)
 * 	salario : real              (números reais são aqueles que têm ponto flutuante ou vírgula
 *  letra : caractere           (outro tipo de variável é do tipo caractere. letra é do tipo caractere
 *  casado : logico             (o último tipo de variável é do tipo logico. quero saber se uma pessoa é casada ou não)
 *
 * corpo: idade <- 3   (mais tarde no programa poderiamos atribuir a unidade, por exemplo: idade recebe 3)
 * salario <- 1825.54  (salário recebe 1825.54 - para Java deve-se usar ponto(.))
 * letra <- 'G'        (letra recebe 'G'. caractere em algoritmos ficam entre aspas duplas "G", mas no java são aspas simples 'G')
 * casado <- falso	   (A pessoa não é casada)
 */


/*
 * Como declarar as váriaveis em java:
 * -------------------------------------------------------------------------------------
 * inteiro: int idade = 3; (primeira forma de declarar)
 *
 * Java é uma linguagem fortemente tipada, ou seja, o tipo é muito importante e para transitar entre os tipos, na maioria das vezes, conversões ou
 * especificações são necessárias. posso dizer que esse valor 3 é inteiro ou real (3.0). 3 é real e inteiro ao mesmo tempo.
 *
 * Para o segundo modo existe uma técnica para declarar valores especificos (typecast):
 * int idade = (int) 3;  (segunda forma)
 * o tipo entre parenteses antes do 3 quer dizer para considerar o 3 como inteiro.
 *
 * A terceira maneira é utilizado classes (lembrando que toda classe começa com a letra maiúscula):
 * Integer idade = new Integer(3);         Nessa terceira forma, a variável idade é um objeto.
 *
 * Sempre que o "new" é usado dentro de uma declaração, siginifica que esse new automáticamente está criando um objeto, necessitando de uma classe
 * referenciando ele. Nesse caso: Integer. Integer é uma classe. e o 3 vai ser considerado um valor inteiro e colocado dentro do objeto idade.
 * O nome que se dá a essa classe é Wrapper Class.
 * ------------------------------------------------------------------------------------
 *
 * Para o segundo tipo de variável (real). real é ponto flutuante, para java ele seria float, assim:
 * float salario = 1825.54f; (primeira forma) O "f" no final quer dizer que o número é float.
 * Nesse tipo de declaração se o "f" não for colocado, o java vai dar erro.
 *
 *float salario = (float) 1825.54; (segundo modo, typecast) não precisa do "f"
 *
 *Float salario = new float (1825.54); (terceiro modo, Wrapper Classe)
 *-------------------------------------------------------------------------------------
 *para o terceiro tipo de variável (caractere), temos:
 *
 *char letra = 'G';  o tipo char só permite armazenar umas letra. para adicionar mais de uma letra existe uma classe
 *
 *char letra = (char) 'G'; typecast
 *
 *Character letra = new Character('G'); Wrapper Class
 *-------------------------------------------------------------------------------------
 *Para o quarto tipo de variáve (Logico), temos:
 *
 *boolean casado = false;
 *
 *boolean casado = (boolean) false;  typecast
 *
 *Boolean casado = new Boolean(false); Wrapper Class
 *-------------------------------------------------------------------------------------
 *Agora que sabemos todas as famílias de variáveis, vamos mostrar uma tabela com todos os tipos possíveis e suas explicações:
 *
 *|---------|----------------|------------------|----------|---------|
 *| Família | Tipo primitivo | Classe Invólucro |  Tamanho | Exemplo |
 *|---------|----------------|------------------|----------|---------|
 *|  Lógico |     boolean    |      Boolean     |   1 bit  |   true  |
 *|---------|----------------|------------------|----------|---------|
 *|Literais |      char      |     Character    |  1 byte  |    'A'  |
 *|         |       -        |      String      |1byte/cada|  "JAVA" |
 *|---------|----------------|------------------|----------|---------|
 *|         |      byte      |        Byte      |  1 byte  |   127   |
 *| Inteiros|      short     |       Short      |  2 bytes |  32767  |
 *|         |      int       |      Integer     |  4 bytes | 2147483 |
 *|         |      long      |        Long      |  8 bytes |   2^63  |
 *|---------|----------------|------------------|----------|---------|
 *|  Reais  |     float      |       Float      |  4 bytes | 3.4e+38 |
 *|         |     double	 |      Double      |  8 bytes |1.8e+308 |
 *|---------|----------------|------------------|----------|---------|
 *
 * Tirando os que já vimos antes, temos o string como fazendo parte da família dos literais que não possui tipo primitivo, apenas Classe invólucro
 * Mas com o string podemos guardar mais de uma letra (sendo essa a limitação do char) e vão ocupar 1byte para cada letra.
 *
 * Na família dos inteiros, além do int temos o byte que não aceitam números grandes (maior número inteiro guardado é 127).
 * para números um pouco maiores, temos o short que aceitam valores até 32767. O tipo int nós já conhecemos, mas é importante citar que eles
 * aceitam valores até 2147483. Por fim temos o long que aceitam números inteiros até 2^63.
 *
 * Como o java foi feito pra roda em divesas plataformas, algumas delas possuem pouca memória, o que se torna interessante economizar espaço.
 * Desta forma está explicado os diversos tipos de variáveis e o motivo de estar especificado o tamanho dos arquivos das variáveis.
 *
 * O float e o double aceitam valores de 3.4e+38 e 1.8e+308, respectivamente.
 *
 *----------------------------------------------------------------------------------
 *
 */
public class Aula06_1_TiposPrimitivos {
}
