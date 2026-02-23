package classTask1;

public class ClassTask1 {
	public static void main(String[] args) {
		Netflix netflix = new Netflix();
		netflix.checkGenre(new Drama());
		netflix.checkGenre(new Animation());
		netflix.checkGenre(new Movie());
	}
}
