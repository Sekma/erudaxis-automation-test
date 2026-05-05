@ajouter_un_projet
Feature: ajouter un nouveau projet

ETQ utilisateur je veux acceder a la page liste des projets et cliquer sur ajouter un projet et remplire le formulaire afin d ajouter un nouveau projet

Scenario: ajouter un nouveau projet
Given je me connecte sur l application erudaxis
When je saisi un email "sekma.mohamed.hedi@gmail.com"
And je saisi un mot de passe "Hedi@2026!"
And je clique sur se connecter
And je clique sur la catégorie lycee
And cliquer sur gestion de projet
And cliquer sur le bouton ajouter un projet
And saisir le titre de projet "erudaxis-automation-qa"
And selectionner collaborateurs "sekma.mohamed.hedi@gmail.com"
And selectionner responsable "sekma.mohamed.hedi@gmail.com"
And saisir le text dans description "stage"
And cliquer sur le button ajouter
And cliquer sur le bouton ok
And saisir le titre de projet "erudaxis-automation-qa" dans le champ de recherche
Then le projet "erudaxis-automation-qa" est dans la liste