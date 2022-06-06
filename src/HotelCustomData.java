import java.util.ArrayList;
import java.util.Scanner;
public class HotelCustomData  {
	Scanner scan=new Scanner(System.in);
	ArrayList<KralDairesi>  kr=new ArrayList<KralDairesi>();
	KralDairesi kr1=new KralDairesi(m,n);
	ArrayList<SapOdasi>  sing1=new ArrayList<SapOdasi>();
	SapOdasi   sing=new SapOdasi(m,n);
	ArrayList<AileOdasi>  fam1=new ArrayList<AileOdasi>();
	 AileOdasi  fam=new AileOdasi(m,n);
	 static String m,n;
	 static int x;
	//static HotelCustomData data=new HotelCustomData();
		public ArrayList<AileOdasi> enrollAile(int x) {
			for(int i=0;i<x;i++) {
				  System.out.println("Musterinin isim ve soyisim bilgilerini giriniz");
				  String m=scan.next().toUpperCase();
				  String n=scan.next().toUpperCase();
				  AileOdasi  fam=new AileOdasi(m,n);
				  fam1.add(i, fam);
				  }
			return fam1;
}
		public void indirimAge(int x) {
			int count=0;
			for(int i=0;i<x;i++) {
				System.out.println("Lutfen "+ (i+1)+ ". kisinin yasi giriniz");
				int age=scan.nextInt();
				if(age<7) {
					++count;
				}
			}	
			if(count !=0) {
				System.out.println("%"+count*(10)+ " cocuk indirimi kazandiniz");
			}
			System.out.println("Erken ve pesin odeme imkanlariyla %20'ye varan erken rezervasyon indiriminden"
					+ "faydalanabilirsiniz.  ");	
			
		}
		public ArrayList<SapOdasi> enrollSingle(int x) {
	   for(int i=0;i<x;i++) {
		  System.out.println("Musterinin isim ve soyisim bilgilerini giriniz");
		  String m=scan.next().toUpperCase(null);
		  String n=scan.next().toUpperCase();
		  SapOdasi  sing=new SapOdasi(m,n);
		  sing1.add(i, sing);
		  }
	return sing1;
  }
   //otele kayıt yapan musteriler
		public ArrayList<KralDairesi> enrollKing(int x)  {
	  for(int i=0;i<x;i++) {
		  System.out.println("Musterinin isim ve soyisim bilgilerini giriniz");
		  String m=scan.next().toUpperCase();
		  String n=scan.next().toUpperCase();
		  KralDairesi kr1=new KralDairesi(m,n);
		  kr.add(i,kr1);
		  }
	return kr;
 }
		
}