import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente {


        Operacoes obj;

    {
        try {
            obj = (Operacoes)
                            Naming.lookup("//127.0.0.1:8000/Operacao");
            double a = 10;
            double b = 2;
            System.out.println("Soma " + obj.somar(a,b));
            System.out.println("Sub " + obj.subtrair(a,b));
            System.out.println("Mult " + obj.multiplicar(a,b));
            System.out.println("Div " + obj.dividir(a,b));

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){

        Cliente c = new Cliente();

    }


}
