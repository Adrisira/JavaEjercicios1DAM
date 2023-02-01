package interfaces;

import java.util.Comparator;

public class OrdenacionMascotasPorEdad implements Comparator <Mascota>{

	@Override
	public int compare(Mascota o1, Mascota o2) {
		// TODO Auto-generated method stub
		return o2.edad - o1.edad;
	}



	


}
