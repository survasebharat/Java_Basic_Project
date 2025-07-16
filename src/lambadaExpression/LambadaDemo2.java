package lambadaExpression;
@FunctionalInterface
interface Calculate
{
	void dosum(int x,int y);
}
public class LambadaDemo2 {

	public static void main(String[] args) {
		
		Calculate cal = (a,b)->System.out.println(a+b);
		cal.dosum(37, 32);
		
	}
}
