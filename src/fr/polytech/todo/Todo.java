package fr.polytech.todo;

public class Todo {

	
	private long id;
	private String name;
	private String description;
	
	
	public Todo(long id, String name, String desc){
		this.id=id;
		this.name=name;
		this.description=desc;
		
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "["+ id + "]" + name +" : " + description;
	}
	
	
	public static void main(String[] args){
		Todo t1 = new Todo(59,"Acheter le lait","En sortant ce soir prendre 1L d'écrémé");
		System.out.println(t1);
		
	}
}


