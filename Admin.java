import java.util.Scanner;
class Admin {
public String nama ;
public String pass;
public String Jen ;
public void input_Admin(){
Scanner input = new Scanner (System.in);
System.out.println("LOGIN");
System.out.println("------------");
System.out.print("Nama :");
nama = input.nextLine();
System.out.print("Password :");
pass = input.nextLine();
system.out.print("Jenis_obat:");
jen = input.nextLine();
System.out.println("------------------------");
}
public void update_Admin(){
String nama = "nama";
String id = "id";
string jen ="jen";
System.out.println("Nama :"+nama);
System.out.println("Id :"+id);
system.out.println("Jen: "+jen);
}
}