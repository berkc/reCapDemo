package Concrete;

import Abstract.BasePlayerManager;
import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerManager extends BasePlayerManager{
	PlayerCheckService checkService;
	
	public PlayerManager(PlayerCheckService checkService) {
		this.checkService=checkService;
	}
	
	@Override
	public void add(Player player) {
		if(this.checkService.checkIfRealPlayer(player)) {
			super.add(player);
		}else {
			System.out.println("Gerçek bir oyuncu giriniz");
		}
		
	}
	
	@Override
	public void update(Player player) {
		if(this.checkService.checkIfRealPlayer(player)) {
			super.update(player);
		}else {
			System.out.println("Gerçek bir oyuncu giriniz");
		}
		
	}
	
	@Override
	public void delete(Player player) {
		super.delete(player);
	}
	
}
