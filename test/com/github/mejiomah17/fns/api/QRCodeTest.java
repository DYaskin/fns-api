package com.github.mejiomah17.fns.api;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QRCodeTest {

	private static final String NAME = "+79193984130";
	private static final String PHONE = NAME;
	private static final String PASSWORD = "139593";
	private static final String QR = "t=20190411T1937&s=280.00&fn=9281000100260346&i=6534&fp=1579353940&n=1";
	private static final Logger _Logger = Logger.getLogger(QRCodeTest.class.getName());
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//check URL
		//FNS.restorePassword(PHONE); 
		//assertTrue(FNS.login(PHONE, PASSWORD));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
			
			try {
				assertTrue(FNS.login(PHONE, PASSWORD));
				FnsCheck check = FNS.getCheck(QR, PHONE, PASSWORD);
				_Logger.info("FNS Check: "+check);
			} catch (CheckNotFoundException | InternalFnsException | UserDoesNotExistException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
