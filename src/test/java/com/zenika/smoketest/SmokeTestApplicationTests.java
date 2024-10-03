package com.zenika.smoketest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmokeTestApplicationTests {

	@DisplayName("Lancement de l'application Context")
	@Test
	void contextLoads() {
        /*
         Ce test est vide, mais il va instancier l'application Spring.
        */
	}
}
