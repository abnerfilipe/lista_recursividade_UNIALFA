
public class App {
    public static void main(String[] args) throws Exception {
        try {
            int i = 100;
            // System.out.println("Fatorial do número ("+i+") é: "+calcularFatorial(i));  
            System.out.println("Número ("+i+") em binario é: "); 
            naturalToBinary(i); 
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }
    public static int calcularFatorial(int n) throws Exception {
        if(n < 0){
            throw new Exception("Nao é possivel efetuar fatorial de numero negativo!");
        }
        if(n == 1 || n == 0){
            return 1;
        }
       return (n * calcularFatorial(n - 1));
    }
    // 1.Impressão de um número natural em base binária.
    public static void naturalToBinary(int n) {
        if(n / 2 != 0){
            naturalToBinary(n/2);
        }
        System.out.print(n%2);
    }
}
