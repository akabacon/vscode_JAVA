class test{
  public static void main(String[] argv){
    String str = "25";
    try{
        int number = Integer.parseInt(str);
        System.out.println(number); // output = 25
    }
    catch (NumberFormatException ex){
        ex.printStackTrace();
    }
    String s="123";
    int a;
    a=Integer.parseInt(s);
    System.out.println(a);
  }

}