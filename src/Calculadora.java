import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        
        System.out.println("Prezado(a), professor(a), informe seu nome:");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.next();
        int regime;
        do {
            System.out.println("Por favor, informe seu regime de pagamento. Digite 1 para CLT, 2 para Horista e 3 para PJ.");
            regime = teclado.nextInt();
            
            if (regime == 1){
                System.out.println("Informe seu salário mensal:");
                double salarioMensal = teclado.nextDouble();
                double valorCLT = salarioMensal;
                System.out.println(nome+", seu valor a receber é "+valorCLT);
                break;

            } else if (regime == 2){
                System.out.println("Informe o número de horas trabalhas:");
                int horasTrabalhadas = teclado.nextInt();
                System.out.println("Informe o valor da hora de trabalho:");
                double valorHora = teclado.nextDouble();
                double valorHorista = horasTrabalhadas*valorHora;
                System.out.println(nome+", seu valor a receber é "+valorHorista);
                break;

            }else if (regime == 3){
                System.out.println("Informe o valor de seu contrato:");
                double valorContrato = teclado.nextDouble();
                teclado.close();
                double valorPJ = valorContrato;
                System.out.println(nome+", seu valor a receber é "+valorPJ);
                break;
            }else{
                System.out.println("Opção inválida, tente novamente.");
            }
        }while(regime!= 1  || regime!= 2 || regime!= 3);
        
    }
}
