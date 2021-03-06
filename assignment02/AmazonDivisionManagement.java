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

		addLeads("AmazonFresh", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));
		addLeads("Vine.com", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));
		addLeads("Prime Music", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));
		addLeads("Prime Video", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));
		addLeads("Amazon Kindle", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));
		addLeads("Amazon Echo", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));
		addLeads("Amazon Music", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));
		addLeads("Amazon Appstore", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));
		addLeads("Amazon S3", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));
		addLeads("Amazon SQS", new Person(NamesResources.getRandomFirstName(), NamesResources.getRandomLastName(), NamesResources.getRandomID(), NamesResources.getRandomBirthdate()));



	}
}