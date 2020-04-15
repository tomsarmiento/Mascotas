package tomassarmiento.web.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, int weight) {
		setName(name);
		setBreed(breed);
		setWeight(weight);
	}

	@Override
	public String showAffection() {
		if(getWeight()<30) {
			return getName() + " curled up next to you.";
		}
		else {
			return getName() + " hopped into your lap and cuddled you!.";
		}
	}

}
