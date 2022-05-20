package com.itechf.javacoding;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaCodingApplicationTests {

	@Autowired
	private Basic basic;

	@Test
	void contextLoads() {
		assertThat(basic).isNotNull();
	}

	@Test
	void doReverse() {
		String actual = basic.reverseString("java");
		assertThat(actual).isEqualTo("avaj");
		
		actual = basic.reverseString("Amit");
		assertThat(actual).isEqualTo("timA");
		
		actual = basic.reverseString("Deepak");
		assertThat(actual).isEqualTo("kapeeD");
	}
}
