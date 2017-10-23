@echo off

set SCRIPT="%TEMP%\%RANDOM%-%RANDOM%-%RANDOM%-%RANDOM%.vbs"

echo Set oWS = WScript.CreateObject("WScript.Shell") >> %SCRIPT%
echo sLinkFile = "%USERPROFILE%\Desktop\Lab 8 - Biomedical Forensics Lab.lnk" >> %SCRIPT%
echo Set oLink = oWS.CreateShortcut(sLinkFile) >> %SCRIPT%
echo oLink.TargetPath = "%CD%\Lab 8 - Biomedical Forensics Lab.jar" >> %SCRIPT%
echo oLink.WorkingDirectory = "%CD%\" >> %SCRIPT%
echo oLink.IconLocation = "%CD%\src\eg_logo.ico" >> %SCRIPT%
echo oLink.Save >> %SCRIPT%

cscript /nologo %SCRIPT%
del %SCRIPT%