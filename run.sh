#!/usr/bin/env bash

GREEN=`tput setaf 40`
BLUE=`tput setaf 45`

clear

echo -e "$GREEN";
echo "--------"
echo "defaulted run base part"
echo "param A or a, to run advanced part"
echo "--------"
echo -e "$GREEN";

if [[ $1 = 'A' || $1 = 'a' ]]
then
  echo -e "${BLUE}run advanced part"
  gradle advanced:run
else
  echo "${BLUE}run base part"
  gradle base:run
fi
