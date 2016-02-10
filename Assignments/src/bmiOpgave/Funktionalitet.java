package bmiOpgave;

public class Funktionalitet implements IFunktionalitet {

	public Funktionalitet() {
		// TODO Auto-generated constructor stub
	}
private Data d= new Data();
	@Override
	public double getBMI(String cpr) {
		return (d.getVaegt(cpr))/(d.getHoejde(cpr)*d.getHoejde(cpr));
	}

	@Override
	public String getTextualBMI(String cpr) {
		return (""+(d.getVaegt(cpr))/(d.getHoejde(cpr)*d.getHoejde(cpr)));
	}

	@Override
	public String getNavn(String cpr) {
		return d.getNavn(cpr);
	}

}
