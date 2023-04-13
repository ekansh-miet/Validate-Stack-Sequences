class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int j=0;
        for(int num:pushed){
            stack.push(num);
            while(!stack.isEmpty()&&j<popped.length && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return j==popped.length;
    }
}