#ifndef FACULTY_H
#define FACULTY_H

namespace University {
	class Faculty {

	public:
		String name;
		University::Employee dean;
	private:
		std::vector<Institute> institutes;

	public:
		Faculty(String name, University::Employee dean);

		void addInstitute(Institute institute);

		void displayInstitutes();
	};
}

#endif
