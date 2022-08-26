Feature: La fonctionnalité d authentification dOrange HRM


Scenario Outline: Authentification a Orange HRM avec les credentials Valides du profil Admin

Given admin navige vers l url d orange hrm

When admin se connecte verc un correct "<username>" et un correct "<password>" 

Then la connection est effectuee  et la page dashbord est affichee

Examples:

|username|password|
|Admin   |admin123|
|Admik   |admin123|
|Admij   |admin123|
|Admif   |admin123|
|Admiy   |admin123|
|Admii   |admin123|