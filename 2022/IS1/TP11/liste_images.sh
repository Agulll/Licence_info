#! /usr/bin/env bash

for i in $1/*
do
  if [[ $(file -b $i | grep image > /dev/null ; echo $?) == 0 ]]
    then echo $i
  else
    if [[ -d $i ]]; then
      $0 $i
    fi
  fi
done
