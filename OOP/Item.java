public class Item{
	private String name;
	private boolean stackable;

	public Item( String name, boolean stackable) {
		this.name = name;
		this.stackable=stackable;
	}

	public String getName(){
		return name;
	}
	public boolean getStackable(){
		return stackable;
	}
	public void setName(String newName){
		this.name=newName;
	}

	public String toString() {
		return "Name: " + this.name + ", Stackable: " + this.stackable;
	}
}