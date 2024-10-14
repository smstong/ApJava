public class Demo {
	public static void main(String[] args) throws Exception{
		Terminal term = new Terminal();

		Clock clock = new Clock();
		clock.showTime(term, "Red");
		term.reset();

		Image img = new Image("pokemon.jpeg");
		img.show(term);
		term.reset();
	}
}
