package University;

public class Course {
	public String name;
	public int id;
	public float hours;

	public Course(String name, int id, float hours) {
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return name + " (ID: " + id + ", " + hours + " часов)";
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public float getHours() { return hours; }
	public void setHours(float hours) { this.hours = hours; }
}