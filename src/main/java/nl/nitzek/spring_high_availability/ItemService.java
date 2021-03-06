package nl.nitzek.spring_high_availability;

import java.util.UUID;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ItemService
{
	@Cacheable(cacheNames = "ItemCache")
	public Item getItem(String itemName)
	{
		var item = new Item();
		item.setReferenceId(UUID.randomUUID().toString());
		item.setName(itemName);
		item.setPrice("25.00");

		return item;
	}
}
