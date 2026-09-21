class Solution {
    public int reverseDegree(String s) {
        int product=0 ;
    String a=s.toLowerCase();
    for(int i=0;i<a.length();i++){
        char c=a.charAt(i) ;
        int ascii=(int)c;
        ascii=ascii-96 ;
        product+=(i+1)*(27-ascii) ;
        }

       return product ;
}}