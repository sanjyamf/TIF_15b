public class Main {
public static void main (String [] args){
System.out.println("===============================");
System.out.println("-----APOTEK SEHAT FARMA--------");
System.out.println("===============================");
Admin adm = new Admin();
adm.input_Admin();
Farmasi e = new Farmasi();
e.tampil();
Laporan l = new Laporan();
l.cetak();
Antibiotik b = new Antibiotik();
b.input_Antibiotik ();
}
}