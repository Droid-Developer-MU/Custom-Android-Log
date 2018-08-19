# Custom-Android-Log
Custom log messages for android.


To get a Git project into your build:

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.KisanThapa:Custom-Android-Log:0.1.0'
	}


There are four functions are available for printing log messages:

    public void debug(String tag, String msg) {
    }

    public void info(String tag, String msg) {
    }

    public void error(String tag, String msg) {
    }

    public void verbose(String tag, String msg) {
    }
