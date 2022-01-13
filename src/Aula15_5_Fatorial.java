//Criando a função fatorial
public class Aula15_5_Fatorial {

    //Declarando as variáveis necessárias para a função
    static private int num = 0;
    static private int fat = 1;
    static private String formula = "";

    //Criando o método(procedimento) que vai executar o cálculo do fatorial, chamado de setValor
    public static void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " X ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }

    //Método para retornar o resultado do fatorial
    public static int getFatorial() {
        return fat;
    }

    //Método para retornar a fórmula do fatorial
    public static String getFormula() {
        return formula;
    }


    //Colocando para rodar...
    public static void main(String[] args) {

        //Criando um objeto f, que é um novo objeto. f possui os métodos da classe fatorial. f possui setValor, getFatorial e getFormula
        Aula15_5_Fatorial f = new Aula15_5_Fatorial();

        //calculando o fatorial de 5
        f.setValor(5);

        //Mostrando os resultados do fatorial
        System.out.println(f.getFormula() + f.getFatorial());
        System.out.printf("O resultado do fatorial de 5 é %d", f.getFatorial());
    }
}



