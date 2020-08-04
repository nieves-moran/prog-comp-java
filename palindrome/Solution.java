package palindrome; 
class Solution {
    public boolean isPalindrome(String s) {
        int i = 0; 
        int j = s.length()-1; 
        while(i <= j){
            if(!(Character.isAlphabetic(s.charAt(i))
                ||Character.isDigit(s.charAt(i)))){
                i++; 
                continue; 
            }
            if(!(Character.isAlphabetic(s.charAt(j)) || 
                Character.isDigit(s.charAt(j)))){
                j--; 
                continue; 
            }
            if(Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(j))){
                if(s.charAt(i) != s.charAt(j)){
                    return false; 
                }
            }else if(Character.isAlphabetic(s.charAt(i)) && 
                    Character.isAlphabetic(s.charAt(j))){
                 if(Character.toLowerCase(s.charAt(i)) != 
                    Character.toLowerCase(s.charAt(j))){
                        return false; 
                    }
            }else{
                return false; 
            }
            i++; 
            j--; 

        }       
        return true; 
    }
    public static void main(String args[]){
        String ss = "1b1"; 
        Solution s = new Solution(); 
        boolean res = s.isPalindrome(ss); 
        return;
    }
}
