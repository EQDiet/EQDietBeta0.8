# EQDiet Beta 0.8
EQDiet: Free Open-source Healthy Diet App

Welcome to EQDiet Beta 0.8. Hope you enjoy using our app! You can visit our website [here](https://eqdiet.weebly.com)

To know more about this release, visit [this link](https://eqdiet.weebly.com/release-notes/released-eqdiet-beta-08)

[![Image of EQDiet](https://eqdiet.weebly.com/uploads/1/2/2/7/122786941/eqdiet_orig.png)](#)

## Building source code:

### Requirements:

- Java SE Development Kit (JDK) >= 1.8. Click [here](https://bit.ly/javadevelopmentkit) if you don't have it.

### Build status:

[![Java CI with Maven](https://github.com/EQDiet/EQDietBeta0.8/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/EQDiet/EQDietBeta0.8/actions?query=workflow%3A%22Java+CI+with+Maven%22) [![Java CI with Maven Wrapper](https://github.com/EQDiet/EQDietBeta0.8/workflows/Java%20CI%20with%20Maven%20Wrapper/badge.svg)](https://github.com/EQDiet/EQDietBeta0.8/actions?query=workflow%3A%22Java+CI+with+Maven+Wrapper%22)
### Procedure:

1. Set Java JDK bin folder to PATH. View [this video](https://www.youtube.com/watch?v=vhBNV8no4CI) if you don't know how to do it (only Windows).
2. Download source code by clicking "clone or download" button or by running this command:                          
`git clone https://github.com/EQDiet/EQDietAlpha0.25.git` (Only if you have GIT installed)
3. Extract the files to any folder.
4. Open command prompt or terminal.
5. Go to the destination folder you have extracted the files.
6. ONLY FOR LINUX USERS. Run `chmod +x gradlew` to get gradlew execution permission
7. Run `gradlew.bat build` on Windows or `./gradlew build` on Linux. This is the full compilation method and we recommend it. However, you can run `gradlew.bat app:assembleDebug` on Windows or `./gradlew app:assembleDebug` on Linux for a quick compilation method. Ignore all warnings that will appear.
8. Go to app → build → outputs → apk → debug.
9. Find `app-debug.apk` file. That's EQDiet Alpha Mobile apk! Now go to an Android mobile phone to test it.

- Remember that the compiler that is included in this project will be getting older and outdated. You can upgrade the Gradle compiler by runing this command: `gradlew wrapper --gradle-version=[version number]`. Replace [verion number] with Gradle's latest version. ATTENTION: Do not upgrade to Gradle 7.0 when this is released.

### Note this project is protected by the MIT License. You can read it [here](https://github.com/EQDiet/EQDietAlphaMobile0.1/blob/master/LICENSE).
#### © 2020, EQDiet.
