@modifier_password
Feature: accéder au formulaire et modifier le mot de passe

ETQ utilisateur je veux acceder au formulaire changer le mot de passe afin de modifier mon mot de passe

Background:
Given je me connecte sur l application erudaxis
When je saisi un email "sekma.mohamed.hedi@gmail.com"
And je saisi un mot de passe "Hedi@2026!"
And je clique sur se connecter
And je clique sur la catégorie lycee
When cliquer sur l icone utilisateur
When cliquer sur le bouton Parametres
When cliquer sur le bouton Mot De Passe

@modifier_password_valide
Scenario: accéder au formulaire et modifier le mot de passe valide
When saisir le Mot de passe actuel "Hedi@2026!"
When saisir Nouveau Mot de passe "Hedi@2026!"
When saisir Confirmer votre mot de passe "Hedi@2026!"
When cliquer sur le boutton changer le mot de passe
Then un popup s affiche "Succés"

@modifier_password_invalide
Scenario: accéder au formulaire et modifier le mot de passe invalide
When saisir le Mot de passe actuel "Hedi@2026???"
When saisir Nouveau Mot de passe "Hedi@2026!"
When saisir Confirmer votre mot de passe "Hedi@2026!"
When cliquer sur le boutton changer le mot de passe
Then un popup s affiche "Error"