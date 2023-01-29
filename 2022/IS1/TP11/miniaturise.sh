#! /usr/bin/env bash

if ([[ -e $1 ]] && [[ $# == 1 ]])
  then
    if [[ $(dirname $1) == $(pwd) ]]
      then
        if [[ $(file -b $1 | grep image > /dev/null ; echo $?) == 0  ]]
          then
            mkdir Miniatures 2> /dev/null
            if [[ -d Miniatures ]]
              then
                convert -thumbnail "100x100" $1 $(dirname $1)'/Miniatures/mini_'$(basename $1)
                exit 0
              else
                echo "Miniatures aldreay exist and is not a dir."
                exit 4
              fi
          else
            echo "File is not an img !"
            exit 3
        fi
      else
        echo "File is not in working dir !"
        exit 2
    fi
  else
    echo "Only one file please :("
    exit 1
fi
