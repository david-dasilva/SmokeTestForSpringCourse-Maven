# Smoke Test

Ceci est un projet Spring Boot minimal servant à vérifier que vous êtes prêt à suivre la formation.

Merci de suivre ces étapes : 
1. Clonez ou téléchargez ce projet sur votre PC (via le bouton `< > Code` vert sur Github)
2. Importez le projet dans votre IDE.\
    Sur IntelliJ : `File -> New -> Project from existing sources` et sélectionnez le fichier `build.gradle` avant de valider.
3. Lancez l'application depuis votre IDE. \
   Sur Intellij, vous devriez voir la mention "SmokeTestApplication" en haut a droite, appuyez sur le bouton "Play" vert. Si ce n'est pas le cas, ouvrez le fichier *SmokeTestApplication* située dans `src/main/java/com.zenika.smoketest` et cliquez sur l'un des boutons "play" verts qui sont dans la marge. 
4. Si vous voyez s'afficher
```
   ____  _  __
  / __ \| |/ /
 | |  | | ' /
 | |  | |  <
 | |__| | . \
  \____/|_|\_\
```
C'est que vous êtes prêt.

Si vous avez une erreur, se référer au paragraphe suivant.

## Troubleshooting

Si ce test échoue il peut y avoir plusieurs raisons :

1. Votre IDE n'a pas réussi à télécharger les dépendances :

   Cela est dû le plus souvent à une configuration Maven propre à votre entreprise. \
   Regardez s'il existe un fichier `~/.m2/.settings.xml` dans votre répertoire personnel (le dossier `.m2` est un dossier caché).\
    Si c'est le cas, renommez-le en `settings.xml.backup` pour qu'il ne soit pas utilisé le temps de la formation.

    A noter : Certains proxy d'entreprise redirigent les appels à mvnrepository.com vers leurs propre repository Maven. Dans ce cas le mieux est de ne pas utiliser le réseau de l'entreprise si cela est possible. (wifi différent, pas de VPN)

2. Vous n'avez pas renseigné de SDK pour le projet.

   Votre IDE vous indiquera clairement qu'il ne sait pas quel SDK utiliser et comment le renseigner. Il vous faut au minimum le SDK java en version 17.


**Si le problème persiste où si vous ne savez pas comment appliquer ces instructions, merci de contacte votre formateur avant le début de la formation.**