package ConsoleUI;

import java.util.Date;

import Concrete.CampaignManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Player;
import Entities.Product;

public class Main {

	public static void main(String[] args) {
		Player player1= new Player(1, "berk", "colak", "1212121212", new Date(1999));
		
		Product product1= new Product(1, "Oyun", 100);
		
		Campaign campaign1= new Campaign(1, "Büyük Kampanya");
		
		PlayerManager playerManager= new PlayerManager(new PlayerCheckManager());
		playerManager.add(player1);
		playerManager.update(player1);
		playerManager.delete(player1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(product1, player1);
		saleManager.sale(product1, player1, campaign1);
		
	}

}
