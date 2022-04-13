import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void nativeAppAndroid() {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
	}

	@Test
	public void nativeAppIOS() {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
	}
}
