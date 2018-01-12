import java.util.Scanner;
public class Farmasi extends Barang {
public void tampil(){
String merek = "FLUDANE";
String harga = "RP 34,00";
String kadar = "10mg";
String jenis = "PATEN";
System.out.println("");
System.out.println("INPUT BARANG");
System.out.println("==============================");
Scanner input = new Scanner (System.in);
System.out.print("Kode :");
kode = input.nextLine();
Barang b = new Barang();
b.input ("obat", "2", "sply");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("kadar :"+kadar);
System.out.println("jenis :"+jenis);
}
public void tampil2(){
String merek = "generik";
String harga = "50 rb";
String kadar = "10mg";
String jenis = "generik";
Barang b = new Barang();
b.tampil ("obat", "100");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("kadar :"+kadar);
System.out.println("jenis :"+jenis);
}
}