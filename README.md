# Projet TPRecyclerViewListeEtudiant

## Description

Ce projet Android permet de gérer et d'afficher une liste d'étudiants en utilisant un `RecyclerView` et des `Fragments` pour afficher la liste et les détails des étudiants. Il utilise **ViewModel**, **LiveData**, et **DataBinding** pour la gestion de l'interface utilisateur et des données. L'application permet de récupérer des données d'étudiants via une API et d'afficher des images à partir d'URLs en utilisant **Glide**.

## Fonctionnalités

- **Liste des étudiants** : Affichage des étudiants dans un `RecyclerView` avec leurs noms, âges, et images.
- **Détails d'un étudiant** : Lorsque l'utilisateur clique sur un étudiant, ses détails (nom, âge, photo) sont affichés dans un autre fragment.
- **Affichage des images avec Glide** : Utilisation de la bibliothèque **Glide** pour charger les images des étudiants depuis des URLs.
- **Gestion des données avec ViewModel** : Utilisation de `ViewModel` pour partager des données entre les fragments et maintenir l'état de l'interface.

## Structure du projet

- **Fragments** :
  - `Main`: Affiche la liste des étudiants dans un `RecyclerView` et permet de sélectionner un étudiant pour voir ses détails.
  - `DetailEtudiant`: Affiche les détails d'un étudiant sélectionné, comme son nom, âge et photo.
  
- **ViewModel** :
  - `DataViewModel`: Gère la liste des étudiants.
  - `DataViewModelDetail`: Gère les détails de l'étudiant sélectionné.

- **Binding Adapter** :
  - `loadImageUrl`: Un adaptateur de liaison (`BindingAdapter`) pour charger les images des étudiants à partir d'URLs en utilisant **Glide**.

## Prérequis

- Android Studio
- Kotlin
- Android SDK
- Dépendance Glide dans le fichier `build.gradle` :

```gradle
dependencies {
    implementation 'com.github.bumptech.glide:glide:4.13.0'
    kapt 'com.github.bumptech.glide:compiler:4.13.0'
}

