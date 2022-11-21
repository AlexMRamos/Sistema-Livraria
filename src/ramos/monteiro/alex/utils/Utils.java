package ramos.monteiro.alex.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utils {

	public static Boolean calculaIdade(String dataNascimento) {

		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date dataNascInput = null;

		try {
			dataNascInput = sdf.parse(dataNascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar dateOfBirth = new GregorianCalendar();

		dateOfBirth.setTime(dataNascInput);

		Calendar today = Calendar.getInstance();


		int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

		 

		dateOfBirth.add(Calendar.YEAR, age);

		if (today.before(dateOfBirth)) {

		age--;

		}

		if(age >= 18 ) {
			return Boolean.TRUE;
		}

		return Boolean.FALSE;
		}


}
