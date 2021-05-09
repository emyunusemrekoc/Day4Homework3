package gamerProject.adapters;

import java.rmi.RemoteException;

import gamerProject.abstracts.GamerCheckService;
import gamerProject.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getBirthOfDate().getYear());

		} catch (RemoteException e) {
			result = false;
			System.out.println("Clientte hata");
			e.printStackTrace();
		}
		if(result) {
		System.out.println("Kiþisel veriler doðrulandý.\n");}
		else {System.out.println("Kiþisel veriler yanlýþ.\n");}
		return result;

	}

}
