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

		addLeads("AmazonFresh", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));
		addLeads("Vine.com", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));
		addLeads("Prime Music", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));
		addLeads("Prime Video", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));
		addLeads("Amazon Kindle", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));
		addLeads("Amazon Echo", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));
		addLeads("Amazon Music", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));
		addLeads("Amazon Appstore", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));
		addLeads("Amazon S3", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));
		addLeads("Amazon SQS", new Person(NamesResource.getRandomFirstName(), NamesResource.getRandomLastName(), NamesResource.getRandomID(), NamesResource.getRandomBirthdate()));



	}
}