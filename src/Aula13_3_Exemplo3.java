//exercício - fazer de 1 até 100 pulando de 10 em 10

public class Aula13_3_Exemplo3 {
    public static void main(String[] args) {
        for (int c=1; c<=100; c+=10) {
            System.out.println(c);
        }
    }
}

/*
 * Laços Aninhados
 *
 * Quando se tem um laço dentro do outro, o retorno vai ser para o laço de dentro e não para o laço de fora.
 *
 * O loop vai continuar no laço interno até ele ser concluído, antes de retornar para o laço externo.
 *
 * Após isso o laço interno volta para o valor inicial e vai até o fim dele, antes de ir para o próximo passo do
 * laço externo.
 *
 */