import java.util.Scanner;
public class Barang {
public String nama_brg;
public String jumlah;
public String supplier;
public String kode;
public void input(String nama_brg, String jumlah, String supplier){
Scanner input = new Scanner (System.in);
System.out.println("Nama Barang :"+nama_brg);
System.out.println("Jumlah Barang :"+jumlah );
System.out.println("Supplier Barang :"+supplier );
}
public void ubah(){
}
public void tampil(String nama_brg, String jumlah){
System.out.println("--------------------");
System.out.println("DATA BARANG TERJUAL");
System.out.println("--------------------");
System.out.println("Nama BarangB:"+nama_brg);
System.out.println("Jumlah Barang :"+jumlah );
}
}