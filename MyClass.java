public class MyClass {
    
    public static String compress(String input){
        String compress = ""; 
        char current = input.charAt(0);
        int appear = 0;
        
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == current){
                appear++;
            } else {
                compress+= current;
                compress+= appear;
                current = input.charAt(i);
                appear = 1;
            }
        }
        compress+= current; 
        compress+= appear;
        
        return compress.length() < input.length() ? compress : input;
    
    }
    
    
    
    public static void main(String args[]) {
        
        /*
        aabcccccaaa    ->    a2b1c5a3
        aabbcc         -> aabbcc
        aaaaa         -> a5
        abcdf         -> abcdf
        aaabbccca     -> a3b2c3a1
        */
        
        System.out.println(compress("aabcccccaaa"));
        System.out.println(compress("aabbcc"));
        System.out.println(compress("aaaaa"));
        System.out.println(compress("abcdf"));
        System.out.println(compress("aaabbccca"));
       
    }
}
