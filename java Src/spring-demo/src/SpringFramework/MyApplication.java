/**
 * 
 */
package SpringFramework;


/**
 * @author Krishnaveni
 *
 */
public class MyApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create the object
		Coach c = new TrackCoach();
		
		//Use the object
		System.out.println(c.getRegularWork());
	}

}
