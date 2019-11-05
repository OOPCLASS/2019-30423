import java.util.HashMap;

public class Card implements Comparable {
	private Suite suite;
	private Character number;
	private HashMap<Character, Integer> map;

	public Card(Suite suite, Character number, HashMap<Character, Integer> map) {
		setSuite(suite);
		setNumber(number);
		setMap(map);
	}

	public Suite getSuite() {
		return suite;
	}

	public Character getNumber() {
		return number;
	}

	public void setSuite(Suite suite) {
		this.suite = suite;
	}

	public void setNumber(Character number) {
		this.number = number;
	}

	public HashMap<Character, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<Character, Integer> map) {
		this.map = map;
	}

	@Override
	public int compare(Comparable objectToCompareTo) {
		if (this.map.get(this.getNumber()) < ((Card) objectToCompareTo).map
				.get(((Card) objectToCompareTo).getNumber())) {
			return 1;
		} else if ((this.map.get(this.getNumber()) == ((Card) objectToCompareTo).map
				.get(((Card) objectToCompareTo).getNumber())
				&& this.getSuite().compareTo(((Card) objectToCompareTo).getSuite()) < 0)) {
			return 1;
		} else {
			return 0;
		}
	}

}
