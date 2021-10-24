# CS 210 LAB 08: Decorator Pattern and Pumpkin Spice

We are going to continue working on the Starbuzz Coffee example from our lecture and the Head First Design Patterns book.

Clone a copy of this repository to your development computer, and review the provided source code.  The project should compile, and you should be able to see a working example of the Decorator Pattern in action.

Once you verify the project is working for you, do the following:

1. Create a new class named PumpkinSpice - this will be a new condiment, and should follow the example of other condiment classes in the project, extending CondimentDecorator and overriding the getDescription() and cost() methods.  PumpkinSpice should be a $0.50 condiment.
2. In the main() method of the StarBuzzCoffee class, create a new beverage for a Pumpkin Spice Latte, assembling the drink following the Decorator Pattern convention, as follows:
+ Start with Espresso as the base.
+ Add in Milk
+ Add in PumpkinSpice
+ Add in Whip
+ Print out the final cost
