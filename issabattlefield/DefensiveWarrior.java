public class DefensiveWarrior extends Warrior {
	DefensiveWarrior(int level) {
		this.level = level;
	}

	@Override
	int calculateAttack() {
		return attack + level;
	}

	@Override
	int calculateDefense() {
		return defense + 2 * level;
	}

	@Override
	double calculateBoost() {
		return defense / 2.0;
	}

	public static class Builder extends ParentBuilder {

		public Builder(int level) {
			warrior = new DefensiveWarrior(level);
			warrior.attack = 2;
			warrior.defense = 3;
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
