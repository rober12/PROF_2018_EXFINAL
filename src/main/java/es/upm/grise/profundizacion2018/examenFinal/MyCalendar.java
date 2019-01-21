package es.upm.grise.profundizacion2018.examenFinal;

import java.util.Calendar;

public abstract class MyCalendar extends Calendar {
	// Se crean los getters
	Calendar c;

    MyCalendar (){
        this.c = Calendar.getInstance();
	}
    int getHour(){
        return c.get(Calendar.HOUR_OF_DAY);
    }
    int getMinutes(){
        return c.get(Calendar.MINUTE);
    }
    int getSeconds(){
        return c.get(Calendar.SECOND);
    }
    
    int getDay(){
    	return c.get(Calendar.DAY_OF_MONTH);
    }
    int getMonth(){
    	return c.get(Calendar.MONTH);
    }
    int getYear(){
    	return c.get(Calendar.YEAR);
    }
}