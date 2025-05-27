# 🐍 Snake Game (version solo)

Une version moderne du célèbre jeu **Snake**, codée en Java avec Swing.  
Déplace ton serpent, mange des pommes, et essaie de survivre le plus longtemps possible sans te mordre la queue !

---

## 🎮 Règles du jeu

- Le serpent commence à se déplacer automatiquement.
- À chaque pomme mangée, il grandit d’un segment.
- Le jeu se termine si le serpent entre en collision avec lui-même ou avec les bords de l’écran.

---

## 💻 Installation & Exécution

### 🔁 1. Cloner le dépôt

```bash
git clone https://github.com/ton-utilisateur/snakegame.git
cd snakegame
```

### ⚙️ 2. Compiler les fichiers Java

Assure-toi d’avoir Java installé (`java -version` pour vérifier).

```bash
javac src/snakegame/*.java
```

### ▶️ 3. Lancer le jeu

```bash
java -cp src snakegame.Game
```

---

## 🎮 Contrôles

- **↑** : Aller en haut  
- **↓** : Aller en bas  
- **←** : Aller à gauche  
- **→** : Aller à droite  

(Nécessite un clavier avec touches fléchées.)

---

## 📁 Structure du projet

```
snakegame/
├── src/
│   └── snakegame/
│       ├── Game.java
│       ├── GamePanel.java
│       ├── MyKeyAdapter.java
│       └── assets/
│           ├── pomme.png     # Image personnalisée pour la pomme
│           └── fond.png      # Image de fond du jeu
├── README.md
```

---

## ✨ Personnalisation

Tu peux remplacer les fichiers `fond.png` et `pomme.png` par tes propres images.  
Taille recommandée :
- `fond.png` : **600x600 px**
- `pomme.png` : **25x25 px**

---
