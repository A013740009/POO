
package mi.primera.vez;

/**
 *
 * @author A01378838
 */
public class MiPrimeraVez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("hola Java \n");
        double s;
        s=Suma(3.1,2);
        System.out.printf("%.2f\n", s);
        imprimeasteriscos();
    }

    static double Suma(double x, double y) {
        double result = x + y;
        return result;
    }
    static void imprimeasteriscos(){
    System.out.print("**********\n**********\n");
    }
}
