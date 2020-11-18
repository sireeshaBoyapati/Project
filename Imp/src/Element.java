

public class Element
{
	int id;

	public Element(int id) 
	{
		this.id = id;
	}
	
	public int compareTo(Object obj)
	{
		Element e = (Element)obj;
		return this.id-e.id;		
	}

	@Override
	public String toString() {
		return "" + this.id ;
	}
	
	
}
