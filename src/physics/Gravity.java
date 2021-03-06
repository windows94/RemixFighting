package physics;

import java.util.ArrayList;

import entities.Entity;

public class Gravity {
	public final int ground_y = 500;
	private ArrayList<Entity> entities = new ArrayList<>();

	public Gravity() {

	}

	public void update() {
		for (Entity e : entities) {
			if (e.feetHight()+e.getYvel() >= ground_y) {
				e.setY(ground_y - e.getH() - e.marginY);
				e.replinish();

			} else {

				e.down();
				e.yaccell(1);

			}

		}
	}

	public void addEntity(Entity e) {
		entities.add(e);
	}

	public void removeEntitty(Entity e) {
		entities.remove(e);
	}

}
