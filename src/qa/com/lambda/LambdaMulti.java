package qa.com.lambda;

public class LambdaMulti {
	
	   interface lambdaInterface {
	        int op(int a, int b);
	    }

	    private int op2(int a, int b, lambdaInterface funcObj) {
	        return funcObj.op(a, b);
	    }

	    public static void main(String[] args) {
	        lambdaInterface divide = (int a, int b) -> a / b;

	        LambdaMulti lambda = new LambdaMulti();
	        
	        System.out.println(lambda.op2(20, 5, divide));
	    }
	}


