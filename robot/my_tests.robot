*** Settings ***
Library    Remote     http://localhost:8270/

*** Test Cases ***
Test Remote Lib
    ${my_int}    Square Integer    3
    Should Be Equal As Integers    ${my_int}    9


