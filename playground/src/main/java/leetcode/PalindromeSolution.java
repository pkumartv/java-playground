package leetcode;

class PalindromeSolution implements Solution{
    public static boolean isPalindrome(int x) {

        String str=Integer.toString(x);
        if(str.length()==1)
            return true;
        //System.out.println("ORIG integer"+str);

        if(str.equals(new StringBuilder(str).reverse().toString())){
            //System.out.println("CHG integer"+new StringBuilder(str).reverse().toString());
            return true;
        }
        else return false;
        
        
    }
    public static boolean isPalindrome(String s) {
        if(s==null)
            return false;
        if(s.length()==1)
            return true;
        String post=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(post.equals(new StringBuffer(post).reverse().toString()))
        return true;
        //System.out.println(post);
        
            return false;
        
    }
    public static void main(String[] args) {
        
       // System.out.println(isPalindrome(54));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}