public class Operadores {
    public static void main (String [] argos) {
        // String concatenacao = "?";

        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);

        // System.out.println(concatenacao);

        // int numero = 5;

        // numero ++;
        //numero = numero +2 ; 

        //System.out.println(numero);

        // boolean variavel = true;

        // System.out.println(!variavel);

        String nomeUm = "Fulado";
        String nomeDois = "Fulado";

        System.out.println(nomeUm.equals(nomeDois));

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;
        System.out.println("igual " + simNao);

        simNao = num1 != num2;
        System.out.println("Diferente "+ simNao);


        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2 ){
            System.out.println("as duas são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("uma das condições é vdd");
        }
    }
}