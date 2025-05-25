package JavaPackage;

public class JavaMethod {
	static int q=1;
	
	public static int findavg(int n1,int n2,int n3)
	{
		int avg=0;
		avg=(n1+n2+n3)/3;
		return avg;
	} 
	public static void test()
	{
		System.out.println("welcome to test method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int res;	
    res=findavg(10,20,30);
	System.out.println("Avg of three numbers is"+" "+res);
	ConditionalStmt_DecissionMakingStmt.New();
	System.out.println(ConditionalStmt_DecissionMakingStmt.l);
	
	/* test();*/
}


}
