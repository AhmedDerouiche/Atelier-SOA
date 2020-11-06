package TestClient;


import java.rmi.RemoteException;

import service.BanqueServiceProxy;

public class ClientTest {
public static void main(String args[]) {
	
	BanqueServiceProxy Stub =new BanqueServiceProxy();
	
	try {
		System.out.println("le résultat de la conversion est :"+Stub.euroToDinar(200.0));
		System.out.println("le résultat de la conversion est :"+Stub.getCompte(12));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
