import myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] s){
        MySecondClass secondClass = new MySecondClass(5,2);
        System.out.println(secondClass.sum());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                secondClass.setVal1(i);
                secondClass.setVal2(j);
                System.out.print(secondClass.sum());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
