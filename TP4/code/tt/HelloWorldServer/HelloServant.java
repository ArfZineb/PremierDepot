package HelloWorldServer;
import org.omg.CORBA.ORB;
import HelloWorldApp.HelloPOA;
public class HelloServant extends HelloPOA {
	private String message ="hello world";
	private ORB orb; 
	public void setOrb(ORB orb = orb) {
		this.orb=orb;
		
	}
	@Override 
	public String HelloMessage() {
		
	}
	@Override 
	public void HelloMessage(String newHelloMessage) {
		message = newHelloMessage ;
	}
	

}
