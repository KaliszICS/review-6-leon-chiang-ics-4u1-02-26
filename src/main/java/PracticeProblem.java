public class PracticeProblem {

	public static void main(String args[]) {
	
	}

	public static int sum(int Num1, int Num2) {
			int result=Num1+Num2;
			return result;
		}
	public static int difference(int Num3, int Num4) {
			int result=Num3-Num4;
			return result;
		}
	public static double product(double Num1, double Num2) {
			double solution=Num1*Num2;
			return solution;
		}
	public static String removeFirst(String word1) {
			String solution=word1.substring(1);
			return solution;
		}
	public static int combinedLength(String word1, String word2) {
			int solution=word1.length()+word2.length();
			return solution;
		}
	public static boolean isEven(int Num1) {
			boolean solution=Num1%2==0;
			return solution;
		}
	public static boolean isOdd(int Num1) {
			boolean solution=Num1%2!=0;
			return solution;
		}
	public static boolean isNegative(int Num1) {
			boolean solution=Num1<0;
			return solution;
		}
	public static boolean isPositive(int Num1) {
			boolean solution=Num1>0;
			return solution;
		}
}
	