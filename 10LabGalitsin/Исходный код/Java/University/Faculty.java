package University;

import java.util.*;

public class Faculty {
	public String name;
	public Employee dean;
	private Collection<Institute> institutes;

	public Faculty(String name, Employee dean) {
		this.name = name;
		this.dean = dean;
		this.institutes = new ArrayList<>();
	}

	public void addInstitute(Institute institute) {
		this.institutes.add(institute);
	}

	public void displayInstitutes() {
		System.out.println("  Институты факультета '" + name + "':");
		for (Institute inst : institutes) {
			System.out.println("    - " + inst.getName() + " (" + inst.getAddress() + ")");
			if (inst.researchAssociate != null) {
				System.out.println("      Научный сотрудник: " + inst.researchAssociate.getName());
			}
		}
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public Employee getDean() { return dean; }
	public void setDean(Employee dean) { this.dean = dean; }
}