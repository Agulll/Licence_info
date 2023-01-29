#!/bin/bash

repImages=$1
repIcones=$2
index=$repIcones/miniatures.html

./cree_miniatures.sh "$@" || exit 1

echo "<html>
<head><title>Mes miniatures</title></head>

<body><table><tr>" > $index

cpt=0

for img in $repIcones/Miniatures/*
do 
  image=$(basename $img)
  if [[ $cpt == 10 ]]
  then
    echo "</tr><tr>" >> $index
    cpt=0
  fi
  echo "<td>
<table><tr><td><a href=\"$repImages/${image#mini_}\"><img src=Miniatures/$image></a></td></tr>
<tr><td><font size=\"2pt\">${image#mini_}</font></td></tr></table>
</td>" >> $index
	cpt=$(($cpt + 1))
done

echo "</tr></table>
</body></html>" >> $index
