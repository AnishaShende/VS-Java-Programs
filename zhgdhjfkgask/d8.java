import java.io.*;
class d8
{
int id;
String name;
BufferedReader br = new BufferedReader(new
InputStreamReader(System.in));
void SetData()
{
try
{
System.out.println("enter id and name for student");
 id=Integer.parseInt(br.readLine());
 name=br.readLine();
}
 catch(Exception ex)
 {}
}
void display()
{
 System.out.println("The id is " + id + " and the name is "+ name);
}
public static void main(String are[])
{
 d8[] arr;
 arr = new d8[5];
 int i;
 for(i=0;i<5;i++)
 {
arr[i] = new d8();
 }
 for(i=0;i<5;i++)
 {
arr[i].SetData();
 }
 for(i=0;i<5;i++)
 {
arr[i].display();
 }
}
}
