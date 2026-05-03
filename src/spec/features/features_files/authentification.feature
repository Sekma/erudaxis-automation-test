@authentification
Feature: s authentifier avec des données valides

ETQ utilisteur je veux accéder à l application erudaxis et me connecter afin de m accéder a la page d accueill

Background:
Given je me connecte sur l application erudaxis

@authentification_valide
Scenario: s authentifier avec des données valides
When je saisi un email "sekma.mohamed.hedi@gmail.com"
And je saisi un mot de passe "Hedi@2026!"
And je clique sur se connecter
And je clique sur la catégorie lycee
Then la page d acceuil de la categorie "lycee" s affiche

@authentification_mail_invalide
Scenario: s authentifier avec un email invalide et un mot de passe valide
When je saisi un email "sekma.mohamed.hedi@gmail.tn"
And je saisi un mot de passe "Hedi@2026!"
And je clique sur se connecter
Then un message s affiche "les informations d'identification invalides"

@authentification_password_invalide
Scenario: s authentifier avec un email valide et un mot de passe invalide
When je saisi un email "sekma.mohamed.hedi@gmail.com"
And je saisi un mot de passe "Hedi@2026!!??"
And je clique sur se connecter
Then un message s affiche "les informations d'identification invalides"