#ifndef UNIVERSITY_H
#define UNIVERSITY_H

class University {

private:
	List<Faculty> faculties;

public:
	University();

	void addFaculty(Faculty faculty);

	void displayFaculties();
};

#endif
