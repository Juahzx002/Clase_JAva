# MiProyectoJava

Proyecto Java de ejemplo con una clase `App` en `src/App.java`.

Contenido:
- Código fuente en `src/`
- Archivos compilados en `bin/` (no rastreados)

Cómo compilar y ejecutar (Windows PowerShell):

```powershell
javac -d bin src\App.java
java -cp bin App
```

Cómo subir a GitHub:

1. Crear un repositorio en https://github.com (por ejemplo `MiProyectoJava`).
2. Enlazar el remoto y empujar:

```powershell
git remote add origin https://github.com/TU_USUARIO/MiProyectoJava.git
git branch -M main
git push -u origin main
```

Reemplaza la URL por la de tu repositorio y proporciona credenciales (o token) cuando se solicite.
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
