public class Converção {
    public static void main(String[] args){
        double valorEmDolares = 400;
        double taxaDolar = 4.94;

        double valorReais = valorEmDolares * taxaDolar;

        String mensagem = "O valor em reais é = " + valorReais;
        System.out.println(mensagem);

    }
}
