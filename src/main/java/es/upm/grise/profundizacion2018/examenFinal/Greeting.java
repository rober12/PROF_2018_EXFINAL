package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public class Greeting {

	public String getGreeting( Language language ) {
		// Get current hour
		int hour = getHour();

		// Find out the greeting language
		if ( language == null )
			language = getDefaultLanguage();

		// Get the moment of the day
		TimeOfTheDay moment;
		if( hour < 12 )
			moment = TimeOfTheDay.MORNING;
		else if ( hour < 18 )
			moment = TimeOfTheDay.AFTERNOON;
		else
			moment = TimeOfTheDay.EVENING;

		// Return the message		
		return getMessage(language, moment);
	}

	String getMessage(Language language, TimeOfTheDay moment) {
		return Message.getMessage( moment, language );
	}

	Language getDefaultLanguage() {
		return Message.getDefaultLanguage();
	}

	
	Calendar getCalendar() {
		return Calendar.getInstance();
	}
	int getHour() {
		return getCalendar().get( Calendar.HOUR_OF_DAY );
	}
	int getMinutes(){
		return getCalendar().get(Calendar.MINUTE);
	}
	int getSeconds(){
		return getCalendar().get(Calendar.SECOND);
	}

}
