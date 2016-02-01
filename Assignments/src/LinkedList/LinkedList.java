package LinkedList;

class LinkedList implements Interface

{

	class Element

	{

		private String s;

		private Element n�ste;

	}

	private Element f�rste; // reference til det f�rste element

	private Element aktuel; // reference til det aktuelle element



	public LinkedList()

	{

		f�rste = aktuel = null;
		

	}

	// man�vrering

	public void tilF�rste() // det akt. element s�ttes til f�rste element

	{

		aktuel = f�rste;

	}

	public void tilN�ste() // det akt. element s�ttes til n�ste element

	{

		aktuel = aktuel.n�ste;

	}

	// v�rdimanipulation

	public void gem(String v) // v�rdien 'v' gemmes i det aktuelle element

	{

		aktuel.s = v;

	}

	public String hent() // v�rdien gemt i det aktuelle elt. returneres

	{

		return aktuel.s;

	}

	public void gemF�rste(String v) // v�rdien 'v' gemmes i det f�rste element

	{

		f�rste.s = v;

	}

	// Klassen EnkeltHaegtetListe fortsat

	public String hentF�rste() // v�rdien gemt i det f�rste elt. returneres

	{

		return f�rste.s;

	}

	// strukturmanipulation

	public void inds�tF�rste()// der inds�ttes et nyt element som f�rste elt.

	{

		Element temp = new Element();

		temp.n�ste = f�rste;

		f�rste = temp;

	}

	public void inds�tN�ste() // der inds�ttes et nyt element som n�ste elt.

	{

		Element temp = new Element();

		temp.n�ste = aktuel.n�ste;

		aktuel.n�ste = temp;

	}

	public void sletF�rste() // det f�rste element slettes

	{

		f�rste = f�rste.n�ste;

	}


	public void sletN�ste() // det n�ste element slettes

	{

		aktuel.n�ste = aktuel.n�ste.n�ste;

	}

	// status

	public boolean tom() // der testes p� om listen er tom

	{
		if (f�rste==null){
		return true;
}
		return false;
	}

	public boolean sidste() // der testes p� om det akt. elt. er det sidste

	{

		return aktuel.n�ste == null;

	}

	public boolean fuld() // der testes p� om der fysisk ikke er mere plads

	{

		return false; // vi foruds�tter, at der plads nok i RAM!

	}

	@Override
	public void push(String e) {
		inds�tF�rste();
		gemF�rste(e);
		
	}
	

	@Override
	public String pop() {
		String s = hentF�rste();
		sletF�rste();
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