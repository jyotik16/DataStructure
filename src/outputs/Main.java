package outputs;

//outer class only public final abstract default allowed
//inner class public final abstract protected private default allowed
class Point { 
	 int x, y;
	//protected int x, y; 
	 //private int x, y; CE

	public Point(int _x, int _y) { 
		x = _x; 
		y = _y; 
	} 
} 
//public class Main {
//
//	public static void main(String args[]) { 
//		Point p = new Point(11,12); 
//		System.out.println("x = " + p.x + ", y = " + p.y); 
//		}	
//}

public class Main 
{ 
    public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 
    public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
  
    public static void main(String args[]) 
    { 
        gfg(null); 
    } 
} 
