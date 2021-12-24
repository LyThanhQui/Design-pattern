package creational.abstractfactory;

public interface IBookStore {
	IDistributor GetDistributor();
	IAdvertiser GetAdvertiser(); 
}
