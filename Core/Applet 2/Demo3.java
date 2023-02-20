// import java.io.*;
// class A implements Serializable
// {
//   int a;
//  String name;
//   A(int x,String y)
//   {
//    a=x;
//    name=y;
//   }
//  public String toString()
//   {
// //    System.out.println("a: "+a);
// //    System.out.println("name: "+name);
//    return "a: "+a+" name: "+name;
//   }
// }
 
// class Demo3
// {
//  public static void main(String args[])throws Exception
//  {
//   FileOutputStream fout=new FileOutputStream("sample.txt");
//   ObjectOutputStream os=new ObjectOutputStream(fout);
//   A obj= new A(13,"Anu");
//   System.out.println(obj);
//   FileInputStream fin=new FileInputStream("sample.txt");
//   ObjectInputStream is=new ObjectInputStream(fin);
//   A obj1= (A)is.readObject();
//   System.out.println(obj1);
//   os.close();
//   is.close();
//  }
// }


class InvalidAgeException extends Exception
{
 InvalidAgeException(String msg)
 {
   super(msg);
 }
}

class Demo3
{
 public static void main(String[] args)
 {
 try
  {
   vote(12);
  }
 catch(Exception e)
  {
  System.out.println(e);
  }
 }
 public static void vote(int age) throws InvalidAgeException
  {
   if(age<18)
    {
     throw new InvalidAgeException("Not eligible");
    }
   else
    {
     System.out.println("Eligible to vote");
    }
  }
}