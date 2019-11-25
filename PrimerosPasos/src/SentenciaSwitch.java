
public class SentenciaSwitch {
	
	int mes=10;
	String meses;
	
	public String getMes() {
		switch (mes) {
			case 1:
				meses="Enero";
				break;
			case 2:
				meses="Febrero";
				break;
			case 3:
				meses="Marzo";
				break;
			case 4:
				meses="Abril";
				break;
			case 5:
				meses="Mayo";
				break;
			case 6:
				meses="Junio";
				break;
			case 7:
				meses="Julio";
				break;
			case 8:
				meses="Agosto";
				break;
			case 9:
				meses="Seotiembre";
				break;
			case 10:
				meses="Octubre";
				break;
			case 11:
				meses="Noviembre";
				break;
			case 12:
				meses="Diciembre";
				break;
			default:
				meses="No tenemos ese mes";
				break;
		}
		System.out.println(meses);
		return meses;
	}
}
