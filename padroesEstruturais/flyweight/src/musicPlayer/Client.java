package musicPlayer;

import musicPlayer.service.MusicService;

public class Client {

	public static void main(String[] args) {
		MusicService player = new MusicService();
		player.listenMusic("Paulina", "Envolver;Anitta;300");
		player.listenMusic("Paulina", "Envolver;Anitta;300");
		player.listenMusic("Paulina", "Envolver;Anitta;300");
		player.listenMusic("Argentino", "Stay;Justin Bieber;250");
		player.listenMusic("Paulina", "Stay;Justin Bieber;250");
		player.listenMusic("Argentino", "Envolver;Anitta;300");
		player.listenMusic("Argentino", "Envolver;Anitta;300");
		player.listenMusic("Argentino", "Enemy;Imagine Dragons;173");
		player.listenMusic("Paulina", "Enemy;Imagine Dragons;173");
		player.report();
	}

}
