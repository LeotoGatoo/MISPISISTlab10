import University.*;

public class Main {
	public static void main(String[] args) {
		University university = new University();

		Employee dean = new AdministrativeEmployee(1, "Иван Петров", "dean@university.com");
		ResearchAssociate ra = new ResearchAssociate(2, "Мария Сидорова", "ra@university.com", "Computer Science");

		Faculty faculty = new Faculty("Факультет информатики", dean);

		Institute institute = new Institute("Институт искусственного интеллекта", "ул. Ленина, 1");
		institute.setResearchAssociate(ra);

		faculty.addInstitute(institute);
		university.addFaculty(faculty);

		university.displayFaculties();
	}
}