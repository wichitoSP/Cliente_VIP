
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");

        //Se solicita el precio del producto

        double  precio = scanner.nextDouble();

        // Se solicita el tipo de cliente

        System.out.print("Ingrese el tipo de cliente (VIP,Regular,Nuevo): ");

        String tipoCliente = scanner.next();


        double descuento = 0.0;

        // Se calcula el descuento segun el tipo de cliente.

        if (tipoCliente.equalsIgnoreCase("VIP")){

            descuento = precio *0.20;
        }else if (tipoCliente.equalsIgnoreCase("Regular")){

            descuento = precio*0.10;

        }else if (tipoCliente.equalsIgnoreCase("Nuevo")){

            descuento = 0.0;
        }else {
            System.out.println("El tipo de cliente no es valido: ");

            return;
        }

        //Se calcula el tipo de precio

        double PrecioFinal = precio - descuento;

        System.out.println("Eres un cliente "+tipoCliente+ ".Precio con descuento"+PrecioFinal);

        scanner.close();


    }
}