package Recusion.SubsetStringSubsequence;

public class Stream {
    static void main(String[] args) {
        skip("","baccadh");
        System.out.println(skip("baccadh"));
        System.out.println(skipapple("bcahappletq"));
        System.out.println(skipAppNotApple("weapplesjappfa"));


    }
    static void skip(String p, String up){// p= processed , up = unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));//up.substring bassicaly start the string from index 1 and remov index no. 0

        }else{
            skip(p+ch,up.substring(1));
        }

    }
    static String skip( String up){
        if(up.isEmpty()){
            return"";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
          return  skip(up.substring(1));//up.substring bassicaly start the string from index 1 and remov index no. 0

        }else{
            return ch + skip(up.substring(1));
        }

    }

    static String skipapple( String up){
        if(up.isEmpty()){
            return"";
        }

        if(up.startsWith("apple")){
            return  skipapple(up.substring(5));//up.substring bassicaly start the string from index 1 and remov index no. 0

        }else{
            return up.charAt(0)+ skipapple(up.substring(1));
        }

    }

    static String skipAppNotApple( String up){
        if(up.isEmpty()){
            return"";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return  skipAppNotApple(up.substring(3));//up.substring bassicaly start the string from index 1 and remov index no. 0

        }else{
            return up.charAt(0)+ skipAppNotApple(up.substring(1));
        }

    }
}
