public class TiposPrimitivosReferenciaDemo {
    public static void main(String[] args) {  //psvm cria automático
        int numeroInteiro = 50;           //convenção ser letra minuscula e a segunda palavra com a 1ª letra maiuscul

        String nome =  new String("Atticus");
        String sobrenome = "Finch"; //equivalente a anterior

        System.out.println(nome.toUpperCase());

        //System.out.println("O número é:" + numeroInteiro);

        //Integer numeroInteiroReferencia = new Integer(50); não funciona mais
        //Integer numeroInteiroReferencia = Integer.valueOf(50);

        //System.out.println(numeroInteiroReferencia);
    }
}
