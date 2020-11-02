package com.company;

public class Main {

    public static int remainder(int a, int b){

        return a%b;
    }

    public static int triArea(int a, int b){
        return a*b/2;
    }

    public static int animals(int a, int b, int c){
        return 2*a+4*b+4*c;
    }

    public static boolean profitableGamble(double a, double b, double c){
        return a * b > c;
    }
    public static String operation(int N, int a, int b){
        if(a+b==N){
            return "added";
        } else if(a-b==N){
            return "subtracted";
        } else if(a*b==N){
            return "multiply";
        } else if(a/b==N){
            return "division";
        }else{
            return "none";
        }
    }

    public static int ctoa(char a){
        return (int) a;
    }

    public static int addUpTo(int a){
        int S=0;
        for (int i=1; i<=a; i++){
            S+=i;
        }
        return S;
    }

    public static int nextEdge(int a, int b){
        return a+b-1;
    }

//    public static int sumOfCubes(int a[]){
//        int sum = 0;
//    }

    public static boolean abcmath(int a, int b, int c){
        for (int i = 0; i<b; i++){
            a+=a;
        }
        return a%c==0;
    }

    public static void main(String[] args) {
        System.out.println(remainder(-5,16));
        System.out.println(triArea(3, 2));
        System.out.println(animals(2, 3, 5));
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(operation(24, 15, 9));
        System.out.println(ctoa('A'));
        System.out.println(addUpTo(3));
        System.out.println(nextEdge(8, 10));
        //System.out.println(sumOfCubes([1, 5, 9]));
        System.out.println(abcmath(42, 5, 10));
    }
}
// hello world

// some code in new ветка :)