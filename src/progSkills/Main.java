package progSkills;

public class Main {

    public static void main(String args[]) {
/*
        Integer intObj=Integer.valueOf(args[args.length-1]);
        int i = intObj.intValue();

        if(args.length > 1)
            System.out.println(i);
        if(args.length > 0)
            System.out.println(i - 1);
        else
            System.out.println(i - 2);
*/

//        for(int i = 1; i < 3; i++) {
//            for (int j = 3; j > i; j--)
//                assert i != j; {System.out.println(i);}
//        }
/*
        String test = "abc";
        test = test + test;
        System.out.println(test);

        char c;
        int i;
        c = 'A';		// 1
        i = c;		//2
        c = i + 1;	//3
        c++;		//4

        int[] []x[];
*/
//        int I = '2';
//        System.out.println(I);

        int i = 0;
        boolean t = false;
        boolean f = false, b;
        b = (t || ((i++) == 0));
        System.out.println(i);
        b = (f || ((i+=2) > 0));
        System.out.println(i);

    }
}
