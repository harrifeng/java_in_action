#!/bin/bash
if [ -d build ]
then
cd build/classes
else
cd ../build/classes
fi

echo "--------Begin----------"
echo
java lang/tij4/$1
echo
echo "--------End------------"
cd -
