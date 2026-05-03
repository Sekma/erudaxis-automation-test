@ajouter_un_salaire
Feature: ajouter un nouveau projet cas valide

En tant qu utilisateur je veux cliquer sur le boutton Ajouter projet et remplire le formulaire afin d ajouter un nouveau projet

Scenario: ajouter un nouveau projet cas valide
Given je me connecte a l application erudaxis
When je saisi l email "siouarmejri@gmail.com"
When je saisi le password "Siwar@2026!"
When cliquer sur le bouton connecter
When cliquer sur categorie lycee
When je suis sur la page d acceuil "lycee"
When cliquer sur la rubrique Administration
When cliquer sur la rubrique Finances
When cliquer sur la sous rubrique charges
When cliquer sur la sous rubrique salaires
When cliquer sur le bouton Ajouter un salaire
When selectionner le nom et prenom "Mejri Siwar"
When selectionner le status "En cours"
When saisir la Date dembauche "01072026"
When saisir le salaire brute "3000"
When saisir leFrais d une journee d absence "150"
When cliquer sur le bouton ajouter
Then un popup s affiche "Succès"