# Fitness of an Expression Calculator
This program reads in a data set comprised of inputs and outputs, generates random mathematical expressions, and determines which randomly generated expression best fits the data set. To do this, a "fitness" score is calculated for each expression by using the equation ***(actual - expected)^2*** for each row of data and adding all of these values together. The expression with the lowest fitness score is determined the "most fit" for the data set and is outputted to the user.

# Instructions
This program is run from the "TestGeneration" class. The user is immediately prompted to enter the file path of the data set they want to open. Once the file is found, the program then reads in the data set and generates 500 mathematical expressions that are immediately evaluated to determine which best fits the data. Once all generated expressions are evaluated, the best mathematical expression is outputted to the screen alongside its fitness score.
