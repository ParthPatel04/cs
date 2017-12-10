public class Array {
	public static void main (String[] args) {
		String[] beep = new String[5];
		beep[0] = "Boop";
		beep[1] = "Beep";
		beep[2] = "Blah";
		beep[3] = "Bang";
		beep[4] = "Grass";

		printArray(beep);
	}

	public static void printArray(String[] names) {
		for(int i=0; i<names.length;i++){
			System.out.println(names[i]);
		}
	}
}
