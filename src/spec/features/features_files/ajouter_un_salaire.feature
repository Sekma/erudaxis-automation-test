@ajouter_un_salaire
Feature: ajouter un salaire

ETQ utilisateur je veux acceder a la page liste des salaires afin d ajouter un nouveau projet

Scenario: ajouter un salaire
Given je me connecte sur l application erudaxis
When je saisi un email "sekma.mohamed.hedi@gmail.com"
And je saisi un mot de passe "Hedi@2026!"
And je clique sur se connecter
And je clique sur la catégorie lycee
And cliquer sur administration
And cliquer sur finances
And cliquer sur charges
And cliquer sur salaires
And cliquer sur le bouton ajouter un salaire
And selectionner le nom et prenom "Sekma Med Hedi"
And selectionner le status "En cours"
And saisir la date d embauche "01072026"
And saisir le salaire brute "4500"
And saisir le frais d une journee d absence "200"
And cliquer sur le bouton ajouter
And cliquer sur le bouton ok
Then "Sekma Med Hedi" est dans la liste