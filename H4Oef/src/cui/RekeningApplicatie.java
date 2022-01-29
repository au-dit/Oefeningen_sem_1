package cui;
import domein.Rekening;

public class RekeningApplicatie {

	public static void main(String[] args) {
		//
		double saldos[] = {100, 777.77, 287.15, -350, 399.99, 123.45, 987.65, -68.18, 413};
		int lengte = saldos.length;
		Rekening rekeningen[] = new Rekening[lengte];
		String houdernaam;
		double gemiddelde = 0;
		
		for(int i=0; i<lengte; i++) {
			houdernaam = ""+ ((char)(i+65));
			rekeningen[i] = new Rekening((long)i+1,houdernaam);
			rekeningen[i].stortOp(saldos[i]);
		}
		
		// gemiddelde saldo berekenen
		for (Rekening rek : rekeningen) {
			gemiddelde += rek.getSaldo();
		}
		gemiddelde /= lengte;
		
		for(Rekening rekeningnummer : rekeningen) {
			String message = "Rekening " + rekeningnummer.getRekeningnummer()+" van "+rekeningnummer.getHouder() + " bevat " + rekeningnummer.getSaldo();
			System.out.print(message);
			System.out.println();
		}
		
		System.out.printf("Het gemiddelde saldo van deze %d rekeningen bedraagt: %.2f EURO",lengte,gemiddelde);
	}
}
		