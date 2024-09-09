package academy.devdojo.maratonajava;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
// TIPOS PRIMITIVOS: int, double,float,char,byte,shart,long,boolean

        int idade = 18; // Numeros inteiros
        System.out.println("A idade é" + idade);

        double salarioDouble = 12500; //decimal
        System.out.println("Salario pleno" + salarioDouble);

        float salarioFloat = 12500; //decimal
        System.out.println("Salario pleno" + salarioFloat);

        short idadeShort = 18; // 2 bytes ->  -32.768 a 32.767
        System.out.println("A idade é :" + idadeShort);

        byte idadeByte = 18; // 1 byte -> -128 ate 127
        System.out.println("Salario pleno" + idadeByte);

        long visualizacoes = 1; //Numeros longos -9.223.372... ou 9.223.372...
        System.out.println("quantidade de vizualizações:" + visualizacoes);

        boolean verdadeiro = true;
        System.out.println(verdadeiro);

        boolean falso = false;
        System.out.println(falso);

        char caractereCurto = 'A' ; // letra -> 2 bytes criado para a tabela ascii ou unicode , onde numeros são letras
        char tabelaAscii = 65 ; // Ex.: 65 = A na tabela ascii
        char tabelaUnicode = '\u0041' ;
        System.out.println("Letra:" + caractereCurto);
        System.out.println("Acii:" + tabelaAscii);
        System.out.println("Unicode:" + tabelaAscii);

    }
}
