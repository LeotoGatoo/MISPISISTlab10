#ifndef COURSE_H
#define COURSE_H

namespace University {
	class Course {

	public:
		String name;
		int id;
		float hours;

		Course(String name, int id, float hours);

		java::lang::String toString();
	};
}

#endif
