package Swimming;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class swimming_poolTest {
	
	swimming_pool Test;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Start Testing!");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		Test = new swimming_pool();
	}

	@Test
	void test_01() throws Exception {
		double result = 125;
		boolean member = true;
		boolean weekend = true;
		boolean group = false;
		int age = 3;
		LocalTime time = LocalTime.parse("09:00:00");
		assertEquals(result, Test.price(member, weekend, group, age, time));
	}
	
	// @Test
	// void test_02() throws Exception {
	// 	String result = "킠챞턨짫!";
	// 	boolean member = true;
	// 	boolean weekend = true;
	// 	boolean group = false;
	// 	int age = 2;
	// 	LocalTime time = LocalTime.parse("09:00:00");
	// 	Exception exception = assertThrows(Exception.class, () -> Test.price(member, weekend, group, age, time));
	// 	assertEquals(result, exception.getMessage());
	// }
	
	// @Test
	// void test_03() throws Exception {
	// 	String result = "킠챞턨짫!";
	// 	boolean member = true;
	// 	boolean weekend = true;
	// 	boolean group = false;
	// 	int age = 3;
	// 	LocalTime time = LocalTime.parse("04:59:00");
	// 	Exception exception = assertThrows(Exception.class, () -> Test.price(member, weekend, group, age, time));
	// 	assertEquals(result, exception.getMessage());
	// }
	
	// @Test
	// void test_04() throws Exception {
	// 	double result = 250;
	// 	boolean member = false;
	// 	boolean weekend = true;
	// 	boolean group = false;
	// 	int age = 3;
	// 	LocalTime time = LocalTime.parse("09:00:00");
	// 	assertEquals(result, Test.price(member, weekend, group, age, time));
	// }
	
	// @Test
	// void test_05() throws Exception {
	// 	double result = 100;
	// 	boolean member = true;
	// 	boolean weekend = false;
	// 	boolean group = false;
	// 	int age = 3;
	// 	LocalTime time = LocalTime.parse("09:00:00");
	// 	assertEquals(result, Test.price(member, weekend, group, age, time));
	// }
	
	// @Test
	// void test_06() throws Exception {
	// 	double result = 140;
	// 	boolean member = false;
	// 	boolean weekend = false;
	// 	boolean group = true;
	// 	int age = 3;
	// 	LocalTime time = LocalTime.parse("09:00:00");
	// 	assertEquals(result, Test.price(member, weekend, group, age, time));
	// }
	
	// @Test
	// void test_07() throws Exception {
	// 	String result = "킠챞턨짫!";
	// 	boolean member = true;
	// 	boolean weekend = false;
	// 	boolean group = false;
	// 	int age = 2;
	// 	LocalTime time = LocalTime.parse("09:00:00");
	// 	Exception exception = assertThrows(Exception.class, () -> Test.price(member, weekend, group, age, time));
	// 	assertEquals(result, exception.getMessage());
	// }
	
	// @Test
	// void test_08() throws Exception {
	// 	String result = "킠챞턨짫!";
	// 	boolean member = true;
	// 	boolean weekend = false;
	// 	boolean group = false;
	// 	int age = 3;
	// 	LocalTime time = LocalTime.parse("04:59:00");
	// 	Exception exception = assertThrows(Exception.class, () -> Test.price(member, weekend, group, age, time));
	// 	assertEquals(result, exception.getMessage());
	// }

	// @Test
	// void test_09() throws Exception {
	// 	double result = 160;
	// 	boolean member = false;
	// 	boolean weekend = false;
	// 	boolean group = false;
	// 	int age = 61;
	// 	LocalTime time = LocalTime.parse("09:00:00");
	// 	assertEquals(result, Test.price(member, weekend, group, age, time));
	// }

	// @Test
	// void test_10() throws Exception {
	// 	double result = 200;
	// 	boolean member = false;
	// 	boolean weekend = false;
	// 	boolean group = false;
	// 	int age = 25;
	// 	LocalTime time = LocalTime.parse("09:00:00");
	// 	assertEquals(result, Test.price(member, weekend, group, age, time));
	// }

	// @Test
	// void test_11() throws Exception {
	// 	double result = 160;
	// 	boolean member = false;
	// 	boolean weekend = false;
	// 	boolean group = false;
	// 	int age = 25;
	// 	LocalTime time = LocalTime.parse("06:00:00");
	// 	assertEquals(result, Test.price(member, weekend, group, age, time));
	// }	
	
	// @Test
	// void test_12() throws Exception {
	// 	double result = 200;
	// 	boolean member = false;
	// 	boolean weekend = false;
	// 	boolean group = false;
	// 	int age = 25;
	// 	LocalTime time = LocalTime.parse("09:00:00");
	// 	assertEquals(result, Test.price(member, weekend, group, age, time));
	// }	
}
