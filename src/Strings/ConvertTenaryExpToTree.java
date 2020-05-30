package Strings;

import java.util.Scanner;
class Node
{
    char data;
    Node left, right;
    Node(char key)
    {
        data = key;
        left = right = null;
    }
}
public class ConvertTenaryExpToTree {
	
	 public static void main (String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        
	        while(t-- > 0)
	        {
	            String str = "";
	            str = sc.next();
	            Node res = convertExp(str, 0);
	            printInorder(res);
	            System.out.println();
	        }
	    }
	    
	    public static void printInorder(Node node)
	    {
	        if(node == null)
	            return;
	       
	            System.out.print(node.data + " ");
	            printInorder(node.left);
	            printInorder(node.right);
	        
	    }
	public static Node convertExp(String str, int i)
    {
        
        if(i > str.length())
         return null;
         
       Node root = new Node(str.charAt(i));
        i++;
        if(i < str.length() && str.charAt(i) == '?')
         root.left = convertExp(str, i+1);
        if(i < str.length() && str.charAt(i) == ':')
         root.right = convertExp(str, i+1);
      
      return root;  
    }
	
}
/*
Input:
2
a?b:c
a?b?c:d:e
Output:
a b c
a b c d e

Explanation:
Testcase1:
Input :  string expression =   a?b:c
Output : a
              /  \
             b    c
Testcase2:

Input : expression =  a?b?c:d:e
Output :   a
                /  \
              b    e
             /  \
            c    d
*/