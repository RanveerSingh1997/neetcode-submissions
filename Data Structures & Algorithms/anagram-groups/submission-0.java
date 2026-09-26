class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> anagrams=new HashMap(); 
      for(String str:strs){
         char[] chars=str.toCharArray();
         Arrays.sort(chars);
         String key=Arrays.toString(chars);
         List<String> values=anagrams.getOrDefault(key,new ArrayList());
         values.add(str);
         anagrams.put(key,values) ;  
      }
      return new ArrayList<>(anagrams.values());
    }
}
