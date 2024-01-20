class Swap{
    public static void main(String args[]){
    int a = 10;
	int b = 20;
	
	System.out.println("Before Swap:\n a= "+a+"\n b= "+b);
	
	a = a+b;
	b = a-b;
	a = a-b;
	
	System.out.println("\nAfter Swap:\n a= "+a+"\n b= "+b);
    }
}