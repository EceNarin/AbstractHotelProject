import java.util.Scanner;

public class HotelRunner {

	public static void main(String[] args) throws InterruptedException  {
		HotelCustomData hdata=new HotelCustomData();
		KralDairesi kral=new KralDairesi();
		AileOdasi family1=new AileOdasi();
		SapOdasi  single=new SapOdasi();
	Scanner scan=new Scanner(System.in);
	System.out.println("Java Otele Hos Geldiniz!");
	System.out.println("Kampanyalarimiz; \n===================== (Kampanya Koduna gore giris yapiniz)");
	System.out.println("1000. Aile \n2000.Single \n3000.KralDairesi");
	switch(scan.nextInt()) {
	case 1000:
		System.out.println("Aile kampanyamizin tanitimi icin sizi yonlendiriyorum...");
		Thread.sleep(2000);
		family1.tanitim();
		System.out.println("Kayit yapmak icin 1 \nCikmak icin 2'yi tuslayiniz");
		switch(scan.nextInt()) {
		case 1:
		System.out.println("kisi kayit sayisi");
    	int a=scan.nextInt();
    	family1.enrollList(a);
    	hdata.indirimAge(a);
			break;
		case 2:
			System.out.println("Sayfamizi ziyaret ettiginiz icin tesekkur ederiz");
		break;
		default:
			System.out.println("Gecersiz tuslama yaptiniz sizi ana sayfaya aktariyorum");
			break;
		}
		break;
	case 2000:
		System.out.println("Single kampanyamizin tanitimi icin sizi yonlendiriyorum... ");
		single.tanitim();
		System.out.println("Kayit yapmak icin 1 \nCikmak icin 2'yi tuslayiniz");
        switch(scan.nextInt()) {
        case 1:System.out.println("kisi kayit sayisi");
    	int a=scan.nextInt();
    	single.enrolList(a);
        hdata.indirimAge(a);
			break;
		case 2:
			System.out.println("Sayfamizi ziyaret ettiginiz icin tesekkur ederiz");
		break;
		default:
			System.out.println("Gecersiz tuslama yaptiniz sizi ana sayfaya aktariyorum");
			break;
		}
		break;
	case 3000:
		System.out.println("Ultra-Lux kampanyalarimiz icin sizi yonlendiriyorum... ");
		kral.tanitim();
		System.out.println("Kayit yapmak icin 1 \nCikmak icin 2'yi tuslayiniz");
        switch(scan.nextInt()) {
        case 1:
        	System.out.println("kisi kayit sayisi");
        	int a=scan.nextInt();
        	kral.enrolList(a);
        	hdata.indirimAge(a);
			break;
		case 2:
			System.out.println("Sayfamizi ziyaret ettiginiz icin tesekkur ederiz");
		break;
		default:
			System.out.println("Gecersiz tuslama yaptiniz sizi ana sayfaya aktariyorum");
			break;
		}
		break;
	}

	}

}
