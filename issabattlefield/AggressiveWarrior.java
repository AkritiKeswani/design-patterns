public class AggressiveWarrior extends Warrior {

	protected AggressiveWarrior(int level) {
		this.level = level;
	}

	@Override
	int calculateAttack() {
		return attack + 2 * level;
	}

	@Override
	int calculateDefense() {
		return defense + level;
	}

	@Override
	double calculateBoost() {
		return attack / 2.0;
	}

	public static class Builder extends ParentBuilder {
		public Builder(int level) {
			warrior = new AggressiveWarrior(level);
			warrior.attack = 3;
			warrior.defense = 2;
		}

		public Builder attack(int attack) {
			warrior.attack = attack;
			return this;
		}

		public Builder defense(int defense) {
			warrior.defense = defense;
			return this;
		}

	}
}
