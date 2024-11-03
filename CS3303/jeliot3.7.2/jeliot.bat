IF EXIST jre\bin\java.exe GOTO JeliotJRE

:JeliotCommon
javaw -Xmx256m -jar jeliot.jar %1 %2 %3
GOTO END

:JeliotJRE
jre\bin\javaw -Xmx256m -jar jeliot.jar %1 %2 %3

:END