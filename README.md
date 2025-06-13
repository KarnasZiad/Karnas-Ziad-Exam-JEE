# Projet Gestion des Crédits Bancaires – Full Stack

Ce projet est une application complète de gestion des crédits bancaires, composée d’un backend Spring Boot (Java) et d’un frontend Angular.

## Structure du projet

- `src/` : Code source du backend Spring Boot
- `frontend/credit-app/` : Application frontend Angular
- `README.md` : Documentation racine (ce fichier)

## Fonctionnalités principales
- Gestion des clients (CRUD)
- Gestion des crédits et remboursements
- Visualisation et gestion des données via une interface web moderne

## Démarrage rapide

### 1. Backend (Spring Boot)
- Prérequis : Java 17+, Maven
- Lancer depuis la racine :
  ```powershell
  .\mvnw.cmd spring-boot:run
  ```
- L’API REST sera disponible sur `http://localhost:8080`

### 2. Frontend (Angular)
- Prérequis : Node.js, npm
- Aller dans le dossier frontend :
  ```powershell
  cd frontend/credit-app
  npm install
  ng serve
  ```
- L’application sera accessible sur `http://localhost:4200`

## Lien entre backend et frontend
Le frontend Angular consomme l’API REST exposée par le backend pour afficher et gérer les clients, crédits et remboursements.

## Auteurs
- Projet pédagogique – 2025

## Ressources complémentaires
- Voir les README spécifiques dans `frontend/credit-app/` et à la racine backend pour plus de détails sur chaque partie.