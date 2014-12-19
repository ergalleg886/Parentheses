import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = in.readLine();
        char[] charArray = s.toCharArray();
        Character[] charObject = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++){
            charObject[i] = charArray[i];
        }
        Stack<Character> stack = new Stack<Character>();
        char c;
        char popped;
        for(int i = 0; i < charObject.length; i++){
            c = charObject[i];
            if(c =='{' || c =='('  || c =='['){
                stack.push(c);
            }
            else if(c == '}' || c ==')' || c== ']'){
                popped = stack.pop();
                if(c =='}' && popped =='{'){
                    continue;
                }
                if(c ==')' && popped =='('){
                    continue;
                }
                if(c ==']' && popped =='['){
                    continue;
                }
                else{
                    System.out.print("TRY AGAIN");
                    return;
                }
            }
        }
        if(stack.size() == 0){
            System.out.print("WELL DONE");
        }
        else {
            System.out.print("TRY AGAIN");
        }
    }
}