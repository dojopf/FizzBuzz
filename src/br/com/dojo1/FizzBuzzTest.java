package br.com.dojo1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testListaAteNumeroUm(){
		Assert.assertEquals("1", FizzBuzz.execute(1));
	}
	
	@Test
	public void testListaAteNumeroDois(){
		Assert.assertEquals("1,2", FizzBuzz.execute(2));
	}
	@Test
	public void testListAteNumeroTres(){
		Assert.assertEquals("1,2,Fizz", FizzBuzz.execute(3));
	}
	
	@Test
	public void testListAteNumeroQuatro(){
		Assert.assertEquals("1,2,Fizz,4", FizzBuzz.execute(4));
	}
	
	@Test
	public void testListAteNumeroCinco(){
		Assert.assertEquals("1,2,Fizz,4,Buzz", FizzBuzz.execute(5));
	}
	
	@Test
	public void testListAteNumeroDez(){
		Assert.assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz", FizzBuzz.execute(10));
	}
	@Test
	public void testListAteNumeroQuinze(){
		Assert.assertEquals("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz", FizzBuzz.execute(15));
	}
	@Test
	public void testListNumeroZero(){
		Assert.assertEquals("valor nao pode ser zero", FizzBuzz.execute(0));
	}
	@Test
	public void testListNumeroNegativo(){
		Assert.assertEquals("valor nao pode ser negativo sua anta peluda!!!", FizzBuzz.execute(-1));
	}
}
