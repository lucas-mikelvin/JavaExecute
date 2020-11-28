#!/bin/bash

echo "Verificando se possue java"

which java | grep -q /urs/bin/java

if [[ $? = 0 ]]
	then
	echo "OK"
	echo "Executando arquivo java"
	java -jar projeto-ac3-1.0-SNAPSHOT-jar-with-dependencies.jar
else	
	echo "Java não encontrado"
	echo "Instalando o java"
	sudo apt install curl
	curl -s "https://get.sdkman.io" | bash
	source "$HOME/.sdkman/bin/sdkman-init.sh"
	sdk install java 8.0.272.j9-adpt
	echo "Executando o java"
	java -jar projeto-ac3-1.0-SNAPSHOT-jar-with-dependencies.jar	 	
fi


