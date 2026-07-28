class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            Stack<Integer> st = new Stack<>();
            while (a != 0) {
                st.push(a % 10);
                a = a / 10;
            }
            while (!st.isEmpty()) {
                ls.add(st.pop());
            }
        }
        int[] arr = new int[ls.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ls.get(i);
        }
        
        return arr;
    }
}
