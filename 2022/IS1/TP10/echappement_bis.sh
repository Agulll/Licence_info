TOTO=whoami
echo "J’aime bien utiliser la commande "'"'"$TOTO"'"'"""."
echo "Ma variable "'$TOTO'" contient ’whoami’."
echo "Mon login est $(whoami)"
echo "La commande d’aujourd’hui est "'\whoami\.'
echo "${TOTO/ami/areyou}, c’est une commande imaginaire !"
