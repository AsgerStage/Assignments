package bmiOpgave;

public class Funktionalitet implements IFunktionalitet {
private IData d;
	public Funktionalitet(IData Idata) {
		this.d=Idata;
	}

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
