# JD-Eclipse

JD-Eclipse, a Java decompiler plug-in for the Eclipse platform.

![](https://raw.githubusercontent.com/java-decompiler/jd-eclipse/master/src/website/img/jd-eclipse.png)

- Java Decompiler projects home page: [http://java-decompiler.github.io](http://java-decompiler.github.io)
- JD-Eclipse source code: [https://github.com/java-decompiler/jd-eclipse](https://github.com/java-decompiler/jd-eclipse)

## Description
JD-Eclipse is a plug-in for the Eclipse platform. It allows you to 
display all the Java sources during your debugging process, even if 
you do not have them all.

## How to build JD-Eclipse ?
```
> git clone https://github.com/java-decompiler/jd-eclipse.git
> cd jd-eclipse
> ./gradlew build
```
generate _"build/distributions/jd-eclipse-x.y.z.zip"_

## How to install JD-Eclipse ?
1. Build or download _"jd-eclipse-x.y.z.zip"_,
2. Launch _Eclipse_,
3. Click on _"Help > Install New Software..."_,
4. Drag and drop _"jd-eclipse-x.y.z.zip"_ on dialog windows,
5. Check _"Java Decompiler Eclipse Plug-in"_,
6. Click on "Next" and "Finish" buttons.
7. A warning dialog windows appear because _"org.jd.ide.eclipse.plugin_x.y.z.jar"_ is not signed. Click on "Install anyway" button.

![](https://raw.githubusercontent.com/java-decompiler/jd-eclipse/master/src/website/img/install_anyway.png)

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

## License
Released under the [GNU GPL v3](LICENSE).

## Donations
Did JD-GUI help you to solve a critical situation? Do you use JD-Eclipse daily? What about making a donation?

[![paypal](https://raw.githubusercontent.com/java-decompiler/jd-eclipse/master/src/website/img/btn_donate_euro.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=C88ZMVZ78RF22) [![paypal](https://raw.githubusercontent.com/java-decompiler/jd-eclipse/master/src/website/img/btn_donate_usd.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=CRMXT4Y4QLQGU)
