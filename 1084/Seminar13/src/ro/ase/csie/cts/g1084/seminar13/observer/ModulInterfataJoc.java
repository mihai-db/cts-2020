package ro.ase.csie.cts.g1084.seminar13.observer;

public class ModulInterfataJoc implements NotificareConexiune{

	@Override
	public void conexiuneInchisa() {
		System.out.println("Avertizare jucator: Conexiune pierduta !");
	}

}
