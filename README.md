#JD-Eclipse

JD-Eclipse, a Java decompiler plug-in for the Eclipse platform.

![](http://jd.benow.ca/img/screenshot8.png)

- Java Decompiler projects home page: [http://jd.benow.ca](http://jd.benow.ca)
- Java Decompiler Wikipedia page: [http://en.wikipedia.org/wiki/Java_Decompiler](http://en.wikipedia.org/wiki/Java_Decompiler)
- JD-Eclipse source code: [https://github.com/java-decompiler/jd-eclipse](https://github.com/java-decompiler/jd-eclipse)

##Description
JD-Eclipse is a plug-in for the Eclipse platform. It allows you to 
display all the Java sources during your debugging process, even if 
you do not have them all.

##How to build JD-Eclipse ?
```
> gradle build installSiteDist
```
generate _"build/install/jd-eclipse-site"_

##How to install JD-Eclipse ?
1. Build or download & unzip _"jd-eclipse-site-x.y.z.zip"_,
2. Launch _Eclipse_,
3. Click on _"Help > Install New Software..."_,
4. Click on button _"Add..."_ to add an new repository,
5. Enter _"JD-Eclipse Update Site"_ and select the local site directory,
6. Check _"Java Decompiler Eclipse Plug-in"_,
7. Next, next, next... and restart.

##How to check the file associations ?
Click on _"Window > Preferences > General > Editors > File Associations"_
- _"*.class"_ : _"Eclipse Class File Viewer"_ is selected by default.
- _"*.class without source"_ : _"JD Class File Viewer"_ is selected by default.

##How to configure JD-Eclipse ?
Click on _"Window > Preferences > Java > Decompiler"_

##How to uninstall JD-Eclipse ?
1. Click on _"Help > About Eclipse > Installation Details"_,
2. Select _"JD-Eclipse Plug-in"_,
3. Click on _"Uninstall..."_.
