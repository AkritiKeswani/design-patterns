public class ArmoredWarriorDecorator extends Warrior {
	Warrior warrior;

	public ArmoredWarriorDecorator(Warrior warrior) {
		this.warrior = warrior;
		warrior.defense *= 2;
	}

	@Override
	int calculateAttack() {
		return warrior.calculateAttack();
	}

	@Override
	int calculateDefense() {
		return warrior.calculateDefense();
	}

	@Override
	double calculateBoost() {
		return warrior.calculateBoost();
	}

	@Override
	public int getLevel() {
		return warrior.getLevel();
	}

	@Override
	public int getAttack() {
		return warrior.getAttack();
	}

	@Override
	public int getDefense() {
		return warrior.getDefense();
	}
}