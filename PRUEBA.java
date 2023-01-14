import java.util.Scanner;

public class PRUEBA {

    
    public static void main(String[] args) throws Exception {
        Scanner entrada =new Scanner (System.in);
        int numero,factorial;

        System.out.println("Ingrese un numero : ");
        numero=entrada.nextInt();
        

        System.out.println("El factorial del numero es "+factorial(numero));

        }




    public static double factorial (int numero){
    double aux=1;

      for(int i =2 ; i<=numero;i++){
        aux*=i;
      }
      return aux;
    }
}
