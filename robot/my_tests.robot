*** Settings ***
Library    Remote     http://127.0.0.1:8270/mylib      WITH NAME   FancyLib

*** Test Cases ***
Test Remote Libs
    Generate Western Name    Timo    Soini
    ${value}    Make It Double    16
    Should Be Equal As Integers    ${value}    32


