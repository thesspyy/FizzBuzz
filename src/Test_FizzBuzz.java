import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_FizzBuzz {
	FizzBuzz fizzBuzz = new FizzBuzz();
	int input = fizzBuzz.getFizz(1);
	
//	@BeforeEach
//	public void setUp() throws Exception {
//		FizzBuzz fizzBuzz = new FizzBuzz();
//		int i = fizzBuzz.Fizz(1);
//
//	}
	@Test
	void input_is_1_expect_output_1() {
		assertEquals(1,input);
	}

}
