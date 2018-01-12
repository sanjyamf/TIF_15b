public class Generik extends Barang{
public void tampil(){
String merek = "cimalaka";
String harga = "200rb";
String kandungan = "1shak";
String jenis = "beton";
Barang b = new Barang();
b.input ("beton", "1", "sply");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("kandungan:"+kandungan);
System.out.println("jenis :"+jenis);
}
}