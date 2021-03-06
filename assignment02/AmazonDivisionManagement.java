package assignment02;

public class AmazonDivisionManagement extends DivisionManagement {
	public AmazonDivisionManagement() {

		addDivision("AmazonFresh");
		addDivision("Vine.com");

		addDivision("Prime Music");
		addDivision("Prime Video");

		addDivision("Amazon Kindle");
		addDivision("Amazon Echo");

		addDivision("Amazon Music");
		addDivision("Amazon Appstore");

		addDivision("Amazon S3");
		addDivision("Amazon SQS");

		addLeads("AmazonFresh", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));
		addLeads("Vine.com", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));
		addLeads("Prime Music", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));
		addLeads("Prime Video", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));
		addLeads("Amazon Kindle", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));
		addLeads("Amazon Echo", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));
		addLeads("Amazon Music", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));
		addLeads("Amazon Appstore", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));
		addLeads("Amazon S3", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));
		addLeads("Amazon SQS", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthDate(1900, 2000)));



	}
}