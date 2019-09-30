import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Operacoes extends Remote {


    public double somar(double a, double b)throws RemoteException;

    public  double subtrair(double a, double b)throws RemoteException;

    public double multiplicar(double a, double b)throws RemoteException;

    public  double dividir(double a, double b)throws RemoteException;


}
