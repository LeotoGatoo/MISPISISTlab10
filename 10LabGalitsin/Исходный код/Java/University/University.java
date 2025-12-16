package University;

import java.util.ArrayList;
import java.util.List;

public class University {
	private List<Faculty> faculties;

	public University() {
		this.faculties = new ArrayList<>();
	}

	public void addFaculty(Faculty faculty) {
		this.faculties.add(faculty);
	}

	public void displayFaculties() {
		System.out.println("Факультеты университета:");
		for (Faculty f : faculties) {
			System.out.println("- " + f.getName());
			f.displayInstitutes();
		}
	}
}