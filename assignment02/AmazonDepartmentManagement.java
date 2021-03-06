package assignment02;

public class AmazonDepartmentManagement extends DepartmentManagement {

	public AmazonDepartmentManagement(){
		addDepartment("Retail Goods");
		addDepartment("Amazon Prime");
		addDepartment("Consumer Electronics");
		addDepartment("Digital content");
		addDepartment("Amazon Web Services");

		addHead("Retail Goods", new Person("Doug", "Herrington", NamesResource.getRandomID(), NamesResource.getRandomBirthDate()));
		addHead("Amazon Prime", new Person("Gur", "Kimchi", NamesResource.getRandomID(), NamesResource.getRandomBirthDate()));
		addHead("Consumer Electronics", new Person("James", "Hamilton", NamesResource.getRandomID(), NamesResource.getRandomBirthDate()));
		addHead("Digital content", new Person("Michael", "Frazzini", NamesResource.getRandomID(), NamesResource.getRandomBirthDate()));
		addHead("Amazon Web Services", new Person("Doug", "Yeum", NamesResource.getRandomID(), NamesResource.getRandomBirthDate()));

		addDivisionToDepartment("Retail Goods", "AmazonFresh");
		addDivisionToDepartment("Retail Goods", "Vine.com");
		addDivisionToDepartment("Amazon Prime", "Prime Music");
		addDivisionToDepartment("Amazon Prime", "Prime Video");
		addDivisionToDepartment("Consumer Electronics", "Amazon Kindle");
		addDivisionToDepartment("Consumer Electronics", "Amazon Echo");
		addDivisionToDepartment("Digital content", "Amazon Music");
		addDivisionToDepartment("Digital content", "Amazon Appstore");
		addDivisionToDepartment("Amazon Web Services", "Amazon S3");
		addDivisionToDepartment("Amazon Web Services", "Amazon SQS");
	}
}