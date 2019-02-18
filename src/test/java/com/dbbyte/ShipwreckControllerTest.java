package com.dbbyte;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.dbbyte.controller.ShipwreckController;
import com.dbbyte.model.Shipwreck;
import com.dbbyte.repository.ShipwreckRepository;

public class ShipwreckControllerTest {
	
	@InjectMocks
	private ShipwreckController sc;
	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testShipwreckGet() {
//		ShipwreckController sc = new ShipwreckController();
//		Shipwreck wreck = sc.get(1l);

		Shipwreck sw = new Shipwreck();
		sw.setId(1l);
		when(shipwreckRepository.findById(1l).orElse(null)).thenReturn(sw);
		
		Shipwreck wreck = sc.get(1L);
		
		verify(shipwreckRepository).findById(1l);
		
		assertEquals(1L, wreck.getId().longValue());
	}

}
