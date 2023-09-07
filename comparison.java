class comparison{
    public static void main(String... arg){
        String litstring1 = "abc";
        String litstring2 = "abc";

        String objectstr1 = new String("xyz");
        String objectstr2 = new String("xyz");
        
        System.out.println(litstring1 == litstring2);
        //reused the smae value from the pool
        System.out.println(objectstr1 == objectstr2);
        //did not reuse the same value
        String name = "Jeremy Wang", country = "USA";
        int age = 36;
        //System.out.println("hi my name is "+name+" I reside in "+country+" I am this old "+age+"." );
        String formattedString = String.format("Hi my name is %s. I reside in %s. I am this %d old.",name, country, age);
        //%s == string %d == digits/integers %f = floating point number %c == character %b == boolean 
        System.out.println(formattedString);

    }
}