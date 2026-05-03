@modifier_password_verification
Feature: modifier le mot de passe et verifier l acces

ETQ utilisateur je veux modifier le mot de passe et verifier l acces

Background:
Given je me connecte sur l application erudaxis
When je saisi un email "sekma.mohamed.hedi@gmail.com"

Scenario: modifier mot de passe
And je saisi un mot de passe "Hedi@2026!"
And je clique sur se connecter
And je clique sur la catégorie lycee
When cliquer sur l icone utilisateur
When cliquer sur le bouton Parametres
When cliquer sur le bouton Mot De Passe
When saisir le Mot de passe actuel "Hedi@2026!"
When saisir Nouveau Mot de passe "Hedi@2026?"
When saisir Confirmer votre mot de passe "Hedi@2026?"
When cliquer sur le boutton changer le mot de passe
Then un popup s affiche "Succés"

Scenario: verifier nouveau mot de passe correct
And je saisi un mot de passe "Hedi@2026?"
And je clique sur se connecter
And je clique sur la catégorie lycee
Then la page d acceuil de la categorie "lycee" s affiche

Scenario: verifier ancien mot de passe incorrect
And je saisi un mot de passe "Hedi@2026!"
And je clique sur se connecter
Then un message s affiche "les informations d'identification invalides"
