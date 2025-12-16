#ifndef RESEARCHASSOCIATE_H
#define RESEARCHASSOCIATE_H

namespace University {
	class ResearchAssociate : University::Employee {

	public:
		String fieldOfStudy;

		ResearchAssociate(int ssn, String name, String email, String fieldOfStudy);
	};
}

#endif
