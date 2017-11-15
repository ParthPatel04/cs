public class Array {
	public static void main (String[] args) {
		String[] beep=new String[5];
		beep[0] = " Boop";
		beep[1] = " Beep";
		beep[2] = " Blah";
		beep[3] = " Bang";
		beep[4] = " Grass";

		for (int i=0; i<beep.length; i++){
			System.out.println(beep[i]);
		}
	}
}
