echo "Le chemin absolu de mon répertoire courant est " $(pwd)
echo "Le résultat de la commande whoami est "$(whoami)
echo "Le produit de 33 par 17 vaut " $((33 * 17))
echo "Il a agi " anti{constitutionnellement,conventionnellement,socialement}"."
echo "Les caractères latins sont " {a..z}

MARY="supercalifragilisticexpialidocious"
echo ${#MARY}
echo ${MARY:9}
echo ${MARY:9:6}
echo ${MARY#super}
echo ${MARY#cali}
echo ${MARY%docious}
echo ${MARY/expiali/...}
echo ${MARY/expialif/...}
