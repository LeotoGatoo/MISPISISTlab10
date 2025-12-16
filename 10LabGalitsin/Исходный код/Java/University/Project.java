package University;

public class Project {
	public String name;
	public java.util.Date start;
	public java.util.Date end;
	public int hours;

	public Project(String name, java.util.Date start, java.util.Date end, int hours) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.hours = hours;
	}

	@Override
	public java.lang.String toString() {
		return name + " (" + start + " - " + end + ", " + hours + " часов)";
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public java.util.Date getStart() { return start; }
	public void setStart(java.util.Date start) { this.start = start; }
	public java.util.Date getEnd() { return end; }
	public void setEnd(java.util.Date end) { this.end = end; }
	public int getHours() { return hours; }
	public void setHours(int hours) { this.hours = hours; }
}