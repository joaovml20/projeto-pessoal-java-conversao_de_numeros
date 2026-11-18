import java.util.Scanner;
public class Main{

    static int binarioParaDecimal(String numerob){
        char aux;
        int numerod = 0;
        int potencia = 0;
        int i = 0;
        for(i = numerob.length() - 1; i >= 0; --i){
            aux = numerob.charAt(i);

            if(aux != '0'){
                numerod += (int)Math.pow(2,potencia);
            }
            potencia++;
        }
        return numerod;
    }

    static void decimalParaBinario(int numerod){
        int i = 0;
        int[] resto = new int[100];
        while (numerod > 0) {
                resto[i] = numerod % 2;
                numerod = numerod / 2;
                i++;
            }
            System.out.print("Binario: ");
            for (i = i - 1; i >= 0; i--) {
                System.out.print(resto[i]);
            }
    }

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        char resposta;
        
        int numerod = 0;

        String numerob;

        System.out.println("Executar um numero decimal para binario ou binario para decimal?(d ou b)");
        resposta = scan.next().charAt(0);

        if (resposta == 'd') {

            System.out.println("Digite o numero decimal:");
            numerod = scan.nextInt();
            decimalParaBinario(numerod);
            System.out.println();

        } else if(resposta == 'b'){

            System.out.println("Digite o numero binario:");
            numerob = scan.next();
            System.out.printf("%d",binarioParaDecimal(numerob));

        }
        scan.close();
    }
}