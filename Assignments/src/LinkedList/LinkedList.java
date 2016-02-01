package LinkedList;

class LinkedList implements Interface

{

	class Element

	{

		private String s;

		private Element næste;

	}

	private Element første; // reference til det første element

	private Element aktuel; // reference til det aktuelle element



	public LinkedList()

	{

		første = aktuel = null;
		

	}

	// manøvrering

	public void tilFørste() // det akt. element sættes til første element

	{

		aktuel = første;

	}

	public void tilNæste() // det akt. element sættes til næste element

	{

		aktuel = aktuel.næste;

	}

	// værdimanipulation

	public void gem(String v) // værdien 'v' gemmes i det aktuelle element

	{

		aktuel.s = v;

	}

	public String hent() // værdien gemt i det aktuelle elt. returneres

	{

		return aktuel.s;

	}

	public void gemFørste(String v) // værdien 'v' gemmes i det første element

	{

		første.s = v;

	}

	// Klassen EnkeltHaegtetListe fortsat

	public String hentFørste() // værdien gemt i det første elt. returneres

	{

		return første.s;

	}

	// strukturmanipulation

	public void indsætFørste()// der indsættes et nyt element som første elt.

	{

		Element temp = new Element();

		temp.næste = første;

		første = temp;

	}

	public void indsætNæste() // der indsættes et nyt element som næste elt.

	{

		Element temp = new Element();

		temp.næste = aktuel.næste;

		aktuel.næste = temp;

	}

	public void sletFørste() // det første element slettes

	{

		første = første.næste;

	}


	public void sletNæste() // det næste element slettes

	{

		aktuel.næste = aktuel.næste.næste;

	}

	// status

	public boolean tom() // der testes på om listen er tom

	{
		if (første==null){
		return true;
}
		return false;
	}

	public boolean sidste() // der testes på om det akt. elt. er det sidste

	{

		return aktuel.næste == null;

	}

	public boolean fuld() // der testes på om der fysisk ikke er mere plads

	{

		return false; // vi forudsætter, at der plads nok i RAM!

	}

	@Override
	public void push(String e) {
		indsætFørste();
		gemFørste(e);
		
	}
	

	@Override
	public String pop() {
		String s = hentFørste();
		sletFørste();
		return s;
	}

	@Override
	public void vis() {
		
		while (tom()==false){
			
			System.out.println(pop());
			
		
		}
		// TODO Auto-generated method stub
		
	}

}