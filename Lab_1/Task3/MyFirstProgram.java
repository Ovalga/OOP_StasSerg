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

class MySecondClass {
    private int val1;
    private int val2;

    public int getVal1(){
        return val1;
    }

    public int getVal2(){
        return val2;
    }

    public void setVal1(int val1){
        this.val1 = val1;
    }

    public void setVal2(int val2){
        this.val2 = val2;
    }

    public MySecondClass(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public int sum(){
        return getVal1() + getVal2();
    }
}
