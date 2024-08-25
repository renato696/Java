public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: TopGun: Maverick");

        int anoDeLancamento;
        anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        //comentário de uma linha - calcular média
        double media = (9.8 + 6.3 + 8)/3;
        System.out.println(media);

        String sinopse;
        sinopse = """
        Filme Top Gun
        Filme de aventura sequencia dos lançado nos anos 80.
        Muito bom!
        Ano de Lançamento:
        """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}
