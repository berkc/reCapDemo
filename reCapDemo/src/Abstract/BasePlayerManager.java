package Abstract;

import Entities.Player;

public abstract class BasePlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.out.println("Oyuncu Eklendi : "+player.getFirstName());
	}

	@Override
	public void update(Player player) {
		System.out.println("Oyuncu Silindi : "+player.getFirstName());
	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu Silindi : "+player.getFirstName());
		
	}

}
