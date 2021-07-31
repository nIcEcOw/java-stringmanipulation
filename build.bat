set MYFILE=stringcalculator.jar

echo "This command will compile the source code and create package directory inside build folder.\n"
javac -d build -classpath .;./build/* src/org/companyname/java/stringmanipulation/StringCalculator.java src/org/companyname/java/App.java

if exist %MYFILE% del /f %MYFILE%

echo "Now we will go to build folder and run our program."
cd build

echo "We are creating JAR file here"
jar -cfm ../%MYFILE% ../manifest.mf *

cd ..
REM java -classpath . org.companyname.java.App
java -jar %MYFILE%

pause