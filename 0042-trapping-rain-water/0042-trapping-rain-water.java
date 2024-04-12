class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 2) return 0;
        
        Stack<Integer> stack = new Stack<>();
        int water = 0, i = 0;
        while (i < height.length) {
            if (stack.isEmpty() || height[i] <= height[stack.peek()]) {
                stack.push(i++);
            } else {
                int pre = stack.pop();
                if (!stack.isEmpty()) {
                    int minHeight = Math.min(height[stack.peek()], height[i]);
                    water += (minHeight - height[pre]) * (i - stack.peek() - 1);
                }
            }
        }
        return water;
    }
}