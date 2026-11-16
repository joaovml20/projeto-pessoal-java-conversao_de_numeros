import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        char resposta;
        int numero = 0;
        int i = 0;
        int[] resto = new int[100];

        String numerob;
        char aux;
        int numerod = 0;
        int potencia = 0;

        System.out.println("Executar um numero decimal para binario ou binario para decimal?(d ou b)");
        resposta = scan.next().charAt(0);

        if (resposta == 'd') {

            System.out.println("Digite o numero decimal:");
            numero = scan.nextInt();

            while (numero > 0) {
                resto[i] = numero % 2;
                numero = numero / 2;
                i++;
            }

            System.out.print("Binario: ");

            for (i = i - 1; i >= 0; i--) {
                System.out.print(resto[i]);
            }

            System.out.println();

        } else if(resposta == 'b'){

            System.out.println("Digite o numero binario:");
            numerob = scan.next();
            

            for(i = numerob.length() - 1; i >= 0; --i){
                aux = numerob.charAt(i);

                if(aux != '0'){
                    numerod += (int)Math.pow(2,potencia);
                }
                potencia++;

            }

            System.out.printf("%d",numerod);
            
        }
        scan.close();
    }
}