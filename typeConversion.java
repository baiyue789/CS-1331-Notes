class type_change{
    public static void main(String[]args) {
        int number1 = 5; 
        double n2 = number1;
        System.out.println(n2);
        //n2 is now change since double is larger than an integer
        double number3 = 5.8;
        /*int number4 = number3;
        to change it you have to do it explicately
        System.out.println(number4);*/
        int number4 = (int)number3;
        System.out.println(number4);
        //it just remoed the 5.8 and became 5
        System.out.println(number1++);
        System.out.println(++number1);

    }
}
