package CI.test.helloWorld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void testHellowWorld(){
		CI.src.helloWorld.HelloWorld hello = new CI.src.helloWorld.HelloWorld();
		assertEquals("A test for Hello World String", "Hello World", hello.sayHello());
	}
}
