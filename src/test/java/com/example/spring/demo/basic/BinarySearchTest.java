package com.example.spring.demo.basic;

import com.example.spring.demo.ApplicationBasic;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


/*import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}*/

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ApplicationBasic.class)
class BinarySearchTest {
    @Autowired
    BinarySearch binarySearch;

    @Test
    public void BinarySearchTest() {
        int result = binarySearch.bSearch(new int[]{2, 3, 4}, 4);
        assertEquals(0, result);
    }
}
