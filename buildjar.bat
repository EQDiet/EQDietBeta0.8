@echo off
pushd target\classes
if not exist META-INF (mkdir META-INF)
echo Manifest-Version: 1.0>META-INF\MANIFEST.MF
echo Class-Path: .>>META-INF\MANIFEST.MF
echo Main-Class: EQDietBeta08>>META-INF\MANIFEST.MF
if not exist ..\..\Release (mkdir ..\..\Release)
jar cvmf META-INF\MANIFEST.MF ..\..\Release\EQDietBeta0.8.jar *.class
popd
exit /B
