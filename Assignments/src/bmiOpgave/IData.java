package bmiOpgave;

public interface IData {
	

	public String getNavn(String cpr) throws DataException;
	
	public double getVaegt(String cpr) throws DataException;
	
	public double getHoejde(String cpr) throws DataException;
	

}
