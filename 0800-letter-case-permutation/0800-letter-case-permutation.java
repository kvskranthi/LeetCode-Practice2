class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        if (s == null) return ans;
        backtrack(new StringBuilder(s), 0, ans);
        return ans;
    }

    private void backtrack(StringBuilder sb, int i, List<String> ans) {
        if (i == sb.length()) {
            ans.add(sb.toString());
            return;
        }
        char c = sb.charAt(i);
        if (Character.isDigit(c)) {
            backtrack(sb, i + 1, ans);
            return;
        }
        sb.setCharAt(i, Character.toLowerCase(c));
        backtrack(sb, i + 1, ans);
        sb.setCharAt(i, Character.toUpperCase(c));
        backtrack(sb, i + 1, ans);
        sb.setCharAt(i, c);
    }
}
