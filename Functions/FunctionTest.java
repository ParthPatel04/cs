public class FunctionTest {
	public static void main(String[] args) {
		int n=74;
		int p=99;
		int k=95;
		System.out.println(min2(p,n, k));
	}

	static int f(int a, int b) {
		return a * b;
	}

	static int min2(int a, int b) {
		if (a<b){
			return a;
		}else{
			return b;

		}
	}

	static int min3(int a, int b, int c) {
		if (a<b&& a<c){
			return a;	
		} else if (b<c&& b<a){
			return b;
		} else {
			return c;
		}
	}
}