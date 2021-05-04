package Abstract;

import Entities.Campaign;
import Entities.Player;
import Entities.Product;

public interface SaleService {
	void sale(Product product,Player player);
	
	void sale(Product product,Player player,Campaign campaign);
}
