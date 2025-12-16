#ifndef INSTITUTE_H
#define INSTITUTE_H

class Institute {

public:
	String name;
	String address;
	ResearchAssociate researchAssociate;

	Institute(String name, String address);

	String toString();
};

#endif
