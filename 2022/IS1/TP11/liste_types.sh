#! /usr/bin/env bash

for i in *
do echo $i "est de type :" $(file -b $i)
done
