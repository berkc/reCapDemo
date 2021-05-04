package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Player;
import Entities.Product;

public class SaleManager implements SaleService{
	

	@Override
	public void sale(Product product, Player player) {
		System.out.println(product.getProductName()+ "ürün satýldý" + player.getFirstName());
	}

	@Override
	public void sale(Product product, Player player, Campaign campaign) {
		System.out.println(product.getProductName()+ "ürün satýldý " + player.getFirstName() + " kampanya uygulandý "+campaign.getCampaignName());
		
	}
}
