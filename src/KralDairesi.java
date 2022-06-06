import java.util.Scanner;

public class KralDairesi extends Hotel  {
	Scanner scan=new Scanner(System.in);
	 static HotelCustomData data=new HotelCustomData();
	
	String name;
	String surName;
	int roomNum=3000;
public KralDairesi() {
}

public KralDairesi(String name, String surName) {
	this.name = name;
	this.surName = surName;
}
public  void enrolList(int x)  {
	data.enrollKing(x);
	for(int i=0;i<x;i++) {
		System.out.println(data.kr.get(i).name+" "+data.kr.get(i).surName);
	}
	System.out.println("Oda numaraniz: " + roomNum+x);
}
@Override
	public void tanitim() throws InterruptedException {
		Thread.sleep(2000);
		kahvalti();
		Thread.sleep(2000);
		aksamYemegi();
		Thread.sleep(2000);
		wifi();
	}
	//Hotel hotel=new AileOdasi();
	@Override
	public void kahvalti() {
		System.out.println("Kahvalti disinda atistirmalik ve branch servisimiz vardir odaniza. Odaya cünkü fakir gorup"
				+ " bir tarafi sismesin\n===============");
		
	}
	@Override
	public void aksamYemegi() {
		System.out.println("Aksam yemeginde siz isteyin sefimiz elleriyle beslesin, Allah sizin gibi musteriyi basimizdan eksik etmesin"
				+ "\n======================");
		
	}
	@Override
	public void wifi() {
		System.out.println("Isterseniz modemi odaniza koyalim en iyi hizmet sizin hakkiniz, bu da sizin farkiniz :)\n=================");
		
	}

	
}
