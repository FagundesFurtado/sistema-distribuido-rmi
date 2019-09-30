import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class Servidor implements Operacoes {


    public Servidor() {

    }


    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }


    public static void main(String args[]) {

        Servidor servidor = new Servidor();

        System.setProperty("java.rmi.server.hostname",
                "127.0.0.1");
        Registry registro;
        try {

            Operacoes obj = (Operacoes) UnicastRemoteObject.exportObject(servidor, 0);
            registro = LocateRegistry.createRegistry(8000);
            registro.rebind("Operacao",  obj);
            System.out.println("Objeto está pronto para receber as invocações");
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }


    }


}
