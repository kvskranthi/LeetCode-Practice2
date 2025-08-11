class Solution {
    public boolean isValid(String s) {
        List<Character> openList = Arrays.asList('(','[','{');
        List<Character> closedList = Arrays.asList(')',']','}');
        Stack<Character> stack=new Stack<>();
        for(char ch: s.toCharArray()){
            if(openList.contains(ch)){
                stack.push(ch);
            }
            else if(closedList.contains(ch)){
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if(openList.indexOf(top)!=closedList.indexOf(ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}