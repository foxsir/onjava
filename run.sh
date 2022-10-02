#!/usr/bin/env bash

if [[ $1 = 'A' || $1 = 'a' ]]
then
  gradle advanced:run
else
  gradle base:run
fi
