#! /usr/bin/env bash
WD=$(pwd)
for i in $($WD/liste_images.sh $1)
do
  cp $i $2/
  cd $2
  $WD/miniaturise.sh $2/$(basename $i)
  rm $2/$(basename $i)
done
