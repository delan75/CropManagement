# CropManagement

Java OOP revision project based on Question 7 of an Information Technology paper. The code focuses mainly on Q7.8, where an array class stores `Farm` objects and determines which farm is the most expensive to operate.

## What This Project Demonstrates

- Encapsulation with private fields
- Accessor and mutator methods
- Constructors
- Composition: a `Farm` object contains two `Crop` objects
- Object arrays
- A corrected `findMostExpensive()` method based on the Q7.8 algorithm

## Project Structure

```text
CropManagement/
+-- pom.xml
+-- README.md
+-- src/
    +-- main/
        +-- java/
            +-- com/
                +-- mycompany/
                    +-- cropmanagement/
                        +-- Crop.java
                        +-- Farm.java
                        +-- FarmArray.java
                        +-- CropManagement.java
```

## Classes

`Crop.java`

Represents one crop. It stores the crop name, seed cost, number of seed packs bought, and calculates the total cost of growing that crop.

`Farm.java`

Represents one farm. Each farm has a name, area, dam status, and two crops. It calculates the total cost of growing both crops.

`FarmArray.java`

Stores an array of `Farm` objects. This is the main class linked to Q7.8. It includes the sample farm data and the corrected `findMostExpensive()` method.

`CropManagement.java`

The main class. Run this file to test the program.

## Clone the Repository

```bash
git clone https://github.com/delan75/CropManagement.git
cd CropManagement
```

## Run in NetBeans

1. Open NetBeans.
2. Select `File > Open Project`.
3. Choose the cloned `CropManagement` folder.
4. Wait for NetBeans to load the Maven project.
5. Open `src/main/java/com/mycompany/cropmanagement/CropManagement.java`.
6. Right-click the file and select `Run File`, or click the green Run button.

## Run in Another IDE

This is a standard Maven Java project, so it can also be opened in IntelliJ IDEA, Eclipse, or VS Code.

1. Open the cloned `CropManagement` folder in your IDE.
2. Make sure the project SDK/JDK is set to Java 8 or later.
3. Run the `main` method in `CropManagement.java`.

## Run from the Command Line

If Maven is installed:

```bash
mvn compile
mvn exec:java
```

If Maven is not installed, compile and run manually:

```bash
javac -d target/classes src/main/java/com/mycompany/cropmanagement/*.java
java -cp target/classes com.mycompany.cropmanagement.CropManagement
```

## Expected Output

The program prints the farm details and then displays:

```text
Most expensive farm: Moonshine Farm
Most expensive cost: R409680.00
```

## Teaching Note

In Q7.8, the incorrect algorithm assigns the values the wrong way around:

```text
farmCost <- biggestCost
```

The corrected logic should update `biggestCost` when a larger `farmCost` is found:

```text
biggestCost <- farmCost
```

In the code, this correction is implemented in `FarmArray.findMostExpensive()`.

Also note: the question paper data lists Cabbage as `20000` packets, but the supplied calculation `362 850,00` only matches `30000` packets. This project uses `30000` so that the code matches the calculation and expected Q7.8 trace result.
