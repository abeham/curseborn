# Curseborn Mod
A NeoForge Minecraft mod that adds cursed elements to your world.

## Setup

For setup instructions please see the [forge documentation](https://docs.neoforged.net/). 

## Building

To build the mod, run `./gradlew build` in the project root.

## Running

To run the mod in a development environment:
- Client: `./gradlew runClient`
- Server: `./gradlew runServer`
- Data Generation: `./gradlew runData`

## Development

This mod is built using NeoForge for Minecraft 1.21.1. The main mod class is located at `src/main/java/com/curseborn/curseborn/Curseborn.java`.

### Project Structure

- `src/main/java/` - Java source code
- `src/main/resources/` - Resources including textures, models, and data
- `src/main/resources/META-INF/neoforge.mods.toml` - Mod metadata
- `build.gradle` - Build configuration
- `gradle.properties` - Project properties
