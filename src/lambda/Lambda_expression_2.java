package lambda;

interface p
{
	int show();
}
interface q
{
	 void display();
}

public class Lambda_expression_2 {

	public static void main(String[] args) {
		p x=()->
		{
			System.out.println("showing implementation of p inteface....");
		return 0;
		};
		q y=()->System.out.println("Displaying implementaion of Q...");
		
		
		x.show();
		y.display();
	}

}
