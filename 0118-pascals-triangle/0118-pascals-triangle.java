class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> l2 = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            l2.add(l1(i));
        }
        return l2;
    }
    public List<Integer> l1(int n ){
        int ans =1;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for(int i =1;i<n;i++){
            ans = ans*(n-i);
            ans = ans/i;
            arr.add(ans);
        }
        return arr;
    }
}