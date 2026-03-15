# TP1 – Java Programmation Orientée Objet

TP réalisé dans le cadre du module **Java Orienté Objet**.

**Université Cadi Ayyad**  
**École Nationale des Sciences Appliquées de Safi (ENSA Safi)**  
Filière : **GIIA**

Ce projet contient l’implémentation de plusieurs exercices permettant de pratiquer les concepts fondamentaux de la **programmation orientée objet en Java**.

---

## Objectifs du TP

Ce TP a pour objectif de mettre en pratique les notions suivantes :

- Création de **classes et objets**
- Utilisation des **attributs et méthodes**
- Implémentation de **constructeurs**
- Utilisation des **getters et setters**
- Manipulation des **tableaux d’objets**
- Organisation et structuration du code en Java

---

## Contenu du TP

### Exercice 1 – Classe Personne

Implémentation d’une classe `Personne` avec les attributs :

- CIN
- Nom
- Prénom
- Email
- Age

Fonctionnalités :

- Méthode `initialiser()` pour initialiser les informations d’une personne
- Méthode `afficherPersonne()` pour afficher les informations
- Classe `Main` pour tester l’utilisation de la classe

---

### Exercice 2 – Classe Point

Création d’une classe `Point` caractérisée par :

- `nom` (char)
- `abscisse` (double)

Méthodes implémentées :

- `initialiser(nom, abscisse)`
- `initialiser(Point autrePoint)`
- `affiche()`
- `translate(double valeur)`

Un programme de test permet de créer un point, d’afficher ses caractéristiques, de le déplacer puis d’afficher les nouvelles coordonnées.

---

### Exercice 3 – Classe Point avec constructeur

Nouvelle implémentation de la classe `Point` avec :

- un **constructeur**
- la méthode `affiche()`
- la méthode `translate()`

Un programme de test permet de manipuler les objets créés.

---

### Exercice 4 – Gestion de livres

Implémentation de deux classes :

#### Classe `Livre`

Attributs :

- titre
- auteur
- nombre de pages
- prix

Fonctionnalités :

- Deux **constructeurs**
- Méthodes **getters et setters**
- Méthode `toString()` pour afficher les informations du livre
- Gestion du **prix fixe** (le prix ne peut être défini qu’une seule fois)
- Méthode `compare()` pour comparer deux livres selon leur nombre de pages

#### Classe `Etagere`

Classe représentant une étagère contenant plusieurs livres.

Fonctionnalités :

- Stockage des livres dans un **tableau**
- Ajouter un livre
- Récupérer un livre par position
- Chercher un livre par **titre et auteur**
- Supprimer un livre
- Connaître le nombre de livres présents et la capacité de l’étagère

---

## Technologies utilisées

- Java
- IntelliJ IDEA
- Programmation Orientée Objet (POO)

---

## Auteur

**Meryem Samgaz**  
Étudiante en 2ᵉ année d’ingénierie  
ENSA Safi – Université Cadi Ayyad
