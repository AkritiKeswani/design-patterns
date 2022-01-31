public abstract class Warrior {
	int level;
	int attack;
	int defense;

	public int getLevel() {
		return level;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	double calculatePower() {
		return calculateAttack() + calculateDefense() + calculateBoost();
	}

	abstract int calculateAttack();

	abstract int calculateDefense();

	abstract double calculateBoost();

	abstract static class ParentBuilder {
		protected Warrior warrior;

		public Warrior build() {
			validate(warrior);
			return warrior;
		}

		protected void validate(Warrior warrior) {
			String errorString = "";
			if (warrior.level < 0) {
				errorString += "Level must be greater than 0. ";
			}
			if (warrior.attack < 0) {
				errorString += "Attack must be greater than 0. ";
			}
			if (warrior.defense < 0) {
				errorString += "Defense must be greater than 0. ";
			}
			if (!errorString.contentEquals("")) {
				throw new IllegalStateException(errorString);
			}
		}
	}
}
