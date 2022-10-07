import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Entre com o numero de linhas: ");
        Scanner e = new Scanner(System.in);
        
        int n = e.nextInt();
       
        System.out.println("Sua matriz ficara assim ");
       
        imprimirLinhas(n);
        

        e.close();
    }
    public static void imprimirLinhas(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                
            }
            System.out.println(" ");
            
        }

    }
}
