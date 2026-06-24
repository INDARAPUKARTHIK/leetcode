class Solution {
    public int hammingWeight(int n) {
    
     List<Integer> list =new ArrayList<>();
       while(n> 0){
        list.add(n % 2);   
        n=n/2;
       } 
       int count=0;
       for(int i=0;i<list.size();i++){
        if(list.get(i)==1){
            count++;
        }
       } 
        return count;
    }
}