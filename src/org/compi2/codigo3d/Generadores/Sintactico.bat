SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_45\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\C45ASP4311F\Dropbox\Ingenieria\Compiladores 2\HT2_201318666\MakerC3D-master\src\org\compi2\codigo3d\parser
java -jar C:\Users\C45ASP4311F\Documents\NetBeansProjects\LibreriasJflexCup\java-cup-11b.jar -parser parser -symbols sym sintactico.cup
pause
