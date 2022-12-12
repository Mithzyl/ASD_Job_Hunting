# Job Hunting Applications

## Introduction

This is the monorepository for the Job Hunting Applications solution. It could be service portal for Job Hunting Application solution and eventually the newer reliable application .

## Software

### Requirements

Described below is an overview of the necessary software for working with this repository. See the [Software Installation Guide](documentation/on-boarding/software-installation-guide.md) for what they do, how to install and configure them.

- `Java version: 18.0.2.1` for developers running Windows.
- `Apache Maven 3.8.6` dependency management tool for installing libary and building executable jar code.

### On the choice of editor or IDE

`IntelliJ IDEA 2022.2.3 (Ultimate Edition)` (or later) is the recommended editor for easily and seamlessly working in this repository. It can be downloaded from [their website](https://www.jetbrains.com/idea/download/#section=linux/).

**Running Windows?** not tested in windows but tested in linux.

## Repository Structure

```
.
├── README.md               # This README file :-)
├── src/main/com.group8     # Folder for source code projects (i.e., microservices).
├── src/test/com.group8     # Folder for unit testing and integration testing.
├── Makefile            # automaion tool for compile soruce code.
```

## Building and deploying
* make clean to delete jar file. 
* make build to create jar file. 
* The jar file is located in target folder. 

* See the following documents:

1. Need to write document again? 👉 [Walkthrough: Building and deploying](./documentation/on-boarding/walkthrough-building-and-deploying.md)

## Way of Working

See the [Way of Working](./documentation/way-of-working/way-of-working.md) document for how work is done from start to finish.

## Troubleshooting

See the [Troubleshooting](./documentation/troubleshooting/troubleshooting.md) document for common issues and errors.

## Miscellaneous

Not all available documents and diagrams are linked to from this `README` file. Don't forget that we have a [documentation](./documentation/) folder storing all this!
