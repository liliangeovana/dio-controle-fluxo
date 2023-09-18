import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

    Scanner terminal = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro valor: ");
        int primeiroValor = terminal.nextInt();

        System.out.println("Agora o segundo: ");
        int segundoValor = terminal.nextInt();  

            try{
                contar(primeiroValor, segundoValor);
            }catch(ParametrosInvalidosException p){
                System.out.println("[ERRO] O segundo valor deve ser maior que o primeiro.");
            }
    }

     static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        
        if (segundoParametro > primeiroParametro){

            int limite = segundoParametro - primeiroParametro;

            for (int contador = 1; contador <= limite; contador++){
                System.out.println("O "+contador+"º valor é: "+primeiroParametro);
                primeiroParametro++;
            }
        }else{
            throw new ParametrosInvalidosException();
        }
    
    }
}
     
   