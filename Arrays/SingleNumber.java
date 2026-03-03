//problem:single number 
//Approach :XOR 
//Space Complexity 
Class Solution{
  public int singleNumber(int[] nums){
    int ans=0;
    for(int i=0;i<nums.length;i++){
      ans=ans^nums[i];
    }
    return ans;
  }
}
    
  
