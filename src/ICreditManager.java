
public interface ICreditManager {
	
	void Calculate();
	
	void Save();

}

abstract class BaseCreditManager implements ICreditManager {
	public abstract void Calculate() ;
		
	public  virtual void Save() {
		System.out.println("Kaydedildi");
	}
	
}
