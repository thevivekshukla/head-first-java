//example for inheritance


class Doctor
{
	boolean worksAtHospital;

	void treatPatient() {

	}
}


class FamilyDoctor extends Doctor
{
	boolean makeHouseCalls;
	void giveAdvice() {

	}
}


class Surgeon extends Doctor
{
	void treatPatient() {

	}

	void makeIncision() {

	}
}