TD: Application Distrubées:Ali El Rida Barakeh (Readme)
Pour pouvoir faire connecter aux JDBC:
 1)on install le JDBC propre pour mssql d’apres le site de Microsoft.
 2) Dans vscode quand on cree un projet, on ajout les jar files de mssql dans“Referenced libraries”.
 3) On ecrit le code java demandé avec une database que j’avais deja depuis le cours de base de deonne relationelles(HR)
 4)on configure les parametres comme en respectant les parametres qu’on a(exemple Ali-PC/MSSQLSERVER02 nom du serveur,+ nom de la base de donne + integrated security=true , trustServerCertificate=true pour le bypass de ssl.

Step1: Create Java Project
 
Step2:No build tools , on ajoute le nom apres puis Enter
 
Step3: Ajouter les jar files dans referenced libraries
 
Step4:Connecter au MSSQL SERVER+ code java avec vos propre parametre 
 
Apres beaucoup d’erreur , concernant la connection d’ou j’ai eu plusieurs erreurs:
1) Enable server browser service(turned off by default) 
2) Enable TCP/IP for the desired server.(mon cas: MSSQLSERVER02)
Le dernier erreur c’etait l’auth file qui n’est pas ajouté au path.J’ajout le path de dll file pur la certification et voila JDBC est etablie. Et je le resultat de la query dans vscode.
     


 
