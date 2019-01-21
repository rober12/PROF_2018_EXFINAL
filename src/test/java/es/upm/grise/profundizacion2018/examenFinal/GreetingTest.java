package es.upm.grise.profundizacion2018.examenFinal;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyVararg;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class GreetingTest {
	
	private Greeting greeting = spy(new Greeting());

 
	private Greeting greting;
	@Before
	public void cons(){
		this.greeting=greeting;
	}
	
	@Before
	public void cogiendoHora(){
		when(this.greeting.getHour()).thenReturn(11);
	}
	@Test
	public void smokeTest1() {
		assertEquals("Good morning", this.greeting.getGreeting(null));
	}
	
	@Test
	public void smokeTest2() {
		assertEquals("Good morning", this.greeting.getGreeting(Language.ENGLISH));
	}
	
	@Test
	public void smokeTest3() {
		assertEquals("Buenos días", this.greeting.getGreeting(Language.SPANISH));
	}

	@Test
	public void smokeTest4(){
		greeting.getGreeting(null);
		verify(greeting,times(1)).getDefaultLanguage();
		verify(greeting,times(1)).getMessage(anyVararg(),anyVararg());
	}

	@Test
	public void smokeTest5(){
		greeting.getGreeting(Language.SPANISH);
		verify(greeting,times(0)).getDefaultLanguage();
		verify(greeting,times(1)).getMessage(anyVararg(),anyVararg());
	}
}
