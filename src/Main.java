import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pragrammer pragrammer=new Pragrammer();
       pragrammer.name=scanner.nextLine();
       pragrammer.surname=scanner.nextLine();
       pragrammer.age= scanner.nextInt();


        System.out.println("Name  : "+pragrammer.name+"\nSurname   :  "+pragrammer.surname+"\nage  :  "+pragrammer.age);
        System.out.println("Year to brithday  : "+pragrammer.getAge());
    }
}