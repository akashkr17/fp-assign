# Overview

### Project Based on Functional Programming
###### In this project there is example of Open-Closed Principle,Liskov Substitution Principle,Interface segregation Principle based on Functional Programming.

## What is Functional Programming
   Functional programming is a declarative programming paradigm where programs are created by applying sequential functions rather than statements.
   
# Requirements
##### 1.scala 2.13.6
##### 2. sbt 1.3.8
##### 3. IDE


# Installation of Sbt and scala
#### 1.You must first install a JDK. We recommend AdoptOpenJDK JDK 8 or JDK 11.

#### 2.Next, install Sbt by typing the following commands:

```bash
echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | sudo tee /etc/apt/sources.list.d/sbt.list
echo "deb https://repo.scala-sbt.org/scalasbt/debian /" | sudo tee /etc/apt/sources.list.d/sbt_old.list
curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | sudo apt-key add
sudo apt-get update
sudo apt-get install sbt
```
#### 3.Verify the installation by running command:
```bash
sbt sbtversion
```

# Usage

#### 1. Clone the project.
```bash
git clone https://github.com/akashkr17/designPattern-assign.git
```
#### 2. Run the class file inside different packages.
