package lambdaexercise;

@FunctionalInterface
interface IDuplicate {
	String duplicateOperation(String str);
}

interface ITrans {
	String transOperation(String str);
}

public class LambdaExe1 {

	public static void main(String[] args) {
		CPrint objA = new CPrint();
		objA.printDupBig("helloLambda"
				, (String s) -> s + " " + s
				, (String s) -> s.toUpperCase());
	}
}

class CPrint {
	public void printDupBig(String s1, IDuplicate obj1, ITrans obj2) {
		s1 = obj1.duplicateOperation(s1);
		s1 = obj2.transOperation(s1);
		System.out.println(s1);
	}

	public String printSmall(String s1, ITrans obj) {
		s1 = obj.transOperation(s1);
		return s1;
	}
}
