
public class AileOdasi extends Hotel {

static HotelCustomData data1=new HotelCustomData();
String name,surName;
int roomNum=1000;
	public AileOdasi(String name, String surName) {
		this.name = name;
		this.surName = surName;
}

	public AileOdasi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tanitim(){
		System.out.println("Cocuklariniz deneyimli egitmenlerle hem ogretici hem de eglendirici aktiviteler yaparken, sizler de yetiskin "
			+ " aktivitelerine uzman ve eglenceli animatorlerimiz esliginde katilabilirisiniz\n=========== ");
	     //Thread.sleep(2434);
		 kahvalti();
		 //Thread.sleep(2434);		
		 aksamYemegi();
		 //Thread.sleep(2434);
		 wifi();
	}
	
	@Override
	public void kahvalti() {
		System.out.println("Kahvaltilar 7.00-10.00 saatleri arasindadir.\n Cocuklarinizin da sevecegi menuler seflerimiz"
				+ " tarafindan ozenle ve hijyen kosullarina uyarak yapiliyor.\n==================");
		
	}

	@Override
	public void aksamYemegi() {
		System.out.println("Aksam yemegi 18.30-21.00 saatleri arasindadir. Haftanin belirli gunlerinde hem Dunya mutfagindan hem de yoresel"
				+ " lezzetlere doyacaksiniz.\n=====================");
		
	}

	@Override
	public void wifi() {
		System.out.println("Otelimiz sinirlari icersinde wi-fi ucretsizdir.\n===================");
		
	}
public void enrollList(int a) {
	data1.enrollAile(a);
	for(int i=0;i<a;i++) {
		System.out.println(data1.fam1.get(i).name+" "+data1.fam1.get(i).surName);
	}
	System.out.println("Oda numaraniz: " + roomNum+a);
	
}
}
