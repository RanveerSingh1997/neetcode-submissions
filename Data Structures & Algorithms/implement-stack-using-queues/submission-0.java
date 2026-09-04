class MyStack {
    ArrayList<Integer> queue1;
    ArrayList<Integer> queue2;
    public MyStack() {
        queue1 = new ArrayList();
        queue2 = new ArrayList();
    }
    
    public void push(int x) {
        queue1.add(x);
    }
    
    public int pop() {
        return queue1.remove(queue1.size()-1);
    }
    
    public int top() {
        return queue1.get(queue1.size()-1);
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */