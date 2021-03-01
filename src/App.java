
public class App {
    public static void main(String[] args) throws Exception {
        try {
            int i = 10;
            System.out.println("Fatorial do número ("+i+") é: "+calcularFatorial(i));  
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
}
