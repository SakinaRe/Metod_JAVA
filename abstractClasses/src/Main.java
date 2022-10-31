
public class Main {

	public static void main(String[] args) {
  
		  WomanGameCalculator womangamecalculator=new WomanGameCalculator();
		  womangamecalculator.hesapla();
		  womangamecalculator.gameOver();
		  
		  
		  GameCalculator gamecalculator=new GameCalculator(){
			  @Override
			  public void hesapla() {
				  
			  }
		  };
	}

}
