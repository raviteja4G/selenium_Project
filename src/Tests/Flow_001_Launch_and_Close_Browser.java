package Tests;

import Lib.uihelper;

public class Flow_001_Launch_and_Close_Browser {
	
	public static void main(String[] args) {
		
		uihelper.launchUrl("https://www.google.com");
		uihelper.closer();
	}

}
