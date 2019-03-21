# mvvm-code
Android MVVM 


### Running App in Android Studio


```
* Import the project into the android studio
* In right side of the android studio you will find gradle tab, Click on it
* Click on MvvmCode -> :app -> Tasks -> install -> installDebug
* Which will generate the apk and will be installed on the connected device


### SonarQube server installation
* Download SonarQube here.
* Extract your sonarqube-{version}.zip
* Inside $SONAR_DOWNLOAD_DIR/sonarqube-{version}/bin you can see all the SO distributions:
* Run sonar.sh file manually
* Now you should see an empty dashboard in your http://localhost:9000

### SonarQube and Jacoco Task Run 
* Task sonarqube --> gradlew sonarqube
* Task jacocoTestReport --> gradlew jacocoTestReport
* After Successfull execution check in your http://localhost:9000
