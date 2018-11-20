# JD-Eclipse

JD-Eclipse, a Java decompiler plug-in for the Eclipse platform.

![](http://jd.benow.ca/img/screenshot8.png)

- Java Decompiler projects home page: [http://jd.benow.ca](http://jd.benow.ca)
- Java Decompiler Wikipedia page: [http://en.wikipedia.org/wiki/Java_Decompiler](http://en.wikipedia.org/wiki/Java_Decompiler)
- JD-Eclipse source code: [https://github.com/java-decompiler/jd-eclipse](https://github.com/java-decompiler/jd-eclipse)

## Description
JD-Eclipse is a plug-in for the Eclipse platform. It allows you to
display all the Java sources during your debugging process, even if
you do not have them all.

## How to build JD-Eclipse ?
### With Gradle:
```
> ./gradlew installSiteDist
```
generate _"build/install/jd-eclipse-site"_

### With Maven:
```
> mvn clean package
```
creates _"jd.ide.eclipse.site/target/repository"_

creates zipped version _"jd.ide.eclipse.site/target/jd.ide.eclipse.site-VERSION.zip"_

#### Download current p2 Repository version for eclipse: [jd.ide.eclipse.site-1.0.0-SNAPSHOT.zip](jd.ide.eclipse.site/jd.ide.eclipse.site-1.0.0-SNAPSHOT.zip)

### With Eclipse:
- Download dependencies
```
> ./gradlew downloadDependencies
```
- Launch _Eclipse_,
- Import the 3 _"Existing Projects into Workspace"_ by selecting the parent project folder,
- Export _"Deployable features"_,
- Copy _"site.xml"_ to the destination directory.

## How to install JD-Eclipse ?
1. Build or download & unzip _"jd-eclipse-site-x.y.z.zip"_,
2. Launch _Eclipse_,
3. Click on _"Help > Install New Software..."_,
4. Click on button _"Add..."_ to add an new repository,
5. Enter _"JD-Eclipse Update Site"_ and select the local site directory,
6. Check _"Java Decompiler Eclipse Plug-in"_,
7. Next, next, next... and restart.

## How to check the file associations ?
Click on _"Window > Preferences > General > Editors > File Associations"_
- _"*.class"_ : _Eclipse_ _"Class File Viewer"_ is selected by default.
- _"*.class without source"_ : _"JD Class File Viewer"_ is selected by default.

## How to configure JD-Eclipse ?
Click on _"Window > Preferences > Java > Decompiler"_

## How to uninstall JD-Eclipse ?
1. Click on _"Help > About Eclipse > Installation Details"_,
2. Select _"JD-Eclipse Plug-in"_,
3. Click on _"Uninstall..."_.



