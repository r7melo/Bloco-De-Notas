# INSTALAÇÃO DE REQUISITOS DO PROJETO

## Instalar o JDK (jdk-16.0.1_windows-x64_bin)
	- link para download : https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

## Copiar pasta "javafx-sdk-11.0.2" em C:/
	- link para download : https://gluonhq.com/products/javafx/
	- Verificar se o caminho está correto no arquivo .vscode > launch.json:
		"vmArgs": "--module-path C:/javafx-sdk-11.0.2/lib --add-modules=javafx.controls,javafx.fxml"
		OBS: Quando o projeto e executado pela primeira vez, uma nova configuração em .vscode > launch.json 
		é adicionada, entao adicionar essa linha na ultima configuração.
		
## Extenções utilizadas:
	- vscjava.vscode-java-pack
	- youmaycallmev.vscode-java-saber
	- shrey150.javafx-support
