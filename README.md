# Links

* <a href="https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html">creating a project</a> and <a href="https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html">standard project structure</a>
* <code>mvn -Dtest=SeleniumTest test</code> - run single file <a href="https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html">source</a>
* to configure test running thru **testng.xml** needs to change **plugin** configuration in **pom.xml** <a href="https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html">source</a>
* <code>mvn test -PRegression</code> - run specific profile (certain TestNG xml file), to create profiles needs to create **profiles** tag in **pom.xml** <a href="https://maven.apache.org/guides/introduction/introduction-to-profiles.html">source</a>