package comparing;

import java.util.Comparator;

public class WeightComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		if (o1.getWeight() < o2.getWeight()) {
			return -1;
		} else if (o1.getWeight() > o2.getWeight()) {
			return 1;
		}
		return 0;
	}

}
