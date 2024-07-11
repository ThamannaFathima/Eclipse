package welcome;

public class Operators {

	public static void main(String[] args) {

		
		System.out.println("------Arithmetic Operators------");
		
		int a=30;
		int	b=20;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		
		System.out.println("-------Assignment Operators-------");
		
		int c=b;
		System.out.println(a+=b); //a=a+b 
		System.out.println(a-=b); // a=a-b
		
		System.out.println("----------Relational Opereators----------");
		
		int v1=30;
		int  v2=20;
		
		System.out.println(v1==v2);
		System.out.println(v1>v2);
		System.out.println(v1>=v2);
		System.out.println(v1<=v2);
		
		System.out.println("----------Logical Operators-------");
		
		String username="Sara";
		String pswd="Sara123";
		
		System.out.println(username=="Sara" && pswd=="Sara123");
		System.out.println(username=="Sara" || pswd=="Sara12");
		System.out.println(!(username=="Sara"));
		
		System.out.println("------unary Operators------");
		
		// ++ increment by 1
		
		// -- decrement by 1
		
		int v3=5;
		
		System.out.println(v3++);//5
		System.out.println(v3); //6
		System.out.println(++v3); //7
		
		
		System.out.println("--------- ternary operator--------");
		
		//variable = condition?exp1:exp2;
		
		String ans=v1>v2?"v1 is greater ": "v2 is greater";
		System.out.println(ans);
		
		


	}

}
