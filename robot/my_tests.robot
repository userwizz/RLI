*** Settings ***
Library    Remote     http://127.0.0.1:8270/mylib      WITH NAME   FancyLib
Suite Teardown    Stop Remote Server


*** Test Cases ***
Test Remote Lib
    Generate Western Name    Timo    Soini
    ${value}    Make It Double    16
    Should Be Equal As Integers    ${value}    32


