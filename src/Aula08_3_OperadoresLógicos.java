/*
* |----|-------|---------------|-------|
* | && |  .E.  | true && false | false | //
* |----|-------|---------------|-------|
* | || |  .OU. | false || true |  true |
* |----|-------|---------------|-------|
* |  ^ | .XOU. |   true ^ true | false |
* |----|-------|---------------|-------|
* |  ! | .NAO. |    ! false    |  true |
* |----|-------|---------------|-------|
*
* O operador "&&" vai testar uma cláusula do tipo ".E.", por exemplo, "verdadeiro e falso" vai retornar "falso".
*
* O operador "||" vai testar uma cláusula do tipo ".OU.", por exemplo, "falso ou verdadeiro" que vai retornar "verdadeiro".
*
* O operador "^" vai testar uma cláusula do tipo ".XOU." ou "ou exclusivo", por exemplo, "verdadeiro ou exclusivamente verdadeiro" que vai retornar "falso".
*
* O operador "!" vai testar uma cláusula do tipo ".NAO.", por exemplo, "nao falso" que vai retornar verdadeiro.
*
* O modo de entender o funcionamento destes operadores é através da tabela verdade deles, mostrado abaixo.
*
* A tabela verdade é composta de duas premissas,  "p" e "q".
*
*| p | q | p&&q | p||q | p^q |           | p | !p |
*|---|---|------|------|-----|           |---|----|
*| V | V |   V  |   V  |  F  |           | V |  F |
*| V | F |   F  |   V  |  V  |           | F |  V |
*| F | V |   F  |   V  |  V  |
*| F | F |   F  |   F  |  F  |
*
* O .E. funciona onde "p" e "q" precisam ser verdadeiros para que o resultado seja verdadeiro.
*
* O .OU. funciona onde "p" ou "q" ou "p e q" sejam verdadeiros para que o resultado seja verdadeiro.
*
* O .XOU. ou "ou" exclusivo funciona com a premissa que só o "p" pode ser verdadeiro ou exclusivamente o "q" pode
* ser verdadeiro para que o resultado seja verdadeiro.
*
*Já para .NAO. só precisa do "p" e vai ser invertido. se "p" for verdadeiro, o resultado vai ser falso, mas se
* "p" for falso, o resultado vai ser verdadeiro.
*
* Vamos para o exemplo:
*/

public class Aula08_3_OperadoresLógicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r, r1, r2, r3, r4;  //variável lógica(boolean) para resultado(r, r1... rn)
        r = (x<y && y<z)?true:false; //vai retornar verdadeiro
        r1 = (x<y && y==z)?true:false; //vai retornar falso
        r2 = (x<y || y==z)?true:false;  //vai retornar verdadeiro
        r3 = (x<y ^ y==z)?true:false; // vai retornar verdadeiro
        r4 = (x<y ^ y<z)?true:false; // vai retornar falso
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
