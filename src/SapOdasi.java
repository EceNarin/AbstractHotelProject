
public class SapOdasi extends Hotel{
	
	String name,surName;
	int roomNum=2000;
    public SapOdasi(String name, String surName) {
    	this.name = name;
    	this.surName = surName;
	}
   static HotelCustomData data2=new HotelCustomData();
	public SapOdasi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tanitim() throws InterruptedException  {
		Thread.sleep(2000);
		kahvalti();
		Thread.sleep(2000);
		aksamYemegi();
		Thread.sleep(2000);
		wifi();
	}
   	@Override
	public void kahvalti() {
		System.out.println("Sabah kahvaltisi 7-10.00 saatleri arasindandir");
		System.out.println("Otelimizin pub'inda her gece ozel davetli dj'ler ile kalabaliga karisabilirsniz\n===========");
	
	}

	@Override
	public void aksamYemegi() {
		System.out.println("Aksam yemegii 19.00-21.00 arasindadir\n================");
		
	}

	@Override
	public void wifi() {
		System.out.println("Konaklama boyunca Wi-fi ucretsizdir\n=============");
		
	}
	public void enrolList(int a)  {
		data2.enrollSingle(a);
		for(int i=0;i<a;i++) {
			System.out.println(data2.sing1.get(i).name+" "+data2.sing1.get(i).surName);
		}
		System.out.println("Oda numaraniz: " +roomNum+a);
		
	}

}
