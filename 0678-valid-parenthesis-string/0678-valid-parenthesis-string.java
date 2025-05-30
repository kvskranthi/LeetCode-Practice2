class Solution {
    public boolean checkValidString(String s) {
            
            int leftMin=0,leftMax=0;
            for(char ch : s.toCharArray()){
                if(ch=='(') { leftMin++; leftMax++; }
                else if(ch==')') { leftMin--; leftMax--; }
                else if (ch=='*') { leftMin--; leftMax++; }

                if(leftMax<0) return false;
                else if(leftMin<0) leftMin=0;
            }
            return leftMin==0 ? true:false;
    }
}