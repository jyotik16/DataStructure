package outputs;


class Overriding2{
	public static void gfg(String s) 
    {     
        System.out.println("String2"); 
    } 
}
public class Overriding extends Overriding2{

	public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
	public static void main(String args[]) 
    { 
        Overriding o  = new Overriding();
        Overriding2 o1  = new Overriding();
		o.gfg(null); //string 
		o1.gfg(null); //string2
    } 
}
