package Recusion.PatternAndSort;

public class Triangle {
    static void main(String[] args) {
        triangle(4,0);
        triangle2(4,0);
    }
    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            triangle(r,c+1);
        }else{
            System.out.println();
            triangle(r-1,0);
        }
    }
    static void triangle2(int r,int c){

        if(c<r){
            triangle2(r,c+1);
            System.out.print("*");


        }else{
            if(r==1 && c==1){ // this if used for not print extra space at the start
            return;
        }

            triangle2(r-1,0);
            System.out.println();
        }
    }
}
