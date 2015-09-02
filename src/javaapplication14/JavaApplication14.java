
package javaapplication14;

/**
 *
 * @author eugen
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(hello("World"));
        System.out.println(add(17,5));
    }

    private static String hello(java.lang.String name) {
        ws.CalculatorWebService_Service service = new ws.CalculatorWebService_Service();
        ws.CalculatorWebService port = service.getCalculatorWebServicePort();
        return port.hello(name);
    }

    private static int add(int a, int b) {
        ws.CalculatorWebService_Service service = new ws.CalculatorWebService_Service();
        ws.CalculatorWebService port = service.getCalculatorWebServicePort();
        return port.add(a, b);
    }
    
}
