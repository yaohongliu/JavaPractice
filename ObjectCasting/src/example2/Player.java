package example2;

public class Player {
	private int id;
	private String name;
	
	public Player() {
		
	}
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Player [id= " +id+", name = "+name+"]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		boolean b = false;
		Player p2 = (Player)obj;
		if(this.id == p2.id)
			b = true;
		return b;
	}*/
	
	
}

