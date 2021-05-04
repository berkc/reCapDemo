package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Player;
import Entities.Product;

public class SaleManager implements SaleService{
	Player player;
	Campaign campaign;
	
	public SaleManager(Player player){
		this.player=player;
	}
	
	public SaleManager(Player player,Campaign campaign){
		this.player=player;
		this.campaign=campaign;
	}
	
	@Override
	public void sale(Product product) {
		System.out.println(product.getProductName()+ "Satýldý" );
	}
}
