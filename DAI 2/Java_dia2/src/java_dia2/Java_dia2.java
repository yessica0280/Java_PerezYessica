package java_dia2;

/**
 *
 * @author Uniminuto Tibu
 */
public class Java_dia2 {
    public boolean isValid(String s) {
        boolean bool = true;
        for (int i = 0;i<s.length();i++){
            for (int x = i+1; x< s.length();x++){
                if (s.charAt(i) == '(' && s.charAt(x) == ')'){
                    bool= true;
                    break;
                }
                else if(s.charAt(i) == '[' && s.charAt(x) == ']'){
                    bool= true;
                    break;
                }
                else if(s.charAt(i) == '{' && s.charAt(x) == '}'){
                    bool= true;
                    break;
                }
                else if(s.charAt(i) == '(' && s.charAt(i) == ')' && s.charAt(i) == '[' && s.charAt(i) == ']' && s.charAt(i) == '{' && s.charAt(i) == '}'){
                    bool = true;
                    break;
                }
                else if(s.charAt(i) == '(' && s.charAt(x) == ']'){
                    bool = false;
                    break;
                }
                else if(s.charAt(i) == '(' && s.charAt(i) == '[' && s.charAt(i) == ']' && s.charAt(i) == ')'){
                    bool = true;
                    break;
                }
                
            }
        }
        return bool;
    }
    
}
