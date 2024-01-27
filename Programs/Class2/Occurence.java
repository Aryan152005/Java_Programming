class Occurence{
    public static void main(String args[]){
        String str = "amravati";
        int len = str.length();
        int count = 0;
        for(int i = 0; i < len; i++){
            if(str.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("Number of 'a' in string is = "+count);
    }
}