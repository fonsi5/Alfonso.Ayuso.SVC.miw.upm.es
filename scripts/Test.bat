@echo off
set workspace=D:\Master\WORKSPACE_JAVA\Alfonso.Ayuso.SVC.miw.upm.es
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
set M2_HOME=C:\apache-maven-3.3.9
set PATH=%PATH%;%JAVA_HOME%\bin;%M2_HOME%\bin
::echo saca por pantalla un mensaje
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo JAVA_HOME --- %JAVA_HOME%
echo M2_HOME   --- %M2_HOME%
echo .
::Meto esta linea ya que mi entorno se encuentra en una unidad distinta a C:
D:
cd %workspace%
echo ============ mvn clean test -Denvironment.type=develop (profile: develop) =======================================================
echo .
call mvn clean test -Denvironment.type=develop
pause

