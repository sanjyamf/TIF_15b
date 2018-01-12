public class Transaksi extends Barang{
public void tampil(){
String merek = "sanmol";
String harga = "20rb";
String kadar = "2mg";
String jenis = "Paten";
Transaksi b = new Transaksi();
b.input ("panadol", "1", "sply");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("Kadar:"+kadar);
System.out.println("jenis :"+jenis);
}
}