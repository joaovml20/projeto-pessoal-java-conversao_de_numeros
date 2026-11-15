public class main{
    public static void main(String[] args){
        char resposta;
        int numero,i = 0,proNumero;
        int resto[] = new int[100];
        System.out.println("Decimal para binario ou binario para decimal?/(d ou b)");
        resposta = System.console().readLine().charAt(0);
        if(resposta == 'd'){
            System.out.println("digite o numero decimal: ");
            numero = Integer.parseInt(System.console().readLine());
            while(numero == 1 || numero == 0){
                resto[i] = numero % 2;
                proNumero = numero / 2;
                numero = proNumero;
                i+=1;
            }
        }
    }
}