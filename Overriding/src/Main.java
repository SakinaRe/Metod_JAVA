
public class Main {

	public static void main(String[] args) {
        BaseKrediManager[] KrediManager=new BaseKrediManager[] {new TarimKrediManager(),new OgretmenKrediManager(), new OgrenciKrediManager()};
        for(BaseKrediManager krediManagers:KrediManager) {
        	System.out.println(krediManagers.hesapla(1000));
        	
        
        	
        }
	}

}
