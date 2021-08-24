# INSTALAÇÃO DE REQUISITOS DO PROJETO

## Instalar o JDK (jdk-16.0.1_windows-x64_bin)
	- link para download : https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

## Copiar pasta "javafx-sdk-11.0.2" em C:/
	- link para download : https://gluonhq.com/products/javafx/
	- Verificar se o caminho está correto no arquivo .vscode > launch.json:
		"vmArgs": "--module-path C:/javafx-sdk-11.0.2/lib --add-modules=javafx.controls,javafx.fxml"