public class MinhaClasse {
    public static void main (String []args ){ 
        String primeiroNome = "Jhon";
        String segundoNome  = "Armando";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeoNome, String segundoNome){
        return "Resultado do método " + primeoNome.concat(" ").concat(segundoNome);
    }
}