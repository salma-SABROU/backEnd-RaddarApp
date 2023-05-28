# backEnd-RaddarApp

Le présente application décrit la conception d'un système distribué basé sur des micro-services, ayant pour objectif la gestion et l'automatisation du processus des infractions liées aux dépassements de vitesse détectés par des radars automatiques. Le système est composé de trois micro-services interconnectés, chacun jouant un rôle spécifique dans le processus global.

## Description des micro-services :

  1-	Micro-service de gestion des radars :
Chaque radar est identifié par un identifiant unique.
Les informations associées à un radar comprennent sa vitesse maximale autorisée et ses coordonnées géographiques (longitude et latitude).

  2-	Micro-service d'immatriculation des véhicules :
Ce micro-service permet la gestion des véhicules appartenant à des propriétaires.
Chaque véhicule est lié à un unique propriétaire.
Les propriétaires sont identifiés par un identifiant unique et possèdent des informations telles que leur nom, leur date de naissance et leurs coordonnées email.
Les véhicules sont définis par un identifiant unique, un numéro de matricule, une marque, une puissance fiscale et un modèle.
  3-	Micro-service de gestion des infractions :

Ce micro-service est chargé de la gestion des infractions liées aux dépassements de vitesse.
Chaque infraction est identifiée par un identifiant unique et contient les informations suivantes : date de l'infraction, identifiant du radar à l'origine de la détection, numéro de matricule du véhicule concerné, vitesse du véhicule au moment de l'infraction, vitesse maximale autorisée par le radar et montant de l'infraction.

## Fonctionnalités du système : 
En plus des opérations classiques de consultation et de modification des données, le système offre les fonctionnalités suivantes :
Enregistrement d'un dépassement de vitesse détecté, qui se traduit par la création d'une infraction associée.
Consultation des infractions d'un propriétaire spécifique, permettant à ce dernier de visualiser les infractions liées à ses véhicules.

## L'architecture technique du projet
![image](https://github.com/salma-SABROU/backEnd-RaddarApp/assets/129564311/0f16c737-c2af-4be3-a5c4-3a33d602354d)

## Le diagramme de classe global du projet
![image](https://github.com/salma-SABROU/backEnd-RaddarApp/assets/129564311/841e8070-dfc8-4355-9de3-d1929207a5f6)
Le système distribué basé sur les micro-services décrit dans ce rapport vise à automatiser et faciliter la gestion des infractions liées aux dépassements de vitesse détectés par des radars automatiques. En permettant la coordination entre les micro-services de gestion des radars, d'immatriculation des véhicules et des infractions, le système offre une solution complète pour la gestion efficace de ce processus.
