class Solution {
    public int mostWordsFound(String[] sentences) {
        int a=0 ;
        for(int i=0;i<sentences.length;i++){
            String b=sentences[i] ;
            String[] word=b.split(" ") ;
            if(word.length>=a){
                a=word.length ;
            }
        }
        return a;
        
    }
}