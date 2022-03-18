package com.mercadolivre.RomanNumbers;

import com.mercadolivre.RomanNumbers.controller.RomanNumberController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RomanNumbersApplicationTestsController {

	@Test
	void testRomanConversion() {
		for (int i=1;i<=100;i++){
			System.out.println(i+"\t "+ RomanNumberController.toRoman(i));
		}
	}

}
