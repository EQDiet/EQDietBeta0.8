# EQDiet Beta 0.8
EQDiet: Free Open-source Healthy Diet App

Welcome to EQDiet Beta 0.8. Hope you enjoy using our app! You can visit our website [here](https://eqdiet.weebly.com)

To know more about this release, visit [this link](https://eqdiet.weebly.com/release-notes/released-eqdiet-beta-08)

![Image of EQDiet](https://eqdiet.weebly.com/uploads/1/2/2/7/122786941/eqdiet_orig.png)

## Building source code:

### Requirements:

- Java SE Development Kit (JDK) >= 1.8. Click [here](https://bit.ly/javadevelopmentkit) if you don't have it.

### Build status:

[![Java CI with Maven](https://github.com/EQDiet/EQDietBeta0.8/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/EQDiet/EQDietBeta0.8/actions?query=workflow%3A%22Java+CI+with+Maven%22) [![Java CI with Maven Wrapper](https://github.com/EQDiet/EQDietBeta0.8/workflows/Java%20CI%20with%20Maven%20Wrapper/badge.svg)](https://github.com/EQDiet/EQDietBeta0.8/actions?query=workflow%3A%22Java+CI+with+Maven+Wrapper%22)
### Procedure:

1. Set Java JDK bin folder to PATH. View [this video](https://www.youtube.com/watch?v=vhBNV8no4CI) if you don't know how to do it (only Windows).
2. Set JAVA_HOME variable. This is the path to your java folder (e.g. `C:\Program files\Java\jdk1.8.0_251`). BE CAREFUL! It's not the bin folder (e.g. It's NOT: `C:\Program files\Java\jdk1.8.0_251\bin`). It's HIGHLY recommended to create it in the global variables as shown on the video at the step 1, but you can set it temporarily at command prompt or terminal with the `set` command.
3. Download source code by clicking "clone or download" button or by running this command:                          
`git clone https://github.com/EQDiet/EQDietBeta0.8.git` (Only if you have GIT installed)
4. Extract the files to any folder.
5. Open command prompt or terminal.
6. Go to the destination folder you have extracted the files.
7. ONLY FOR LINUX USERS. Run `chmod +x mvnw` to get gradlew execution permission
8. Run `mvnw.bat install` on Windows or `./mvnw install` on Linux. This is the full compilation method and we recommend it. However, you can run `mvnw.bat compile` on Windows or `./mvnw compile` on Linux for a quick compilation method.
9. Run `buildjar.bat` on Windows or `chmod +x buildjar && ./buildjar` on Linux to generate the JAR file (at the Release folder)
10. Download Launch4j through [this link](https://eqdiet.weebly.com/uploads/1/2/2/7/122786941/launch4j-3.12-win32.exe)
11. Coming soon...

### Note this project is protected by the MIT License. You can read it [here](https://github.com/EQDiet/EQDietBeta0.8/blob/master/LICENSE).
#### © 2020, EQDiet.
