package ejemploFecha;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaFormato {
	
	Date date;
	SimpleDateFormat parseador;
	SimpleDateFormat formateador;
	
	public String getFecha() {
		
		parseador=new SimpleDateFormat("dd-MM-yy");
		formateador=new SimpleDateFormat("dd/MM/yy");
		try {
			date=parseador.parse("16-05-2018");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String salida=formateador.format(date);
		
		return salida;
		
	}

}
