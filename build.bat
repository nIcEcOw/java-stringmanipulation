echo "This command will compile the source code and create package directory inside build folder.\n"
javac -d build src/org/companyname/java/stringmanipulation/StringCalculator.java src/org/companyname/java/App.java

echo "Now we will go to build folder and run our program."
cd build

echo "We are creating JAR file here"
jar -cfm ../stringcalculator.jar ../manifest.mf *

cd ..
REM java -classpath . org.companyname.java.App
java -jar stringcalculator.jar

pause