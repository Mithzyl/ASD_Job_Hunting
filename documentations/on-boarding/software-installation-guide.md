# Software Installation Guide

If you already have the necessary software - as outlined in the monorepository root's [README](../../README.md) - and have previous familiarity with them, you _can_ skip this section - but it's recommended to at least skim through the following sections.


## Java 

[install Java] https://mkyong.com/java/how-to-install-java-jdk-on-ubuntu-linux/

## Maven

[install Maven] https://maven.apache.org/install.html


## commitizen

Install commitizen
`npm install -g commitizen`

Install the commitizen adapter
`npm install -g cz-conventional-changelog`

Configure the commitizen adapter
`echo '{ "path": "cz-conventional-changelog" }' > ~/.czrc`

You should now be able to run commitizen anywhere by simply typing
`git cz`
which should serve as a more user friendly way of running `git commit`.
