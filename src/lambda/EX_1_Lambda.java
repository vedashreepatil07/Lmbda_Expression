package lambda;


interface I
{
	void m();
}
interface I2
{
	void display(int a);
}
public class EX_1_Lambda {
public static void main(String[] args) {
 I i =()->{
	 System.out.println("This is the lamda expression demo...");
 };
 I2 i2=(int a)->
 {
	 System.out.println("This is implementation of display method\n the int value given");
 }; i2.display(78);
 i.m();
}
}
