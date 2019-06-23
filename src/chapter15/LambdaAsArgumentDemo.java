package chapter15;

interface FuncPar
{
	void method();
}

public class LambdaAsArgumentDemo {
	
	static void lambdaArg(FuncPar fun)
	{
		fun.method();
	}
	static FuncPar getLambda()
	{
		return ()->{
			System.out.println("Returned Lambda function 1");
		};
	}
	public static void main(String []args)
	{
		lambdaArg(()->{
			System.out.println("Lambda function 1");
		});
		lambdaArg(()->{
			System.out.println("Lambda function 2");
		});
		getLambda().method();
	}

}
