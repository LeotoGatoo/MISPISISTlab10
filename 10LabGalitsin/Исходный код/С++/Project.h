#ifndef PROJECT_H
#define PROJECT_H

namespace University {
	class Project {

	public:
		String name;
		java::util::Date start;
		java::util::Date end;
		int hours;

		java::lang::String toString();

		Project(String name, java::util::Date start, java::util::Date end, int hours);
	};
}

#endif
