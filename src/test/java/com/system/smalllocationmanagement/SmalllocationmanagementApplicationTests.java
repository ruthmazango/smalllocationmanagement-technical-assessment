package com.system.smalllocationmanagement;

import com.system.smalllocationmanagement.models.Shop;
import com.system.smalllocationmanagement.repository.AreaRepository;
import com.system.smalllocationmanagement.repository.ShopRepository;
import com.system.smalllocationmanagement.services.ShopService;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmalllocationmanagementApplicationTests {

	@Mock
	private ShopRepository shopRepository;

	@Mock
	private AreaRepository areaRepository;

	@InjectMocks
	private ShopService shopService;

	@Captor
	private ArgumentCaptor<Shop> shopCaptor;

	public void ShopServiceTest() {
		MockitoAnnotations.openMocks(this);
	}

//	@Test
//	public void testCreateShopByArea() {
//		// Mock the area repository response
//		String areaName = "Test Area";
//		Area area = new Area();
//		area.setName(areaName);
//		when(areaRepository.findByName(areaName)).thenReturn(area);
//
//		// Invoke the method
//		String shopName = "Test Shop";
//		shopService.insertShopUnderArea(shopName, areaName);
//
//		// Verify that the shopRepository.save() method was called with the correct shop object
//		verify(shopRepository).save(shopCaptor.capture());
//		Shop capturedShop = shopCaptor.getValue();
//
//		// Assert the expected values
//		assertEquals(shopName, capturedShop.getName());
//		assertEquals(area, capturedShop.getArea());
//	}



}
