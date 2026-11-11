import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ls = new ArrayList<>();
        String s = "";
        for (int i = 0; i < num.length; i++) {
            s += num[i];
        }

        BigInteger n = new BigInteger(s);
        n = n.add(BigInteger.valueOf(k));

        String ans = n.toString();

        for (int i = 0; i < ans.length(); i++) {
            ls.add(ans.charAt(i) - '0');
        }

        return ls;
    }
}