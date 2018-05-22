cls
@echo off

chcp 1252>nul


REM goto DesinstalarManualTI
goto InstalarDirLog
REM goto DesinstalarDirLog


REM ================ Testes INstala��o Manual Manuten��o TI do menu de Windows: ========================================

call InstalarManualTI.bat
exit

REM ================ Testes DESinstala��o Manual Manuten��o TI do menu de Windows: ========================================

:DesinstalarManualTI
call DesinstalarManualTI.bat

IF %ERRORLEVEL% NEQ 0 (
    goto PULAR_MENSAGEM_SUCESSO
)
echo MSGBOX "Erro: este comando n�o foi pulado indevidamente!" > %temp%\TEMPmessage.vbs
call %temp%\TEMPmessage.vbs
del %temp%\TEMPmessage.vbs /f /q


:PULAR_MENSAGEM_SUCESSO
echo MSGBOX "Sucesso: o comando acima foi pulado devidamente!" > %temp%\TEMPmessage.vbs
call %temp%\TEMPmessage.vbs
del %temp%\TEMPmessage.vbs /f /q

exit

REM ================ Testes instala��o diret�rio de Log: ========================================

:InstalarDirLog
cd\
if not exist C:\ProgramData\ (
    echo MSGBOX "O diret�rio padr�o de Windows ProgramData n�o existe! Favor entrar em contato com o Suporte do Portal Cronos." > %temp%\TEMPmessage.vbs
    call %temp%\TEMPmessage.vbs
    del %temp%\TEMPmessage.vbs /f /q
    exit
)
cd ProgramData
if not exist C:\ProgramData\PortalCronos\ mkdir PortalCronos
cd PortalCronos
if not exist C:\ProgramData\PortalCronos\Logs\ mkdir Logs
cd Logs
if not exist C:\ProgramData\PortalCronos\Logs\Local\ mkdir Local
REM N�o precisa dar privil�gios mais, pois a Scheduled Task roda como SYSTEM

exit

REM ================ Testes DESinstala��o diret�rio de Log: ========================================

:DesinstalarDirLog
cd\
cd ProgramData
REM O seguinte n�o funciona como deveria: rmdir /s /q PortalCronos
cd PortalCronos
cd Logs
rmdir /s /q Local
cd\
cd ProgramData
cd PortalCronos
rmdir /s /q Logs
cd\
cd ProgramData
rmdir /s /q PortalCronos
cd\

exit

:FIM